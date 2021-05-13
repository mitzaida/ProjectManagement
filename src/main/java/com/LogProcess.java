package com;

import java.io.*;

public class LogProcess {

    public static void main(String[] arg) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("c:\\Dev\\prueba.txt");
            pw = new PrintWriter(fichero);


            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File("C:\\Dev\\archivo.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                if (
//                        linea.contains("SpeechToTextTranslatorImproved - 8589") &&
//                                (
//                        linea.contains("## transcript     ##") ||
//                                linea.contains("## fromIndex      ##") ||
//                                linea.contains("## lastTranscript ##") ||
                                linea.contains("## Full Injected Transcript ###") ||
//                                linea.contains("## Injected transcript  # es-ES#")
//                                linea.contains("## Injected transcript  # fr-FR#")
                                linea.contains("## Injected transcript  #")
                )
                    if (linea.contains("#")) {
//                        pw.println(linea.substring(linea.lastIndexOf("#") + 1));
                        pw.println(linea.substring(linea.lastIndexOf("  ##") + 4));
                    }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para
                // asegurarnos que se cierra el fichero.
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

}
