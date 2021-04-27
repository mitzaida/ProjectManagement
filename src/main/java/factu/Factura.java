package factu;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
class Factura {
    private List<String> productos;
    private BigDecimal total;
}
