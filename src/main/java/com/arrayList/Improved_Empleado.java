package com.arrayList;

import org.apache.http.util.TextUtils;

import java.util.ArrayList;


/****************************************************************************
 *  Comencé de nueva con otra clase porque la before is a little desorganize jajajja
 *   clase Improved_Empleado which is the main one.
 ***************************************************************************/
public class Improved_Empleado{

    // Variable que declaro de tipo ArrayList, private and static so that is a class var.
    private static ArrayList<Empleado2> datosPersonalesEmpleado;
    private static ArrayList<Areas> nombreAreaVarTipoArrayList ;

    public static void main(String[] args) {

        // Uso el constructor por defecto de la clase ArrayList, en este caso de tipo Empleado.
        nombreAreaVarTipoArrayList = new ArrayList<Areas>();
        datosPersonalesEmpleado = new ArrayList<Empleado2>();

        System.out.println("Imprimo la Lista llamada nombreVarTipoArrayList definida con Arraylist,");
        System.out.println("PERO imprimo con un arreglo convencional.");

        nombreAreaVarTipoArrayList.add(new Areas(0,"Ventas"));
        nombreAreaVarTipoArrayList.add(new Areas(1,"Compras"));
        nombreAreaVarTipoArrayList.add(new Areas(2,"Atención al Cliente"));
        nombreAreaVarTipoArrayList.add(new Areas(3,"Facturación"));
        nombreAreaVarTipoArrayList.add(new Areas(4,"Entregas"));

        System.out.println("\n"+"Sise of nombreAreaVarTipoArrayList -->" + nombreAreaVarTipoArrayList.size());
        System.out.println("\n");

        // Llenando la otra Lista de los datos personales + código de área.
        datosPersonalesEmpleado.add(new Empleado2("Machy 3 ", 51, 51000,2));
        datosPersonalesEmpleado.add(new Empleado2("Machy 0 ", 45, 5000,3));
        datosPersonalesEmpleado.add(new Empleado2("Machy 4 ", 52, 52000,1));
        datosPersonalesEmpleado.add(new Empleado2("Machy 2 ", 49, 9000,0));
                datosPersonalesEmpleado.add(new Empleado2("Machy 1 ", 47, 7000,4));


        // Imprimo la lista con un arreglo convencional, pero una LISTA.
        System.out.println("Tamaño de datosPersonalesEmpleados: "+datosPersonalesEmpleado.size());
        System.out.println("\n");
        System.out.println("Nombre:        Edad:       Salario:             Área de Trabajo: ");
        System.out.println("__________________________________________________________________");

        //datosPersonalesEmpleado.
        for (int z1 = 0 ; z1 < datosPersonalesEmpleado.size() ; z1++) {
            Empleado2 variableUnoTipoEmpleado2 = datosPersonalesEmpleado.get(z1);

          // System.out.println("\n"+variableUnoTipoEmpleado2.getCodAreax());
            int mz5 = variableUnoTipoEmpleado2.getCodArea();

            for (int z2 = 0 ; z2 < nombreAreaVarTipoArrayList.size(); z2++ ){
                Areas variableDosTipoAreas = nombreAreaVarTipoArrayList.get(z2);

                int mz6 = variableDosTipoAreas.getCodArea();
                if (mz5 == mz6 ) {
                    System.out.println(variableUnoTipoEmpleado2.buscaDatosPer()+ " " +
                            variableDosTipoAreas.getDesArea());
                }
            }

        }


        System.out.println("\n"+ " Fin de las Impresiones MZ.");
    }  // Fin Main method in Improved_Empleado

} // Fin de clase Improved_Empleado



