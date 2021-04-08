package LabsPmData;

public class Practice2_Types {
    public static void main(String[] args) {
//        byte x=2;
//        byte y=3;
//        byte z=5 ;
        byte x = 2, y = 3, z = 8;
        z = (byte) (x + y);
        System.out.println(" z= " + z + "\n" + " x= " + x + "\n" + " y= " + y);

        float a = (x / (float) y);
        System.out.println(" a only with float to x   = " + a);


        float a1 = (float) (x / y);

        System.out.println(" a1 with float after the = for both x and y  : " + a1);

        System.out.println("aqui imprimiendo directo, sin asignar a una var: " + (float) x / y);

        System.out.println("Hasta aqui fueron las vars FLOAT. " + "\n" + "\n");

        System.out.println("From now will have DOUBLE vars. ");

        double b = x / y;
        System.out.println(" b without double after= " + b + "\n");

        double b1 = (double) x / y;

        System.out.println(" b1 with double post the '=' : " + b1);

        b = a;
        System.out.println(" The new value of b = a : " + b);

        float c = Math.round(b * 1000);
        System.out.println(" The value of c withot div 1000F : " + c);

        float c1 = Math.round(b * 1000) / 1000F;
        System.out.println(" The value of c1 dividiendo entre 1000F  : " + c1);
        System.out.println("c1 dividido entre 1000F fue redondeado a 3 decimales y redondeado el tercer decimal.");

        System.out.println("\n\n\n\n");

        System.out.println("Now we are going to study the char var type. ");

        char a2 = 'a', a3='\141',  a4 = '\u0061' ;
        System.out.println(a2 + " " + a3 + " "+ a4);

        int i1 = 0141, i2 =0x61 , i3 = 054 ;
        System.out.println("valor octagonal de i1  :" + i1);
        System.out.println("valor hexa de i2  :" + i2);

        char a5 = (char)i1 ;
        System.out.println("valor char de a5 = i1 convertido a char : " + a5);
        System.out.println("valor del entero i3 con 0 cero x delante lo toma como otra base numerica: " + i3);


    }
}
