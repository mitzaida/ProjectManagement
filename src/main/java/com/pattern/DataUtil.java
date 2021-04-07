package com.pattern;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DataUtil {


    private static final List<String> productos = new ArrayList<>();

    static {
        productos.add("Producto A, 5000");
        productos.add("Producto B, 10000");
        productos.add("Producto C, 15000");
        productos.add("Producto D, 20000");
    }

    public static List<String> getProductos() {
        return productos;
    }


    public static List<String> getNombreProductos() {
        List<String> productos = new ArrayList<>();

        for (String producto : DataUtil.productos) {
            productos.add(producto.split(",")[0].trim());
        }
        return productos;
    }

    public static BigDecimal getPrecioProducto(String nombre) {
        for (String producto : DataUtil.productos) {
            if (producto.split(",")[0].trim().equalsIgnoreCase(nombre)) {
                return BigDecimal.valueOf(Long.parseLong(producto.split(",")[1].trim()));
            }
        }
        return null;
    }
}
