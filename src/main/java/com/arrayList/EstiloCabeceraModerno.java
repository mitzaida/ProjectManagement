package com.arrayList;

import java.util.List;

import static com.arrayList.UtilConsola.mostrar;

public class EstiloCabeceraModerno implements EstiloCabecera {

    public void imprimirCabecera(List<Empleado> empleados) {
        // Imprimo la lista con un arreglo convencional, pero una LISTA.
        mostrar("Tamaño de datosPersonalesEmpleados: " + empleados.size());
        mostrar("\n");
        mostrar(headers);
        mostrar("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
    }
}
