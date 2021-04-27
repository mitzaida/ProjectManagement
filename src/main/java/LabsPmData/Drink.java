package LabsPmData;
import java.math.BigDecimal;

public class Drink extends Product {

    // In the constructor of Drink la keyword this, is for vars of that using in the class, instance vars, and the
    // keyword super is for the class a la cual extends Drink, in this case, Product.  super para Product.
    // Initialization of food and drink is donde.
    public Drink (int id, String name, BigDecimal price, Rating rating) {
        super(id, name, price, rating);
    }


//    public Drink () {
//        super(0,"Probando con la keyword  super " , BigDecimal.ZERO ,Rating.NOT_RATED);
//
//    }


}
