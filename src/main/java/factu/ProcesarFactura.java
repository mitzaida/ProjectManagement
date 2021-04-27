package factu;

import com.arrayList.estilos.EstiloCabeceraGenerica;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProcesarFactura {

    private static final List<String> productos = new ArrayList<String>();
    private static final List<Integer> descuentos = new ArrayList<>();

    public ProcesarFactura() {
    }

//    public void cargaListaProductos() {
//
//        static {
//            productos.add("Producto A, 5000");
//            productos.add("Producto B, 6000");
//            productos.add("Producto C, 7000");
//            productos.add("Producto D, 8000");
//        }
//    }


    public void cargaListaDescuentos() {

            descuentos.add(5);
            descuentos.add(8);
            descuentos.add(10);
            descuentos.add(15);

    }


    // Get la arraylist productos
    public static List<String> getProductos() {
          return productos;
    }

    public static List<Integer> getDescuentos() {
        return descuentos;
    }
}