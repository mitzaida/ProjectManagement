package factu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
//import static factu.ProcesarFactura.productos;


public class DatosProductos {


  //  public static List<String> getNombreProductos() {

//        for (String pro : productos) {
//            productos.add(pro.split(",")[0].trim());
//        }
//        return productos;
    //}



    public static BigDecimal getPrecioProducto(String nombre, List<String> productos) {
        for (String producto : productos) {

            if (producto.split(",")[0].trim().equalsIgnoreCase(nombre)) {
                return BigDecimal.valueOf(Long.parseLong(producto.split(",")[1].trim()));
            }
        }
        return null;
    }


}


