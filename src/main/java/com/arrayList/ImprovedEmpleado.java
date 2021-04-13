package com.arrayList;

import java.util.ArrayList;


/****************************************************************************
 *  Comencé de nueva con otra clase porque la before is a little desorganize jajajja
 *   clase Improved_Empleado which is the main one.
 ***************************************************************************/
public class ImprovedEmpleado {

    public static void main(String[] args) {
        ProcesarEmpleado procesarEmpleado = new ProcesarEmpleado();
        procesarEmpleado.cargarListas();
//        procesarEmpleado.agregar(new Empleado("E1", 1, 2, 3));
//        procesarEmpleado.agregar(new Empleado("E2", 4, 5, 100));
//        procesarEmpleado.agregar(new Areas(10, "A1"));
        procesarEmpleado.mostrarInformacion();
    }

}



