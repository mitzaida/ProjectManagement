package LabsPmApp;
import LabsPmData.Product;
import LabsPmData.Rating;

import java.math.BigDecimal;

public class Shop {
    public static void maiin(String[] args) {
        Product p1 = new Product(101,"TEA", BigDecimal.valueOf(1.99));
       // Product p2 = new Product();
        Product p2 = new Product(102, "coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
        Product p3 = new Product(103,"cake", BigDecimal.valueOf(1.99), Rating.FIVE_STAR);
        Product p4 = new Product(103,"cake", BigDecimal.valueOf(1.99), Rating.FIVE_STAR);

         BigDecimal mz1;

        // Because i commment these instance vars, they were initialized by defaoult values, 0, null and null
//      p1.setId(101);
//      p1.setName("Tea");
//      p1.setPrice(BigDecimal.valueOf(1.99));

        System.out.println("P1  ="+p1.getId()+"  " + p1.getName() + "   " + p1.getPrice()+ " "+p1.getRating().getStars());
        System.out.println(p1.getDiscount());
        mz1 = p1.getPrice().subtract(p1.getDiscount());

        System.out.println("El nuevo precio i guess: "+
                mz1);
        System.out.println("Again the price neto: "+  p1.getPrice().subtract(p1.getDiscount()) );

        System.out.println("P2  = "+ p2.getId()+ " nada "+p2.getName()+"  "+p2.getPrice()+ "  "+p2.getDiscount()+p2.getRating().getStars());
        //Product.DISCOUNT_RATE = BigDecimal.valueOf(0.2);
        System.out.println("P3  = "+ p3.getId()+ " nada "+p3.getName()+"  "+p3.getPrice()+ "  "+p3.getDiscount()+p3.getRating().getStars());
        System.out.println("P4  = "+ p4.getId()+ " nada "+p4.getName()+"  "+p4.getPrice()+ "  "+p4.getDiscount()+p4.getRating().getStars());
    }

}
