package com.arraysoperations;
import javax.swing.*;
import java.util.*;
import java.lang.System;

public class ArrayExamples {

    private String s;

    public static void main(String[] args) {
        int myArrayUno[][];

        myArrayUno = new int[4][];

        myArrayUno[0] = new int[5];
        myArrayUno[1] = new int[2];
        myArrayUno[2] = new int[8];
        myArrayUno[3] = new int[1];

        myArrayUno[0][4] = 12;

        //myArrayUno [3] [6] = 36;

        int longPrimeraDimension = myArrayUno.length;
        int longDimension = myArrayUno[0].length;
        int longDimensionSegundoIndice = myArrayUno[1].length;

        //System.out.println(myArrayUno[0][4]  +" " + myArrayUno [3] [6]);
        System.out.println(longPrimeraDimension + " " + longDimension + " " + longDimensionSegundoIndice);
        System.out.println(myArrayUno[2].length);
        System.out.println(myArrayUno[3].length);


        String myArray[] = new String[3];
        Scanner entrada1 = new Scanner(System.in);

        System.out.println("La length del myArray es : " + myArray.length + "\n");

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("entrada1 veamos...El índice es: " + i);
            myArray[i] = entrada1.nextLine();
        }

        System.out.println("terminó de llenar el array using Scanner, ahora lo imprimo a continuación: ");

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        System.out.println(" ");


                            // NO SE PUEDE DENTRO DE UN FOR, COLOCAR EL JOPTIONPANE.SHOWINPUTDIALOG  //

        int myArray2[] = new int[2];
        int entrada2 = Integer.parseInt(JOptionPane.showInputDialog("Ahora esto es JPtionpane.....  Introduce algo: "));
        String entrada3 = JOptionPane.showInputDialog("Ahora esto es JPtionpane.....  Introduce algo: ");

        // Compila pero se queda en un loop i guess because no puede hacer el show de la ventana y captura y captura
        // y nunca para el JOptionpane
        for (int i = 0; i < myArray2.length; i++) {
          //  myArray2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ahora esto es JPtionpane.....  Introduce algo: "));
            myArray2[i] = Integer.parseInt(entrada3);
            continue;

            //myArray2[i] = entrada2;

            //System.out.println(myArray2[i]);
        }

        for (int i = 0; i < myArray2.length; i++) {
            System.out.println(myArray2[i]);
        }
        System.out.println(" ");


    }
}
