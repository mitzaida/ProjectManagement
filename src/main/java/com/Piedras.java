package com;

import javax.sound.sampled.TargetDataLine;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Piedras {
    // Vars de la Clase
    private static final BlockingQueue blockMz1 = new LinkedBlockingQueue();
    private static TargetDataLine targetDataline ;
    private static int BYTES_PER_BUFFER = 6400;


    public static void main(String [] args) {
        System.out.println("\033\033");
        System.out.println("\033");
        System.out.println("\033[0;33m"); // no se qué hace, de hecho no veo que se ejecute al ponerle el tiempo
        System.out.println("\033[0;34m"); // sin los corchetes si se ejecuta.


    }
}
