package LabsPmData;

import java.math.BigDecimal;
import java.math.RoundingMode;
import static java.math.RoundingMode.HALF_UP;
import static LabsPmData.Rating.*;

public class Product {
    private int id;
    private String name;
    private BigDecimal price;
    private Rating rating;

    public Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product(int id, String name, BigDecimal price) {
        this(id, name, price, NOT_RATED);
    }

    public  Product() {}

    // Var Discount_Rate for calculating the discount of price, in the method getDiscount().
    public static BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);


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
        //price=BigDecimal.ONE;

        this.price = price;
    }

    /** Creating a doc about the method:
     *  getDiscount() .  MZ
     * @return MACHY2021S
     */
    public BigDecimal getDiscount() {

        return price.multiply(DISCOUNT_RATE).setScale(2 , HALF_UP);

    }

    public Rating getRating() {
        return rating;
    }


}
