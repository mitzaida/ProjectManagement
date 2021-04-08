package LabsPmData;

import java.math.BigDecimal;

// Mz in this case Drink doesn't have any instances vars. An only
// i am initializing the product parameters.
public class Drink extends Product {
    public Drink(int id, String name, BigDecimal price, Rating rating) {
        super(id, name, price, rating);
    }
//    public Drink() {
//        super();
//    }
}
