package com.arrayList;

public class Empleado2 {
    private int codArea;
    private String desArea;

    private String name;
    private int edad;
    private double salary;


    public Empleado2 (int codArea, String desArea) {
        this.codArea = codArea;
        this.desArea = desArea;
    }

    public Empleado2 (String name, int edad, double salary, int codArea) {
        this.name = name;
        this.edad = edad;
        this.salary = salary;
        this.codArea = codArea;
    }

    public Empleado2 () {}   // constructor sin parameters


    public String buscaDes() {
        return desArea;
    }

    public String buscaDatosPer () {
        return name+"        "+edad+"           " + salary + "               " + codArea;
    }


    public int getCodArea () {
        return codArea;
    }
}
