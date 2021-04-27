package com.rutasMatrix;

import javax.swing.*;
import java.lang.reflect.Array;

public class RutaDrone {
    static boolean seguir = false;
    static boolean mover = false;

    public static void main(String[] args) {
        // La 1ra dimensión son para mi visualmente las columnas. Y la 2da dimensión visualmente para mi son filas.
        int filas    = Integer.parseInt(JOptionPane.showInputDialog("Introduce Cantidad de Filas: "));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("Introduce Cantidad de Columnas: "));

        // Punto exacto donde iniciará el Drone y punta final donde llegará.
        int puntoFilaInicio    = Integer.parseInt(JOptionPane.showInputDialog("Introduce Fila de Inicio del Drone: "));
        int puntoColumnaInicio = Integer.parseInt(JOptionPane.showInputDialog("Introduce Columna Inicio del Drone: "));

        int puntoFilaFinal    = Integer.parseInt(JOptionPane.showInputDialog("Introduce Fila Final donde se detendrá el Drone: "));
        int puntoColumnaFinal = Integer.parseInt(JOptionPane.showInputDialog("Introduce Columna Final a detenerse el Drone: "));


        validaEntradas(filas, columnas, puntoFilaInicio, puntoColumnaInicio, puntoFilaFinal, puntoColumnaFinal);

        if (seguir==false) {
            System.out.println("Salgo del main x error en filas o columnas.");
            return;
        }


        cargaPrintMatriYX( filas, columnas, puntoFilaInicio, puntoColumnaInicio, puntoFilaFinal, puntoColumnaFinal);

        procesarMatrixDos(filas, columnas, puntoFilaInicio, puntoColumnaInicio, puntoFilaFinal, puntoColumnaFinal);

        //moverDrone( filas, columnas, puntoFilaInicio, puntoColumnaInicio, puntoFilaFinal, puntoColumnaFinal);


    }  // Fin M. Main.


    // ***************************************************************
    public static boolean validaEntradas(int filas, int columnas, int puntoFilaInicio, int puntoColumnaInicio,
                                         int puntoFilaFinal, int puntoColumnaFinal) {

        //boolean seguir = false;
        if (filas <= 0 || columnas <= 0 || puntoFilaInicio > filas || puntoFilaFinal > filas ||
                puntoColumnaInicio > columnas || puntoColumnaFinal > columnas) {
            seguir = false;
            System.out.println("Error en filas  o columnas,");
            return seguir;
        } else {
            seguir = true ;
        }
        return seguir;
    }  // Fin M. validaEntradas


    // ***************************************************************
    //public static boolean cargaPrintMatrixDos(int filas, int columnas, int puntoFilaInicio, int puntoColumnaInicio,
      public static void procesarMatrixDos(int filas, int columnas, int puntoFilaInicio, int puntoColumnaInicio,
                                         int puntoFilaFinal, int puntoColumnaFinal) {

        String matrixDos [] [] = new String[columnas][filas];

        // Fill the matrix with ceros.
        for (int x=0; x < filas; x++) {
            for (int y =0 ; y < columnas ; y++) {
                matrixDos[y] [x] = y+","+x;
            }
        }

        // Print the matrix.
        System.out.println("  ");
        System.out.println("matrixDos llena en forma automática.");
        for (int x = 0; x < filas; x++) {
            System.out.println(" ");
            for (int y = 0; y < columnas; y++) {

                System.out.print(matrixDos[y][x] + "   ");
            }
        }
        System.out.println(" ");

        matrixDos[puntoColumnaInicio-1][puntoFilaInicio-1] = "I,I";
        matrixDos[puntoColumnaFinal-1][puntoFilaFinal-1] = "F,F";



        // 2da Print the matrix.
        System.out.println("  ");
        System.out.println("2da impresión de matrixDos indicando con una X las posiciones iniciales y finales del Drone.");
        for (int x=0; x < filas; x++) {
            System.out.println(" ");
            for (int y=0; y < columnas; y++) {
                System.out.print(matrixDos[y][x] + "   ");
            }
        }
        System.out.println(" ");

           int currentFila = puntoFilaInicio-1;
          // control the movements above and beloww
          if (puntoFilaFinal < puntoFilaInicio ) {
              //moverArriba();

              //for (int x = (puntoFilaInicio-1) ; x > (puntoFilaFinal-1) ; x--) {
              for (int x = (puntoFilaInicio-1) ; currentFila != (puntoFilaFinal-1) ; x--) {
                  matrixDos[puntoColumnaInicio-1][x] = "  x";
                  currentFila = x;
              }
          } else if (puntoFilaFinal > puntoFilaInicio) {

              //moverAbajo();
              //for (int x = (puntoFilaInicio-1) ; x < (puntoFilaFinal-1); x++) {
              for (int x = (puntoFilaInicio-1) ; currentFila != (puntoFilaFinal-1); x++) {
                  matrixDos[puntoColumnaInicio-1][x] = "  x";
                  currentFila = x;
              }
          }


          // control the movements izq and right
          int currentColum = puntoColumnaInicio-1;
          if (puntoColumnaFinal<puntoColumnaInicio) {
              // mover a la izq
              for (int y = puntoColumnaInicio-1 ; y > (puntoColumnaFinal-1); y--) {
                  matrixDos[y][currentFila] = "  x";
                  currentColum=y;
              }

              // mover a la derecha
          } else  if (puntoColumnaFinal > puntoColumnaInicio) {

              for (int y = puntoColumnaInicio-1 ; y < (puntoColumnaFinal-1); y++) {
                  matrixDos[y][currentFila] = "  x";
              }
          }
          System.out.println();


          // 3ra Print the matrix.
          System.out.println("  ");
          System.out.println("3ra impresión de matrixDos indicando con una X las posiciones iniciales y finales del Drone.");
          for (int x=0; x < filas; x++) {
              System.out.println(" ");
              for (int y=0; y < columnas; y++) {
                  System.out.printf(" %s ",matrixDos[y][x] + "   ");
              }
          }
          System.out.println(" ");



    } // Fin de procesarMatrixDos




    // ***************************************************************
    //public static boolean cargaPrintMatriYX(int filas, int columnas, int puntoFilaInicio, int puntoColumnaInicio,
    public static void cargaPrintMatriYX(int filas, int columnas, int puntoFilaInicio, int puntoColumnaInicio,
                                           int puntoFilaFinal, int puntoColumnaFinal) {

        String matriYX[][] = new String[columnas][filas];

//        String matriYX[][] = {
//                {"0,0", "1,0", "2,0", "3,0"},
//                {"0,1", "1,1", "2,1", "3,1"},
//                {"0,2", "1,2", "2,2", "3,2"},
//                {"0,3", "1,3", "2,3", "3,3"},
//                {"0,4", "1,4", "2,4", "3,4"},
//                {"0,5", "1,5", "2,5", "3,5"},
//                {"0,6", "1,6", "2,6", "3,6"}
//        };


        // Fill the matriYX
        for (int x=0 ; x < filas ; x++) {
            for (int y = 0; y < columnas; y++) {
                matriYX[y][x] = y + "," + x;
            }
        }

        // Print the matriYX - show columna,fila
        System.out.println("  ");
        System.out.println("matriXY llena en forma automática.");
        for (int x=0 ; x < filas ; x++) {
            System.out.println(" ");

            for (int y=0; y < columnas ; y++) {
                System.out.print(matriYX[y][x]+"   ");
            }
        }
        System.out.println(" ");



    }  // Fin M. cargaPrintMatriYX



    // ***************************************************************
    public static boolean moverDrone(int filas, int columnas, int puntoFilaInicio, int puntoColumnaInicio,
                                              int puntoFilaFinal, int puntoColumnaFinal) {

        int cantidadFilasRecorrer = puntoFilaInicio - puntoFilaFinal ;
        int cantidadColumnasRecorrer = puntoColumnaInicio - puntoColumnaFinal ;

        if (cantidadFilasRecorrer<0) {
            cantidadFilasRecorrer=cantidadFilasRecorrer * -1;
        } else if (cantidadColumnasRecorrer<0) {
            cantidadColumnasRecorrer = cantidadColumnasRecorrer * -1;
        }
        return mover;
    }


}  // Fin  Clase RutaDrone
