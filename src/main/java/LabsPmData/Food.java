package LabsPmData;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Food extends Product  {
    private LocalDate bestBefore;

    // Due to this class is extended class Product, in the constructor of class Food WE HAVE to
    // indicate the super class which is extended with de arguments of parameteres.
    public Food (int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
        super(id, name, price, rating);
        this.bestBefore = bestBefore;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }


    @Override
    public String toString () {
       // return " VER VER VER ****  -->   Food{" + " bestBefore = " +bestBefore + "}";
        return super.toString()+ " \n Imprimo lo siguiente desde Food \n" +
                "  está ahora retornando desde el M. toString of Food, la fecha \n" +
                " bestBefore.  Y aqui está el POLIMORPHISM in action usando en el \n" +
                " return del M. toString in Food, la keyword super.toString() ---> Fecha es : "+bestBefore +
                " \n y estoy imprimiendo en console el toString completo más la fecha que tengo en esta " +
                " clase Food, el M. get de ella que es el getBestBefore, pero su valor se coloca \n" +
                " realmente es en la clase Shop.";
    }





    // With this constructor of Food, the app runs if the non arg constructor of product is commented and
    // will runs too, if the non arg constructor of product is not commented.  But not will runs if the
    // constructor of Product is commented and this constructor of the food not exists or is commented too.

    //Now the constructor of product is active, taht's why this constructor is not necessary.
//    public Food () {
//        super(0,"Probando con la keyword  super " , BigDecimal.ZERO ,Rating.NOT_RATED);
//    }




}  // Fin de Food
