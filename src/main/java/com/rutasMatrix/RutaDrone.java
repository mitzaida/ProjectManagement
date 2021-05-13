package com.rutasMatrix;

import javax.swing.*;
import java.lang.reflect.Array;

public class RutaDrone {
    static boolean seguir1 = false;
    static boolean seguir = false;
    static int fin = 1;
    static int count = 0;

    public static void main(String[] args) {
        // La 1ra dimensión son para mi visualmente las columnas. Y la 2da dimensión visualmente para mi son filas.
        int filas = Integer.parseInt(JOptionPane.showInputDialog("Introduce Cantidad de Filas: "));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("Introduce Cantidad de Columnas: "));

        // Punto exacto donde iniciará el Drone y punta final donde llegará.
        int puntoFilaInicio = Integer.parseInt(JOptionPane.showInputDialog("Introduce Fila de Inicio del Drone: "));
        int puntoColumnaInicio = Integer.parseInt(JOptionPane.showInputDialog("Introduce Columna Inicio del Drone: "));

        int puntoFilaFinal = Integer.parseInt(JOptionPane.showInputDialog("Introduce Fila Final donde se detendrá el Drone: "));
        int puntoColumnaFinal = Integer.parseInt(JOptionPane.showInputDialog("Introduce Columna Final a detenerse el Drone: "));


        validaEntradas(filas, columnas, puntoFilaInicio, puntoColumnaInicio, puntoFilaFinal, puntoColumnaFinal);

        if (seguir1 == false) {
            System.out.println("Salgo del main x error en filas o columnas.");
            return;
        }


        procesarMatrixDos(filas, columnas, puntoFilaInicio, puntoColumnaInicio, puntoFilaFinal, puntoColumnaFinal);


    }  // Fin M. Main.


    // ***************************************************************
    public static boolean validaEntradas(int filas, int columnas, int puntoFilaInicio, int puntoColumnaInicio,
                                         int puntoFilaFinal, int puntoColumnaFinal) {

        if (filas <= 0 || columnas <= 0 || puntoFilaInicio > filas || puntoFilaFinal > filas ||
                puntoColumnaInicio > columnas || puntoColumnaFinal > columnas) {
            seguir1 = false;
            System.out.println("Error en filas  o columnas,");
            return seguir1;
        } else {
            seguir1 = true;
        }
        return seguir1;
    }  // Fin M. validaEntradas


    // ***************************************************************
    public static boolean validaNewCoordenada(String matrixDos [] [] , int currentFila, int currentColum) {

        int longitud1 = matrixDos.length;
        int longitud2 = matrixDos [0].length;

        if (currentFila <= 0 || currentColum <= 0 || currentFila > matrixDos.length ||
            currentColum > matrixDos[0].length ) {
            seguir = false;
            System.out.println("La new coordenada is outOfBounds. ");
            return seguir;

        } else {
            seguir = true;
        }
        return seguir;
    }  // Fin M. validaNewCoordenadas



    // ***************************************************************
    public static void procesarMatrixDos(int filas, int columnas, int puntoFilaInicio, int puntoColumnaInicio,
                                         int puntoFilaFinal, int puntoColumnaFinal) {

        String matrixDos[][] = new String[columnas][filas];

        int fin = 0;
        int currentFila = puntoFilaInicio - 1;
        int currentColum = puntoColumnaInicio - 1;


        fillMatrixDos(matrixDos, filas, columnas, puntoFilaInicio, puntoColumnaInicio,
                      puntoFilaFinal, puntoColumnaFinal );

        printMatrixDos(matrixDos, filas, columnas);

        fillObstaculos(matrixDos);

        movementAboveBelow(matrixDos, puntoFilaInicio, puntoColumnaInicio, puntoFilaFinal, puntoColumnaFinal,
                           currentFila, currentColum, filas, columnas );

        movementRightLeft(matrixDos, puntoFilaInicio, puntoColumnaInicio, puntoFilaFinal, puntoColumnaFinal,
                          currentFila, currentColum, filas, columnas );

        System.out.println("2da vez.");
        printMatrixDos(matrixDos, filas, columnas);
        System.out.println(" ");


 //       while (fin = 0)
        if (fin==1) {
            movementAboveBelow(matrixDos, puntoFilaInicio, puntoColumnaInicio, puntoFilaFinal, puntoColumnaFinal,
                               currentFila, currentColum, filas, columnas);

            if (fin==1) {
                movementRightLeft(matrixDos, puntoFilaInicio, puntoColumnaInicio, puntoFilaFinal, puntoColumnaFinal,
                                  currentFila, currentColum, filas, columnas);
            }
        }

        System.out.println("3ra vez.");
        printMatrixDos(matrixDos, filas, columnas);
        System.out.println(" ");


    } // Fin de procesarMatrixDos


    //******************************************************************************************
    public static void fillMatrixDos (String matrixDos [] [] ,int filas, int columnas,
                                      int puntoFilaInicio, int puntoColumnaInicio,
                                      int puntoFilaFinal, int puntoColumnaFinal) {
        // Fill the matrix with su respectiva posición.
        for (int x = 0; x < filas; x++) {
            for (int y = 0; y < columnas; y++) {
                matrixDos[y][x] = y + "," + x;
            }
        }
        matrixDos[puntoColumnaInicio - 1][puntoFilaInicio - 1] = "I,I";
        matrixDos[puntoColumnaFinal - 1][puntoFilaFinal - 1] = "F,F";

    }


    //******************************************************************************************
    // Print the matrix.
    public static void printMatrixDos(String matrixDos [] [], int filas, int columnas ){
        System.out.println("  ");
        System.out.println("matrixDos llena en forma automática.");
        for (int x = 0; x < filas; x++) {
            System.out.println(" ");
            for (int y = 0; y < columnas; y++) {
                System.out.printf(" %s " , matrixDos[y][x] + "   ");
            }
        }
        System.out.println(" ");
    }



    //****************************************************************************************
    public static void fillObstaculos(String matrixDos [] []) {


        //Obtáculos en la Ruta del Drone
        // Duros, luego hay q capturar y validar que no estén fuera de rango
        // matrixDos[(puntoColumnaInicio - 1) + 2][puntoFilaInicio - 1] = "O,O";
        // matrixDos[(puntoColumnaFinal - 1) + 1][(puntoFilaFinal - 1) + 2] = "O,O";
        matrixDos[1][4] = "---";
        matrixDos[5][4] = "---";
        matrixDos[6][5] = "---";
        matrixDos[5][1] = "---";
        matrixDos[4][2] = "---";
        matrixDos[6][2] = "---";
        matrixDos[5][2] = "---";
        matrixDos[2][6] = "---";

    }


    //****************************************************************************************
    public static void movementAboveBelow(String matrixDos [] [], int puntoFilaInicio, int puntoColumnaInicio,
                                          int puntoFilaFinal, int puntoColumnaFinal, int currentFila, int currentColum,
                                          int filas, int columnas) {

        int hayObstaculos = 0;
        count=0;  //  controla la repetición de derecha o izq en ese método.


        // control the movements above and beloww
        if (puntoFilaFinal < puntoFilaInicio) {
            //moverArriba();


            for (int x = (currentFila); currentFila != (puntoFilaFinal - 1); x--) {

                validaNewCoordenada(matrixDos, x, currentColum) ;
                if (seguir == false) {
                    System.out.println("Salgo de movementAboveBelow, porque fila se salió del rango.");
                    return;
                }

                if (matrixDos[currentColum][x] == "F,F") {
                    fin = 0;
                    return;
                }

                if (matrixDos[currentColum][x] != "---") {
                    matrixDos[currentColum][x] = "  x";
//                  if (matrixDos [x] [currentColum] != "---") {
//                      matrixDos [x] [currentColum] = "  x";

                      currentFila = x;
                        printMatrixDos(matrixDos, filas, columnas);

//                      if (matrixDos[currentColum] [x] == "F,F") {
//                          fin = 0;
//                          return;
//                      }

                } else {
                    // Dentro de Subir, buscar hacia los lados para subir.
                    hayObstaculos = 1;
                    String queHagoSubir="Aún no lo se.";

                    movementRightLeft(matrixDos, puntoFilaInicio, puntoColumnaInicio,
                                      puntoFilaFinal, puntoColumnaFinal,
                                      currentFila, currentColum, filas, columnas );
                    //break;

                }
            }


        } else if (puntoFilaFinal > puntoFilaInicio) {

            //moverAbajo();

            for (int x = (currentFila); currentFila != (puntoFilaFinal - 1); x++) {

                validaNewCoordenada(matrixDos, x, currentColum) ;
                if (seguir == false) {
                    System.out.println("Salgo de movementAboveBelow, porque BAJAR se salió del rango.");
                    return;
                }

                if (matrixDos[currentColum][x] == "F,F") {
                    fin = 0;
                    return;
                }


                if (matrixDos[currentColum][x] != "---") {
                    matrixDos[currentColum][x] = "  x";
//                if (matrixDos[x] [currentColum] != "---") {
//                    matrixDos[x] [currentColum] = "  x";

                    currentFila = x;
                    printMatrixDos(matrixDos, filas, columnas);

//                    if (matrixDos[currentColum][x] == "F,F") {
//                        fin = 0;
//                        return;
//                    }

                } else {
                    hayObstaculos = 1;
                    String queHagoBajar = "Aún no lo se.";
                    movementRightLeft(matrixDos, puntoFilaInicio, puntoColumnaInicio,
                            puntoFilaFinal, puntoColumnaFinal,
                            currentFila, currentColum, filas, columnas );
                    //break;

                }
            }


        }  else {
            // fila final es = fila inicio

            movementRightLeft(matrixDos, puntoFilaInicio, puntoColumnaInicio,
                    puntoFilaFinal, puntoColumnaFinal,
                    currentFila, currentColum, filas, columnas);

        }
    }  // Fin M. movementAboveBelow



    //****************************************************************************************
    // control the movements izq and right
    public static void movementRightLeft(String matrixDos [] [], int puntoFilaInicio, int puntoColumnaInicio,
                                         int puntoFilaFinal, int puntoColumnaFinal, int currentFila,
                                         int currentColum, int filas, int columnas) {

        int hayObstaculos = 0;

        if (puntoColumnaFinal < puntoColumnaInicio) {
            // mover a la izq
            count ++;
            //for (int y = puntoColumnaInicio - 1; y > (puntoColumnaFinal - 1); y--) {

            for (int y = currentColum; y > (puntoColumnaFinal - 1); y--) {

                validaNewCoordenada(matrixDos, currentFila, y) ;
                if (seguir == false) {
                    System.out.println("Salgo de movementRightLeft, porque el lado IZQ se salió del rango.");
                    return;
                }

                if (matrixDos[y][currentFila] == "F,F") {
                    fin = 0;
                    return;
                }

                if (matrixDos[y][currentFila] != "---") {
                    matrixDos[y][currentFila] = "  x";
                    currentColum = y;
                    printMatrixDos(matrixDos, filas, columnas);

//                    if (matrixDos[y][currentFila] == "F,F") {
//                        fin = 0;
//                        return;
//                    }

                } else {
                    // Si hay obst a la izq , que vaya a la derecha
                    hayObstaculos = 1;
                    if (count <= 2) {
                        // Concurrency

                        String queHagoIZQ = "Aún no lo se.";
                        //si va a la IZQ y hay obst,  que vaya arriba o abajo según valide allá.
                        movementAboveBelow(matrixDos, puntoFilaInicio, puntoColumnaInicio, puntoFilaFinal, puntoColumnaFinal,
                                currentFila, currentColum, filas, columnas);

                        //break;

                    } else {
                        int rompoCiclo = 1;
                        System.out.println("rompo el ciclo en RL a la IZQ.");
                        break;
                    }
                }

                int noEsFinal = 1 ;
            }

            // mover a la derecha
        } else if (puntoColumnaFinal > puntoColumnaInicio) {

            for (int y = currentColum; y < (puntoColumnaFinal - 1); y++) {

                validaNewCoordenada(matrixDos, currentFila, y) ;
                if (seguir == false) {
                    System.out.println("Salgo de movementRightLeft, porque el lado DERECHO se salió del rango.");
                    return;
                }

                if (matrixDos[y][currentFila] == "F,F") {
                    fin = 0;
                    return;
                }

                if (matrixDos[y][currentFila] != "---") {
                    matrixDos[y][currentFila] = "  x";
                    currentColum = y;
                    printMatrixDos(matrixDos, filas, columnas);

//                    if (matrixDos[y][currentFila] == "F,F") {
//                        fin = 0;
//                        return;
//                    }


                } else {
                    hayObstaculos = 1;
                    if (count <= 2) {
                        // Concurrency

                        //  si va a la derecha y obs , que valla arriba o abajo seg{un valide allá
                        String queHagoDerecha = "Aún no lo se.";
                        movementAboveBelow(matrixDos, puntoFilaInicio, puntoColumnaInicio, puntoFilaFinal, puntoColumnaFinal,
                                currentFila, currentColum, filas, columnas);



                        //break;
                    } else {
                        int rompoCiclo = 1;
                        System.out.println("rompo el ciclo en RL a la derecha.");
                        break ;
                    }
                }
            }
        }
        System.out.println();

    }  //  Fin del M. movementRightLeft



}  //  Fin de la clase RutaDrone