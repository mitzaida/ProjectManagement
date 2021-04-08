package LabsPmData;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Food extends Product {
//    public Food () {
//        super();
//    }

    private LocalDate bestBefore;

    // Constructor of Food, which ask me for super class and selecf if var of this class
    // will be initialize whithin it.
    public Food(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
        super(id, name, price, rating);
        this.bestBefore = bestBefore;
    }

    //    public Food(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
//        super(id, name, price, rating);
//        this.bestBefore = bestBefore;
//    }

    /** Get de value of bestBefore date from the Product.
     *
     * @return the value of bestBefore
     */
    public LocalDate getBestBefore() {
        return bestBefore;
    }
}
