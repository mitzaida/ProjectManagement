package factu;

import factu.Item;
import factu.PaymentType;
import lombok.Data;

import java.util.List;

@Data
public class Bill {

    private PaymentType paymentType;
    private List<Item> details;
}
