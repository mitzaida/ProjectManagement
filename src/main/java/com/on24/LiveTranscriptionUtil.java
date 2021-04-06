package com.on24;


import java.io.FileInputStream;
import java.io.IOException;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Properties;


/**
 * Created by swati.shaw on 12/5/2019.
 */
public class LiveTranscriptionUtil {

    private static Properties props = null;
    private final static String propFileName = "Ruta_N_M-Learning";
    private static DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    public static Properties getProperties() {
        if (props != null){return props;}

        props = new Properties();
        String propFile = System.getProperty(propFileName);
        if (propFile == null) {
            System.out.println(propFileName + " is not specified");
        } else {
            try {
                FileInputStream inStream = new FileInputStream(propFile);
                props.load(inStream);
                inStream.close();
            } catch (Exception e) {
                props.clear();
                e.printStackTrace();
            }
        }
        return props;
    }
}
