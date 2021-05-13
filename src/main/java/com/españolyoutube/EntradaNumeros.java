package com.españolyoutube;

import javax.swing.*;

public class EntradaNumeros {
    public static void main(String[] args) {
        //String num1 = JOptionPane.showInputDialog("Número:");
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Número:"));

        double num2 = 2+ num1 ;

        System.out.println(num1/3+"          " + num2);

        System.out.printf("La Raiz Cuadrada de: " + num2 +" es igual a : " +  "%1.4f", Math.sqrt(num2));

        // el 1.2  indica que los decimales será de 2 decimales.
//        System.out.printf("%1.2f", "La Raiz de: " + num2 +" es igual a : " +  Math.sqrt(num1));
    }

}  // Fin Clase EntradaNumeros
