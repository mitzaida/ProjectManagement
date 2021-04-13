package com.arrayList;

/****************************************************************************
 *  Comencé de nueva con otra clase porque la before is a little desorganize jajajja
 *   clase Improved_Empleado which is the main one.
 ***************************************************************************/
public class ImprovedEmpleado {

    public static void main(String[] args) {
        String txt = "ligero";
        EstiloCabecera estilo;

        if (txt.equalsIgnoreCase("generica")) {
            estilo = new EstiloCabeceraGenerica();
        } else if (txt.equalsIgnoreCase("ligero")) {
            estilo = new EstiloCabeceraLigero();
        } else {
            estilo = new EstiloCabeceraModerno();
        }


        ProcesarEmpleado procesarEmpleado = new ProcesarEmpleado(estilo);
        procesarEmpleado.cargarListas();
        procesarEmpleado.mostrarInformacion();

        procesarEmpleado.setEstilo(new EstiloCabeceraModerno());
        procesarEmpleado.mostrarInformacion();

        procesarEmpleado.setEstilo(new EstiloCabeceraGenerica());
        procesarEmpleado.mostrarInformacion();

        procesarEmpleado.setEstilo(new EstiloCabeceraAsterisco());
        procesarEmpleado.mostrarInformacion();


//        procesarEmpleado.agregar(new Empleado("E1", 1, 2, 3));
//        procesarEmpleado.agregar(new Empleado("E2", 4, 5, 100));
//        procesarEmpleado.agregar(new Areas(10, "A1"));
//        procesarEmpleado.mostrarInformacion();
    }

}



