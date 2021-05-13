package com.españolyoutube;
import java.util.Scanner;
import javax.swing.*;

public class Areas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n Elige una opción: \n \n1: Cuadrado \n2: Rectángulo  \n3: Triángulo \n4: Círculo");

        int figura = entrada.nextInt();

        switch (figura) {
            case 1:
                int lado;
                lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el Lado del Cuadrado: " ));

                double areaCua = Math.pow(lado, 2);

                System.out.println("El Área del Cuadrado es lado * lado. Es la potencia del lado : " + areaCua);

                break;

            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la Base del Rectángulo: "));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la Altura del Rectángulo: "));
                int areaRec = base * altura;
                System.out.println("El Área del Rectángulo es base * altura : " + areaRec);

                break;

            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la Base del Tríangulo: "));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la Altura del Tríangulo: "));
                int areaTri = (base * altura )/2 ;

                System.out.println("El Área del Triángulo es  (base * altura)/2 : " + areaTri);

                break;

            case 4:

                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el Radio del Círculo: "));
                float areaCir = (float) ( (Math.pow(radio,2)) * Math.PI);

                System.out.print("El Área del Círculo es  (radio elevado al cuadrado) * Valor de PI : ");
                System.out.printf("%1.2f" , ((Math.pow(radio,2) ) * Math.PI) );

                System.out.println("\n Veamos areaCir float sin controlar cant. decimales  %1.2f : " + areaCir);

                break;

            default:
                System.out.println("La Opción introducida es Inválida.");


        } // Fin del switch


        System.out.println("\n Ha seleccionado la opción nro. : " + figura );

    }
}