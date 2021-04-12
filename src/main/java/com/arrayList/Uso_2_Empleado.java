package com.arrayList;

import org.apache.http.util.TextUtils;

import java.util.ArrayList;


/****************************************************************************
 *  Comencé de nueva con otra clase porque la before is a little desorganize jajajja
 *   clase Uso_2_Empleado which is the main one.
 ***************************************************************************/
public class Uso_2_Empleado {

    // Variable que declaro de tipo ArrayList, private and static so that is a class var.
    private static ArrayList<Empleado2> datosPersonalesEmpleado;
    private static ArrayList<Empleado2> nombreAreaVarTipoArrayList ;

    public static void main(String[] args) {

        // Uso el constructor por defecto de la clase ArrayList, en este caso de tipo Empleado.
        nombreAreaVarTipoArrayList = new ArrayList<Empleado2>();
        datosPersonalesEmpleado = new ArrayList<Empleado2>();

        System.out.println("Imprimo la Lista llamada nombreVarTipoArrayList definida con Arraylist,");
        System.out.println("PERO imprimo con un arreglo convencional.");


        //Para que no me de error indez 0 out of bounds for lenght 0....
        // voy a declarar por defecto
//        nombreAreaVarTipoArrayList.set(1 , new Empleado2(0,null));
//        nombreAreaVarTipoArrayList.set(2 , new Empleado2(1,null));
//        nombreAreaVarTipoArrayList.set(3 , new Empleado2(2,null));
//        nombreAreaVarTipoArrayList.set(4 , new Empleado2(3,null));
//        nombreAreaVarTipoArrayList.set(5 , new Empleado2(4 , null));

        nombreAreaVarTipoArrayList.add(new Empleado2(0,"Ventas"));
        nombreAreaVarTipoArrayList.add(new Empleado2(1,"Compras"));
        nombreAreaVarTipoArrayList.add(new Empleado2(2,"Atención al C."));
        nombreAreaVarTipoArrayList.add(new Empleado2(3,"Facturcn."));
        nombreAreaVarTipoArrayList.add(new Empleado2(4,"Entregas_all"));

// NEIRO no me aceptó el set para el arraylist.  Agregué arriba los add, y me imprimió todo de una vez.
//        nombreAreaVarTipoArrayList.set(0 , new Empleado2(0,"Ventas"));
//        nombreAreaVarTipoArrayList.set(1 , new Empleado2(1,"Compras"));
//        nombreAreaVarTipoArrayList.set(2 , new Empleado2(2,"Servicio al Cliente"));
//        nombreAreaVarTipoArrayList.set(3 , new Empleado2(3,"Facturación"));
//        nombreAreaVarTipoArrayList.set(4 , new Empleado2(4,"Entrega"));


        // Llenando la otra Lista de los datos personales + código de área.
        datosPersonalesEmpleado.add(new Empleado2("Machy 0 ", 45, 5000, 4));
        datosPersonalesEmpleado.add(new Empleado2("Machy 1 ", 47, 7000,1));
        datosPersonalesEmpleado.add(new Empleado2("Machy 2 ", 49, 9000,3));
        datosPersonalesEmpleado.add(new Empleado2("Machy 3 ", 51, 51000,0));
        datosPersonalesEmpleado.add(new Empleado2("Machy 4 ", 52, 52000,2));

        // Imprimo la lista con un arreglo convencional, pero una LISTA.
        System.out.println("Tamaño de datosPersonalesEmpleados: "+datosPersonalesEmpleado.size());
        System.out.println("\n");
        System.out.println("Nombre:        Edad:       Salario:             Área de Trabajo: ");
        System.out.println("__________________________________________________________________");

        //datosPersonalesEmpleado.
        for (int z1 = 0 ; z1 < nombreAreaVarTipoArrayList.size() ; z1++) {
            Empleado2 variableUnoTipoEmpleado2 = datosPersonalesEmpleado.get(z1);// vienen datos y cod area q no deberia

            int mz5 = variableUnoTipoEmpleado2.getCodArea();

            Empleado2 variableDosTipoEmpleado2 = nombreAreaVarTipoArrayList.get(mz5);

            System.out.println(variableUnoTipoEmpleado2.buscaDatosPer()+ " " +
                    variableDosTipoEmpleado2.buscaDes());
        }



        // Ahora con Arreglos , Defino y declaro in the same line.
        //String misAreas[] = new String[5] {"Ventas", "Compras", "Servicio al Cliente", "Facturación", "Entregas"};

        String[] misAreas = {"Ventas", "Compras", "Servicio al Cliente", "Facturación", "Entregas"};
        System.out.println("\n");
        System.out.println("Arreglo misAreas : ");
        for (int z1 = 0 ; z1 < misAreas.length ; z1++) {
            System.out.println("misAreas en la poisición: "+z1 + "el valor es : "+ misAreas[z1]);
        }


        // Otros datos de Pruebas con los arrays normales.
        System.out.println("\n"+ " OtroArray normal");
        int [] otroArray = new int[5];
        otroArray[0]=5;
        otroArray[1]=38;
        otroArray[2]=15;
        otroArray[3]=92;
        otroArray[4]=71;
        System.out.println("Valor de otroArray en la posición 0 es : "  + otroArray[0]);
        System.out.println("Valor de otroArray en la posición 1 es : "  + otroArray[1]);
        System.out.println("Valor de otroArray en la posición 2 es : "  + otroArray[2]);
        System.out.println("Valor de otroArray en la posición 3 es : "  + otroArray[3]);
        System.out.println("Valor de otroArray en la posición 4 es : "  + otroArray[4]);

        System.out.println("\n"+ " Arreglo MisAreas2 : ");
        String[] misAreas2 = new String[5];
        misAreas2[0] = "Ventas             _misAreas2";
        misAreas2[1] = "Compras            _misAreas2";
        misAreas2[2] = "Servicio al cliente_misAreas2";
        misAreas2[3] = "Facturación        _misAreas2";
        misAreas2[4] = "Entregas           _misAreas2";
        System.out.println("Arreglo misAreas2 :");
        for (int z1 = 0 ; z1 < misAreas2.length ; z1++) {
            System.out.println("Valor de misAreas2 en la posición: "+ z1 + " es: " + misAreas2[z1]);
        }

        System.out.println("\n"+"Mi primer FOREACH para recorrer un ARRAYLIST ....");
        ArrayList <String> listado =  new ArrayList<String>();
        listado.add("Futbol");
        listado.add("Tennis");
        listado.add("Natación");
        listado.add("Voleibol");
        System.out.println("Size:  "+ listado.size());
        listado.forEach((deportes)-> {
            System.out.println(deportes);
        });
// este no funciona en Java11 al parecer
//        // Consultar o buscar un elemento dentro de un ARRAYLIST.
//        If (listado.contains("Tennis") {
//                System.out.println("Si hay Tennis en el ARRAYLIST.");
//        }

        listado.remove("Tennis");
        listado.remove(0);

        System.out.println("Ahora quedaron sólo: " + listado.size());

        listado.forEach((deportes)-> {
            System.out.println(deportes);
        });


        System.out.println("\n"+ " Fin de las Impresiones MZ.");
    }  // Fin Main method in Uso_2_Empleado

} // Fin de clase Uso_2_Empleado


