package com.arrayList.estilos;

import com.arrayList.Empleado;

import java.util.List;

import static com.arrayList.UtilConsola.mostrar;

public class EstiloCabeceraGenerica implements EstiloCabecera {

    public void imprimirCabecera(List<Empleado> empleados) {
        // Imprimo la lista con un arreglo convencional, pero una LISTA.
        mostrar("Tamaño de datosPersonalesEmpleados: " + empleados.size());
        mostrar("\n");
        mostrar(headers);
        mostrar("===========================================================");
    }
}
