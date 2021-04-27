package com.rutasMatrix.variant;

import javax.swing.*;

public class RutaDroneVariation {
    static boolean seguir = false;
    static boolean mover = false;

    public static void main(String[] args) {
        // La 1ra dimensión son para mi visualmente las columnas. Y la 2da dimensión visualmente para mi son filas.
        int filas = Integer.parseInt(JOptionPane.showInputDialog("Introduce Cantidad de Filas: "));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("Introduce Cantidad de Columnas: "));

        // Punto exacto donde iniciará el Drone y punta final donde llegará.
        int puntoFilaInicio = Integer.parseInt(JOptionPane.showInputDialog("Introduce Fila de Inicio del Drone: "));
        int puntoColumnaInicio = Integer.parseInt(JOptionPane.showInputDialog("Introduce Columna Inicio del Drone: "));

        int puntoFilaFinal = Integer.parseInt(JOptionPane.showInputDialog("Introduce Fila Final donde se detendrá el Drone: "));
        int puntoColumnaFinal = Integer.parseInt(JOptionPane.showInputDialog("Introduce Columna Final a detenerse el Drone: "));

        procesarMatrixDos(filas, columnas, puntoFilaInicio, puntoColumnaInicio, puntoFilaFinal, puntoColumnaFinal);

    }  // Fin M. Main.


    // ***************************************************************
    //public static boolean cargaPrintMatrixDos(int filas, int columnas, int puntoFilaInicio, int puntoColumnaInicio,
    public static void procesarMatrixDos(int filas, int columnas, int puntoFilaInicio, int puntoColumnaInicio,
                                         int puntoFilaFinal, int puntoColumnaFinal) {

        String[][] matrixDos;
        matrixDos = initializePath(filas, columnas);

        if (moverDrone(matrixDos, puntoFilaInicio, puntoColumnaInicio, puntoFilaFinal, puntoColumnaFinal)) {
            System.out.println("Se encontró el final!");
        } else {
            System.out.println("No se encontro el final!");
        }


    }  // Fin M. cargaPrintMatriYX


    private static boolean moverDrone(String[][] matrixDos, int fila,
                                      int columna, int puntoFilaFinal,
                                      int puntoColumnaFinal) {

        // Si llegué al final devuelvo TRUE para que los procesos anteriores del flujo que vienen detras sean verdadedo
        if (fila == puntoFilaFinal && columna == puntoColumnaFinal) {
            return true;
        }

        // Si la coordenada que quiero ocupar se sale de la matrix o si ya ocupe anteriormente dicha posición entonces
        // devolver FALSE para no continuar con esta ruta.
        if (!validateCoordinate(matrixDos, fila, columna)) {
            return false;
        }

        // Marco la posición como ocupada.
        matrixDos[fila][columna] = "x";

        // muestro la matrix
        showPath(matrixDos);

        // Sigo intentando buscar las coordenadas finales.
        return moverDrone(matrixDos, fila, columna + 1, puntoFilaFinal, puntoColumnaFinal)
                || moverDrone(matrixDos, fila + 1, columna, puntoFilaFinal, puntoColumnaFinal)
                || moverDrone(matrixDos, fila, columna - 1, puntoFilaFinal, puntoColumnaFinal)
                || moverDrone(matrixDos, fila - 1, columna, puntoFilaFinal, puntoColumnaFinal);

    }

    private static void showPath(String[][] matrixDos) {
        for (int i = 0; i < matrixDos.length; i++) {
            for (int j = 0; j < matrixDos[0].length; j++) {
                System.out.print(matrixDos[i][j]);
            }
            System.out.println();
        }
        System.out.println("==================================");
    }


    private static boolean validateCoordinate(String[][] matrixDos, int fila, int columna) {
        if (matrixDos.length <= fila || fila < 0 || columna < 0 || columna >= matrixDos[0].length) {
            return false;
        }
        return !matrixDos[fila][columna].equals("x");
    }


    private static String[][] initializePath(int row, int column) {
        String[][] matrixDos = new String[column][row];

        // Fill the matrix with ceros.
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < column; y++) {
                matrixDos[x][y] = "0";
            }
        }
//        Obstáculos cuando la matrix sea 10x10
//        matrixDos[0][3] = "|";
//        matrixDos[1][3] = "|";
//        matrixDos[2][3] = "|";
//        matrixDos[3][3] = "|";
//        matrixDos[4][3] = "|";
//        matrixDos[5][3] = "|";
//        matrixDos[6][3] = "|";
//        matrixDos[7][3] = "|";
//        matrixDos[8][3] = "|";
        return matrixDos;
    }


}  // Fin  Clase RutaDrone
