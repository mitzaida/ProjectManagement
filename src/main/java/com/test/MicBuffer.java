package com.test;

import com.google.api.gax.rpc.StreamController;
import com.google.protobuf.ByteString;

import javax.sound.sampled.TargetDataLine;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


// Microphone Input buffering
class MicBuffer implements Runnable {

    public static final String YELLOW = "\033[0;33m";

    // Creating shared object
    private static volatile BlockingQueue<byte[]> sharedQueue;
    private static TargetDataLine targetDataLine;
    private static int BYTES_PER_BUFFER = 6400; // buffer size in bytes

    public MicBuffer(TargetDataLine targetDataLine, BlockingQueue<byte[]> sharedQueue ) {
        this.targetDataLine=targetDataLine;
        this.sharedQueue=sharedQueue;
    }


    @Override
    public void run() {
        System.out.println(YELLOW);
        System.out.println("Start speaking...Press Ctrl-C to stop");
        targetDataLine.start();
        byte[] data = new byte[BYTES_PER_BUFFER];
        while (targetDataLine.isOpen()) {
            try {
                int numBytesRead = targetDataLine.read(data, 0, data.length);
                if ((numBytesRead <= 0) && (targetDataLine.isOpen())) {
                    continue;
                }
                sharedQueue.put(data.clone());
            } catch (InterruptedException e) {
                System.out.println("Microphone input buffering interrupted : " + e.getMessage());
            }
        }
    }
}
