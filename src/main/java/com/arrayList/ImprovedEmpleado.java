package com.arrayList;

import com.arrayList.estilos.*;

import java.util.ArrayList;
import java.util.List;

/****************************************************************************
 *  Comencé de nueva con otra clase porque la before is a little desorganize jajajja
 *   clase Improved_Empleado which is the main one.
 ***************************************************************************/
public class ImprovedEmpleado {

    public static void main(String[] args) {
        String txt = "ligero";
        EstiloCabecera estilo;

        boolean falSe = Boolean.parseBoolean("falSe");

        try{
            System.out.print("");
            badMethod();
        }catch(Exception ex){
            System.out.println("1");
        }finally {
            System.out.println("2");
        }
        System.out.println("D");

        main(null);


        txt.substring(0, 2);
        System.out.print(txt.getClass().getSimpleName());
        System.out.println("asd" instanceof  String);
        List m = new ArrayList();

        try {
            System.out.print("");
        }catch(Exception e){

        }
        m.add("");
        m.add(2);
        System.out.println(m.get(0) instanceof Object);
        System.out.println(m.get(1) instanceof  Integer);
    }

    private static void badMethod() {
        throw new Error();
    }

}



