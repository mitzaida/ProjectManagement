package LabsPmApp;
import LabsPmData.Drink;
import LabsPmData.Food;
import LabsPmData.Product;
import LabsPmData.Rating;

import java.math.BigDecimal;
import java.time.LocalDate;



public class Shop {
    public static void main(String[] args) {
        Product p1 = new Product(101,"TEA", BigDecimal.valueOf(1.99));
       // Product p2 = new Product();
//        Product p2 = new Product(102, "coffee", BigDecimal.valueOf(2.99), Rating.FOUR_STAR);
//        Product p3 = new Product(103,"cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR);

        //FOR  LESSON  6
        // Change p2 and p3 for type new classes created
        Product p2 = new Drink(102, "COFFEE con LESSON 6", BigDecimal.valueOf(2.99), Rating.FOUR_STAR);
        Product p3 = new Food(103, "CAKE    con LESSON 6" , BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(8));


        Product p4 = new Product(104,"cake", BigDecimal.valueOf(4.99), Rating.FOUR_STAR);
        Product p5 = new Product((105)," P5 ", BigDecimal.valueOf(5.99), Rating.ONE_STAR);
        // Due to this constructor was impropetly inicialize, there will be an error on console about
        //  the method Discount_rate

        //Si comento the nor arg contructor of Product, i have to commment this next line and all about it.
        //Product p6Noargs = new Product();  // Due to this constructor was impropetly inicialize, there will be an error on console about

        Product p7  = p3.apllyRating(Rating.THREE_STAR); // USING the M. applyRating created in Product
                                                         // igualo a la reference var p3, but change the rate.


        Product p8 = new Drink(108,"Chocolate", BigDecimal.valueOf(8.99), Rating.EIGHT_STAR);
        // Product p9 = p8; // new Food (109,"Chocolate", BigDecimal.valueOf(9.99), Rating.NINE_STAR, LocalDate.now());
        Product p9 = new Food (109,"Chocolate", BigDecimal.valueOf(9.99), Rating.NINE_STAR, LocalDate.now());


         BigDecimal mz1;

        System.out.println("P1  ="+p1.getId()+"  " + p1.getName() + "   " + p1.getPrice()+ " "+p1.getRating().getStars());
        System.out.println(p1.getDiscount());
        mz1 = p1.getPrice().subtract(p1.getDiscount());

        System.out.println("El nuevo precio i guess: "+
                mz1);
        System.out.println("Again the price neto: "+  p1.getPrice().subtract(p1.getDiscount()) );

        System.out.println("P2  = "+ p2.getId()+ "  "+p2.getName()+"  "+p2.getPrice()+ "  "+p2.getDiscount()+" " +p2.getRating().getStars());
        System.out.println("P3  = "+ p3.getId()+ "  "+p3.getName()+"  "+p3.getPrice()+ "  "+p3.getDiscount()+" " +p3.getRating().getStars() + " " + LocalDate.now().plusDays(4));
        System.out.println("P4  = "+ p4.getId()+ "  "+p4.getName()+"  "+p4.getPrice()+ "  "+p4.getDiscount()+" " +p4.getRating().getStars());
        System.out.println("p5 =  "+ p5.getId()+ "  "+p5.getName()+"  "+p5.getPrice()+ "  "+p5.getDiscount()+"  "+p5.getRating().getStars() );

        // Efectivamente dio error on console.
        // Ok now we are going to invoke another constructor in the class Product passing the values.
        //System.out.println("p6 = " + p6Noargs.getId()+ " " + p6Noargs.getName() +"\n" + p6Noargs.getPrice()+" "+ p6Noargs.getDiscount()+ "  "+  p6Noargs.getRating().getStars() );
        System.out.println("The id and the price of P6Noarg, are 0 and 0,0 but the method Discount_rate works. \n" +
                " In addition due to doesn't have the 4 parameter Rating, the constructor userd internally NOT_RATED, which is " +
                " defined within the ENUM Ratin.");
        System.out.println(" \n ****** HASTA AQUI ES LA PRACTICA 1 Y 2 DE LA LESSON 5 DE JAVA SE 11 PROMO25.  *****");


        System.out.println(" \n *********************   BEGIN Practice 3 of Lesson 5 ---->  MAKE PRODUCT IMMUTABLE  *****"  +
                "\n Aditional make a replica of ref var p3 in  p7 but changes the Rating at the end." );
        System.out.println("p7 = p3  See the results on console = " + p7.getId()+ " " + p7.getName() +" " + p7.getPrice()+" "+ p7.getDiscount()+ "  "+  p7.getRating().getStars() );


        System.out.println(" \n\n LESSON 6  INHERITANCE  PRACTICE 6-2. \n" );
        System.out.println("No quiero imprimir todas las properties a pie, sino con el toString y " +
                " haciendo override y polimorphism .");


        System.out.println("\n  Con toString() Activo in Product :  ");
        System.out.println(" Aqui sólo estoy imprimiendo en la console p1, p2, p3, p4 y  p5, nada más. \n" +
                " La data en si, la está trayendo del toString in Product haciendo Override y polimor para la fecha.\n");

        System.out.println("P1  = "+p1);
        System.out.println("P2  = "+p2);
        System.out.println("P3  = "+p3);
        System.out.println("P4  = "+p4);
        System.out.println("p5 = " +p5);
        System.out.println("P8  = "+p8);
        System.out.println("p9 = " +p9);
        System.out.println("  P8  equals  P9  = " + p8.equals(p9));


        System.out.println("  HASTA AQUI PRACTICE OF LESSON 6 ,  6-2  PART 1 .  VAMOS a la  6-2 PART 2.");

    }   //  Fin de M. main.

}
