package LabsPmData;
import java.math.BigDecimal;
import static java.math.RoundingMode.HALF_UP;
import static LabsPmData.Rating.*;

public class Product {
    // Var Discount_Rate for calculating the discount of price, in the method getDiscount().
    public static BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
    private int id;
    private String name;
    private BigDecimal price;
    private Rating rating;


    //public  Product() {}  // for now, still runs perfectly whithout this line.

    // Due to the method Discount_rate gets an error on console in the reference var p6Noarg in the class Shop,
    // so, we are going to invoke another constructor here in the non args constructor of Product and pass som values.

    // The constructor i'm invoking here is that which has the same parameters as this one, which internally
    // at the same, this constructo calls or invokes the constructor with 4 parameters, wooooooo.
//    public  Product() {
//        this(0,"Name: Machy in non Args constructor of Prodct, invoking another constructor whit 3 parms which " +
//                " call another constructor internally with 4 params. ", BigDecimal.ZERO);
//    }

    public Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    //This constructor invokes the before one.
    // No this constructor is used too by the non-args constuctor.
    public Product(int id, String name, BigDecimal price) {
        this(id, name, price, NOT_RATED);
    }


                            // Definitions of Getters and Setters

    // Now for Practice 3 of LESSON 5 (last one), We will convert Product  IMMUTABLE:
    // we have to remove the SETTER methods.

    public int getId() {
        return id;
    }
//    public void setId(int id) {
//        this.id = id;
//    }


    public String getName() {
        return name;
    }
//    public void setName(String name) {
//        this.name = name;
//    }

    public BigDecimal getPrice() {
        return price;
    }
//    public void setPrice(final BigDecimal price) {this.price = price;
//    }


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

    // Method de tipo Product el cual recibo un Rate y devolverá un objeto de del Constructor de
    // Product y se accede en Shop con una reference var (p7).
    public Product apllyRating (Rating newRating) {
        // podemos retornar cualquier de las dos sentencias siguientes:
        //return new Product(id, name, price, newRating);
        return new Product(this.id, this.name, this.price, newRating);
    }

    // Este M. se usa en Food para hacer un Reuse del mismo y agregar otros valores además de los de Prodct.
    @Override
    public String toString() {
        return  id + " " +
                name + " " +
                price + " " +
                getDiscount() + " " +
               rating.getStars();
    }
}  // Fin de la clase Product
