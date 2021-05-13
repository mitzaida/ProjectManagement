package com.españolyoutube;
import java.util.*;

public class EvaluaEdad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu edad por favor: ");

        int edad = entrada.nextInt();

        if (edad>=18) {
            System.out.println("si es >18.");
        } else {
            System.out.println("Es menor.");
        }

        if (edad <18) {
            System.out.println("eres teenager.");
        }

        else if (edad <40) {
            System.out.println("eres joven.");
        }

        else if (edad <65 ) {
            System.out.println("eres mayor.");
        }

        else {
            System.out.println("Cuidate.");
        }

    }
}
