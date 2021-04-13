package com.arrayList;

import java.text.DecimalFormat;

public class Empleado {
    private int codArea;
    private String desArea;

    private String name;
    private int edad;
    private double salary;


    public Empleado(int codArea, String desArea) {
        this.codArea = codArea;
        this.desArea = desArea;
    }

    public Empleado(String name, int edad, double salary, int codArea) {
        this.name = name;
        this.edad = edad;
        this.salary = salary;
        this.codArea = codArea;
    }

    public Empleado() {}   // constructor sin parameters


    public String buscaDes() {
        return desArea;
    }

    public String buscaDatosPer () {
        String format = new DecimalFormat("#.0#").format(salary);
        return String.format("%s\t\t%d\t\t\t%s\t\t\t%d", name, edad, format, codArea);

//        return name+"        "+edad+"           " + salary + "           " + codArea;
    }


    public int getCodArea () {
        return codArea;
    }
}
