package com.hacerLaX;

public class ExamQuestionEvalArt {

    public static void main(String[] args) {
        int n=5, fila, columna;

        String matrixDeX [][] = new String[n][n];

        System.out.println("Tamaño de la matrixDeX: " + matrixDeX.length);
        int longitud = matrixDeX.length;

        System.out.println("MATRIX por cada posición bidimensional.");

        for (columna=0 ; columna < matrixDeX.length ; columna++ ) {

            for (fila=0 ; fila < matrixDeX.length; fila++) {
                matrixDeX[columna] [fila]= "_";
            }

        }

        for (columna = 0 ; columna < n ; columna++) {
            for (fila = 0; fila < n ; fila++) {
                //if ((columna==0 && fila==0) || (fila == n-1 && columna==n) || (columna == n && fila ==n) {
                //if ((columna==0 && fila==0) || (fila == n-1 && columna==n) || (columna == n && fila ==n)) {
                if ((columna==0 && fila==0) || (columna == n && fila ==n)) {
                    matrixDeX[columna] [fila] = "X";
                }
                if (fila == n-1) {
                    System.out.println("\n");
                }

                System.out.print(matrixDeX[columna] [fila]);
            }
        }
    }
}
