package com.arrayList;

import java.util.List;

import static com.arrayList.UtilConsola.mostrar;

public interface EstiloCabecera {

    String headers = "Nombre:\t\t\tEdad:\t\t\t\t\tÁrea de Trabajo:";

    void imprimirCabecera(List<Empleado> empleados);
}
