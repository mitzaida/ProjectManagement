package LabsPmData;

import java.math.BigDecimal;
import static java.math.RoundingMode.HALF_UP;
import static LabsPmData.Rating.*;

public class Product {
    // Var Discount_Rate for calculating the discount of price, in the method getDiscount().
    /** A constant that defines a
     * (@link java.math.Bigdecimal Bigdecimal) value of the discount_rate
     * <br>
     * Discount rate is 10 %
     */
    public static BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
    private int id;
    private String name;
    private BigDecimal price;
    private Rating rating;

    public  Product() {
        this(0, "MZ-Non-arg contructor of Product.", BigDecimal.ZERO);
    }


    public Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product(int id, String name, BigDecimal price) {
        this(id, name, price, NOT_RATED);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }


    public void setPrice(final BigDecimal price) {
        //     price = BigDecimal.ONE; //it's make an error after defined the method parameter as final.
        // where you can not change the value of price.
        // Jave ignore the value pass by the invoker, when is reassigned the value of price bofore it
        // becomes a final var.
        //price=BigDecimal.ONE;
        this.price = price;
    }


    /** Calculates discount based on a product price and
     * (@link DISCOUNT_RATE discount_rate)
     * @return a (@link java.math.Bigdecimal Bigdecimal)
     * value of the discount.
     */
    public BigDecimal getDiscount() {

        return price.multiply(DISCOUNT_RATE).setScale(2 , HALF_UP);

    }

    public Rating getRating() {
        return rating;
    }


}
