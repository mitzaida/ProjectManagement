package com.test;

public class Arreglos {

    public static void main(String[] args) {

        String[][] matriz = {
                {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}
        };

        dibujarX(matriz);

        mostrarArreglo(matriz);
    }

    private static void mostrarArreglo(String[][] matriz) {
        for (String[] strings : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(strings[j]);
            }
            System.out.println();
        }
    }

    public static void dibujarX(String[][] m){
        int d = m.length - 1;
        for (int i = 0; i < m.length; i++) {
            m[i][i] = "X";
            m[i][d-i] = "X";
        }
    }

    public static void dibujarX2(String[][] m) {
        int d = m.length - 1;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                if (i == j) {
                    m[i][i] = "X";
                } else if (d - i == j) {
                    m[i][d - i] = "X";
                } else {
                    m[i][j] = "_";
                }
            }
        }
    }
}
