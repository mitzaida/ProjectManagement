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
        // Is commented these p2 and to make them another ones.
        //Product p2 = new Product(102, "coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
        //Product p3 = new Product(103,"cake", BigDecimal.valueOf(1.99), Rating.FIVE_STAR);

        Product p2 = new Drink(102, "new_Drink_Coffe", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
        Product p3 = new Food(103, "new_Food Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));

        Product p4 = new Product(103,"cake", BigDecimal.valueOf(1.99), Rating.FIVE_STAR);

         BigDecimal mz1;
         LocalDate mz2 = LocalDate.now().plusDays(2);

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

        System.out.println("Valor de mz2: "+
                mz2);

        System.out.println("P2  = "+ p2.getId()+ " nada "+p2.getName()+"  "+p2.getPrice()+ "  "+p2.getDiscount()+p2.getRating().getStars());
        //Product.DISCOUNT_RATE = BigDecimal.valueOf(0.2);

        System.out.println("P3  = "+ p3.getId()+ " nada "+p3.getName()+"  "+p3.getPrice()+ "  "+
                p3.getDiscount()+p3.getRating().getStars() + LocalDate.now().plusDays(2)+ " Valor de mz2 : "+ mz2);
        System.out.println("P4  = "+ p4.getId()+ " nada "+p4.getName()+"  "+p4.getPrice()+ "  "+p4.getDiscount()+p4.getRating().getStars());
    }

}
