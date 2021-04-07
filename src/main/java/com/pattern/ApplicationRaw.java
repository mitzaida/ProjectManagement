package com.pattern;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class ApplicationRaw {

    private List<String> detalles = new ArrayList<>();

    public static void main(String[] args) {
        ApplicationRaw ar = new ApplicationRaw();
        int contador = 0;

        System.out.println("Productos en almacen:");
        for (String valor : DataUtil.getNombreProductos()) {
            System.out.println(valor);

            if (valor.contains("B") || valor.contains("C")) {
                contador++;
                ar.getDetalles().add(valor);
            }
        }

        Factura factura = new Factura();
        factura.setProductos(new ArrayList<>());

        System.out.println("Productos a ser agregados");
        for (String valor : ar.getDetalles()) {
            System.out.println(valor);
            factura.getProductos().add(valor);
        }

        BigDecimal total = new BigDecimal(0);
        for (String item : factura.getProductos()) {
            BigDecimal precioProducto = DataUtil.getPrecioProducto(item);
            System.out.println("item: " + item + ", Precio: " + precioProducto.longValue());
            total = total.add(precioProducto);
        }
        factura.setTotal(total);

        System.out.println("Número de Items incluidos en la factura : " + contador);
        System.out.println("Total de la factura : " + factura.getTotal().floatValue());

    }
}

@Data
class Factura {
    private List<String> productos;
    private BigDecimal total;
}
