package com.hacerLaX;

public class SegundaX {

    public static void main(String[] args) {
        int valorAlgo = 5;
        int valorOtro = 6;

        String myArrayX[][] = new String[valorAlgo] [valorOtro];

        // La long del ARRAY en JAVA, se mide por la cantidad de la 1ra dimensión definida del array.
        System.out.println("La longitud del array es la cantidad de la 1ra Dimensión colocada y se ve con la " +
                             "Sintaxis myArrayX.length sin especificar el índice : "
                            + myArrayX.length+ "\n");

        System.out.println("La 2da dimensión se ve con la Sintaxis ArrayX[0].length, indicando índice CERO  : "
                            + myArrayX[0].length+ "\n");

                                //*********************


        // A continuación el cilo FOR  manejado FILA - Columna :

            valorAlgo = 5;
            valorOtro = 6;
            System.out.println("\n  Arreglo Ciclo FOR  por  FILA - COLUMNA - print FILA - COLUMNA  \n");
            int auxColum = 0;
            int auxFila = 0;
            for (int f=0; f < myArrayX.length ; f++) {
                for (int c = 0 ; c < myArrayX[0].length ; c ++) {
                    myArrayX [f][c] = "O";
                    // Tomo de la primera fila, la última columna y activo un auxiliar.
                    if (c == valorAlgo -1   &&  f == 0) {
                        auxColum = c;
                    }
                    // Valido un auxFila y Columna para dibujar la / de derecha a izq.
                    if ( f >= auxFila && c == auxColum   ) {
                        myArrayX [f][auxColum] = "X,X";
                        auxColum-- ;
                    }

                    // Índices iguales de ambas dimensiones para trazar la \ de izq a derecha.
                    if (f==c) {
                        myArrayX[f][c] = "X,X";
                    }
                }  // fin del For c
                auxFila = f;
            }  // Fin del For f

            imprimeArrayX(myArrayX);

        }  // fin M. main



    //****************************************************************************************
    public static void imprimeArrayX(String myArrayX[][]) {
        // Impresión del Array 2 con ciclo FOR manajando   FILA - Columna
        for (int f = 0; f < myArrayX.length; f++) {
            for (int c = 0; c < myArrayX[0].length; c++) {
                System.out.print(myArrayX[f][c] + "    ");
            }
            System.out.println("\n");
        }
    }

} // Fin de Clase SegundaX
