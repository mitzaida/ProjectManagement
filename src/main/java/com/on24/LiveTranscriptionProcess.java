package com.on24;

import java.util.Properties;

public class LiveTranscriptionProcess {

    Properties properties = LiveTranscriptionUtil.getProperties();
    String myproperty = properties.getProperty("dbport");
    private Integer capacity = Integer.parseInt(myproperty);


    public static void main(String[] args) {
        LiveTranscriptionProcess algo1 = new LiveTranscriptionProcess();

        System.out.println("Que: "+algo1.capacity);
    }

}
