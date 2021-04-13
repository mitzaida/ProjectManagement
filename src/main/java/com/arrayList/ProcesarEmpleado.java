package com.arrayList;

import java.util.ArrayList;
import java.util.List;

import static com.arrayList.UtilConsola.mostrar;

public class ProcesarEmpleado {

    private List<Empleado> empleados;
    private List<Areas> areas;
    private EstiloCabecera estilo;

    public ProcesarEmpleado(List<Empleado> empleados, List<Areas> areas, EstiloCabecera estilo) {
        this.empleados = empleados;
        this.areas = areas;
        this.estilo = estilo;
    }

    public ProcesarEmpleado(EstiloCabecera estilo) {
        this(new ArrayList<>(), new ArrayList<>(), estilo);
    }

    public ProcesarEmpleado() {
        this(new ArrayList<>(), new ArrayList<>(), new EstiloCabeceraGenerica());
    }

    public void cargarListas() {
        areas.add(new Areas(0, "Ventas"));
        areas.add(new Areas(1, "Compras"));
        areas.add(new Areas(2, "Atención al Cliente"));
        areas.add(new Areas(3, "Facturación"));
        areas.add(new Areas(4, "Entregas"));

        mostrar("\n" + "Sise of areas -->" + areas.size());
        mostrar("\n");

        // Llenando la otra Lista de los datos personales + código de área.
        empleados.add(new Empleado("Machy 3 ", 51, 51000, 2));
        empleados.add(new Empleado("Machy 0 ", 45, 5000, 3));
        empleados.add(new Empleado("Machy 4 ", 52, 52000, 1));
        empleados.add(new Empleado("Machy 2 ", 49, 9000, 0));
        empleados.add(new Empleado("Machy 1 ", 47, 7000, 4));
    }

    public void mostrarInformacion() {
        estilo.imprimirCabecera(empleados);

        //empleados.
        for (int z1 = 0; z1 < empleados.size(); z1++) {
            Empleado empleado = empleados.get(z1);

            int mz5 = empleado.getCodArea();

//            if (areas.size() == 0) {
//                UtilConsola.mostrar(empleado.buscaDatosPer());
//            }

            boolean areaEncontrada = false;

            for (int z2 = 0; z2 < areas.size(); z2++) {
                Areas area = areas.get(z2);

                int mz6 = area.getCodArea();
                if (mz5 == mz6) {
                    mostrar(empleado.buscaDatosPer() + " " + area.getDesArea());
                    areaEncontrada = true;
                }
            }

            if (!areaEncontrada) {
                mostrar(empleado.buscaDatosPer());
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

    public void setEstilo(EstiloCabecera estilo) {
        this.estilo = estilo;
    }
}
