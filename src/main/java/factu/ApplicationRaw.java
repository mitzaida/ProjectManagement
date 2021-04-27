package factu;

import com.pattern.DataUtil;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
//import static factu.DatosProductos.getNombreProductos;

@Data
public class ApplicationRaw {

    private List<String> detalles = new ArrayList<>();

    public static void main(String[] args) {
        ApplicationRaw ar = new ApplicationRaw();
        int contador = 0;

        // Obtener todos los productos.
        System.out.println("Productos en almacen:");

//        for (String valor : getNombreProductos()) {
//            System.out.println(valor);
//
//            // Si existe un producto que con tenga la letra B o C entonces almacenarlos en los detalles de la clase principal
//            if (valor.contains("B") || valor.contains("C")) {
//                contador++;
//                ar.getDetalles().add(valor);
//            }
//        }

        // Crear la factura e inicializar sus atributos
        Factura factura = new Factura();
        factura.setProductos(new ArrayList<>());

        // Agregar los productos contenidos en el detalle de la clase principal
        System.out.println("Productos a ser agregados");
        for (String valor : ar.getDetalles()) {
            System.out.println(valor);
            factura.getProductos().add(valor);
        }

        // Calcular el monto total de los productos agregados
        BigDecimal total = new BigDecimal(0);
        for (String item : factura.getProductos()) {
            BigDecimal precioProducto = DataUtil.getPrecioProducto(item);
            System.out.println("item: " + item + ", Precio: " + precioProducto.longValue());
            total = total.add(precioProducto);
        }

        // asignar a la factura el monto total calculado
        factura.setTotal(total);

        // Mostrar en consola la cantidad de items y el monto total de la factura
        System.out.println("Número de Items incluidos en la factura : " + contador);
        System.out.println("Total de la factura : " + factura.getTotal().floatValue());

    }
}

