package com.hacerLaX;

public class ExamQuestionEvalArt {

    public static void main(String[] args) {
        int n = 15, fila, columna;

        String matrixDeX[][] = new String[n][n+10];

        System.out.println("Tamaño de la matrixDeX: " + matrixDeX.length);
        int longitud = matrixDeX.length;

        System.out.println("MATRIX por cada posición bidimensional.");

        for (columna=0 ; columna < matrixDeX.length ; columna++ ) {
            for (fila=0 ; fila < matrixDeX.length; fila++) {
                matrixDeX[columna] [fila]= "_";
            }
        }
        flujoIncorrecto(n, matrixDeX);
//      flujoCorrecto(n, matrixDeX);
    }

    private static void flujoIncorrecto(int n, String[][] matrixDeX) {
        int columna;
        int fila;
        int nn = n;
        for (columna = 0; columna <  matrixDeX.length; columna++) {

            for (fila = 0; fila <  matrixDeX[0].length; fila++) {

                if (fila==nn-1) {
                    matrixDeX[columna][fila] = "X";
                    nn = nn - 1;

                } else if (columna == fila) {
                    matrixDeX[columna][fila] = "X";
                } else {
                    matrixDeX[columna][fila] = "_";
                }
                System.out.print(matrixDeX[columna][fila]);
            }
            System.out.println("");
        }
    }

    public static void flujoCorrecto( int  n, String matrixDeX[][]) {
        int nn = n;
        for (int columna = 0 ; columna <  matrixDeX.length ; columna++) {

            for (int fila = 0; fila <  matrixDeX[0].length ; fila++) {
                if ((columna==fila) || (fila==nn-1)) {
                    matrixDeX[columna] [fila] = "X";

                }

                if (fila==nn-1 )  {
                    matrixDeX[columna] [fila] = "N";
                    nn=nn-1;
                }

                System.out.print(matrixDeX[columna] [fila]);
            }

            System.out.println("");
        }

    }

}
