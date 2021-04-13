package com.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ProcesarEmpleado {

    private List<Empleado> empleados;
    private List<Areas> areas;

    public ProcesarEmpleado() {
        this.empleados = new ArrayList<>();
        this.areas = new ArrayList<>();
    }

    public void cargarListas() {
        areas.add(new Areas(0, "Ventas"));
        areas.add(new Areas(1, "Compras"));
        areas.add(new Areas(2, "Atención al Cliente"));
        areas.add(new Areas(3, "Facturación"));
        areas.add(new Areas(4, "Entregas"));

        System.out.println("\n" + "Sise of areas -->" + areas.size());
        System.out.println("\n");

        // Llenando la otra Lista de los datos personales + código de área.
        empleados.add(new Empleado("Machy 3 ", 51, 51000, 2));
        empleados.add(new Empleado("Machy 0 ", 45, 5000, 3));
        empleados.add(new Empleado("Machy 4 ", 52, 52000, 1));
        empleados.add(new Empleado("Machy 2 ", 49, 9000, 0));
        empleados.add(new Empleado("Machy 1 ", 47, 7000, 4));
    }

    public void mostrarInformacion() {
        // Imprimo la lista con un arreglo convencional, pero una LISTA.
        System.out.println("Tamaño de datosPersonalesEmpleados: " + empleados.size());
        System.out.println("\n");
        System.out.println("Nombre:\t\t\tEdad:\t\t\tSalario:\t\t\tÁrea de Trabajo:");
        System.out.println("__________________________________________________________________");

        //empleados.
        for (int z1 = 0; z1 < empleados.size(); z1++) {
            Empleado empleado = empleados.get(z1);

            int mz5 = empleado.getCodArea();

//            if (areas.size() == 0) {
//                System.out.println(empleado.buscaDatosPer());
//            }

            boolean areaEncontrada = false;

            for (int z2 = 0; z2 < areas.size(); z2++) {
                Areas area = areas.get(z2);

                int mz6 = area.getCodArea();
                if (mz5 == mz6) {
                    System.out.println(empleado.buscaDatosPer() + " " + area.getDesArea());
                    areaEncontrada = true;
                }
            }

            if (areaEncontrada == false){
                System.out.println(empleado.buscaDatosPer());
            }
        }
    }

    public void agregar(Empleado empleado) {
        if (empleados == null) {
            empleados = new ArrayList<>();
        }
        empleados.add(empleado);
    }

    public void agregar(Areas area) {
        if (areas == null) {
            areas = new ArrayList<>();
        }
        areas.add(area);
    }
}
