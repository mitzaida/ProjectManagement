//package com.arrayList;
//import com.google.api.SystemParameterOrBuilder;
//
//import java.util.*;
//
//// This is the main class.
//public class UsoEmpleado {
//
//    private static ArrayList<Empleado> empleadoArrayList;
//   // private static ArrayList<Seccion> seccionArrayList;  // Var de class
//
//    public static void maiin(String[] args) {
//
//        // Declaro el array listaEmpleados de size 3.
////        Empleado listaEmpleados[] = new Empleado[3];
////        listaEmpleados[0] = new Empleado("Ana", 45, 2500,0);
////        listaEmpleados[1] = new Empleado("Antonio", 55, 5000,1);
////        listaEmpleados[2] = new Empleado("Machy", 50, 10000,2);
//
//        // Now usando ARRAYLIST.  Los ArrayList solo almacenan objetos no primitives vars.
//        // No es un arreglo, es una lista.
//        // Se usa el constructor por defecto de la clase ArrayList:  new ArrayList<    almacena
//        // un espacio en memoria los 10 elementos en este caso porque este constructor
//        // que seleccionamos es el que crea la lista en blanco con un max de 10 elementos.
//        // Un ArrayList NO TIENE índices.
//
//        empleadoArrayList = new ArrayList<Empleado>();
//        // ArrayList<Seccion>   mySecciones    = new ArrayList<Seccion>();
//        //seccionArrayList = new ArrayList<Seccion>;
//
//        // Una vez que se sabe exactly cuántos items tendrá el arraylist,
//        // se puede hacer lo siguiente, y se hace para ahorrar recursos, BUT caemos en lo
//        // mismo del metodo constructor arrayList()  (sin parámetros hasta 10)
//        // Pues ahora comentaremos el ensureCapacity()
//        // Este method ensureCapacity se hace after of the ArrayList declaration.
//        // listaEmpleados.ensureCapacity(11);  // Ahora trataré de add more items and so will be the same before.
//
//
//        //Para agregar elementos dentro de una arraylist se usa el metodo add de la siguiente forma:
//        // nombre del arraylist.add()  dependiendo de lo que se requiera.
//
//        //Además está invocando al método constructor del Empleado pasando estos parameters
//        //Y para agregar elementos en las ARRAYSLIST hay
//        // que usar el method: add con su argumento de type Empleado en este caso.
//
//        //The method add agregar en orden, al final del último y asi sucesivamente.  PAra insertar en
//        // cualquier otro lugar o posición del arreglo NO SE PUEDE usar el índice como en otros
//        //lenguajes de programación SINO que debemos usar otros dos metodos de la clase ArrayList.
//        empleadoArrayList.add(new Empleado("Ana", 45, 2500, 91, 3));
//        empleadoArrayList.add(new Empleado("Antonio", 55, 5000, 190, 2));
//        empleadoArrayList.add(new Empleado("Machy", 50, 10000, 1422, 1));
//        // otro objeto de tipo Empleado sin preocuparnos por la size.
//        empleadoArrayList.add(new Empleado("Machy2", 10, 2200, 330, 4));
//        empleadoArrayList.add(new Empleado("Machy3", 10, 3500, 400, 2));
//
//        System.out.println(empleadoArrayList.size());  // to see the length of the arrayList at this point
//        System.out.println("\n");
//
//        empleadoArrayList.add(new Empleado("Ana", 45, 2500, 4121, 2));
//        empleadoArrayList.add(new Empleado("Antonio", 55, 5000, 627, 1));
//        empleadoArrayList.add(new Empleado("Machy7 ", 50, 10000, 704, 3));
//
//        // otro objeto de tipo Empleado sin preocuparnos por la size.
//        empleadoArrayList.add(new Empleado("Machy 8", 10, 2200, 801, 2));
//        empleadoArrayList.add(new Empleado("Machy4", 10, 4000, 920, 4));
//
//        // Add dos más para ver el efecto ya que el method add, only add 10 items
//        empleadoArrayList.add(new Empleado("Machy2", 10, 2200, 101, 3));
//        empleadoArrayList.add(new Empleado("Machy4", 10, 4000, 119, 4));
//        empleadoArrayList.add(new Empleado("Machy 12 y es sólo hasta 11 , so increse auto. ", 15, 5500, 120, 1));
//
//
//        System.out.println(empleadoArrayList.size());  // to see the length of the arrayList at this point
//        System.out.println("\n");
//
////        seccionArrayList.add(new Seccion(1, "Ventas"));
////        seccionArrayList.add(new Seccion(2, "Compras"));
////        seccionArrayList.add(new Seccion(3, "Atención al Cliente"));
////        seccionArrayList.add(new Seccion(4, "Facturación"));
//////aqui
////        for (int y = 0; y < seccionArrayList.size(); y++) {
////            Seccion machy = seccionArrayList.get(y);
////            System.out.println(machy.buscaDes());
////        }
//
//
//        // Ahora bien con el fin de optimizar resources, we can use another method called
//        // trimToSiza() que recorta el tamaño de memory no usado o  closes the arrayList y
//        // el garbage collector o recolector de basura borre ese exceso de memory.
//        // El trimToSize is after all adds.
//        // Ahora comentamos este trimToSize()
//        //listaEmpleados.trimToSize();  //  Igualmente si se agregan more items, it will works fine.
//        // so quedamos igual que los dos metodos before.
//
//
//        // Los métodos SET y GET del a clase ArrayList se usan para:
//        // SET :  permite incluir o reemplazar un objeto dentro de un ArrayList en una posición en concreto.
//        // GET : obtener qué elemento hay dentro de un ArrayList en una posición en concreto.
//        // Es como manejar los indices de un Arreglo (array) pero en JAVA es con métodos para el ArrayList.
//        // El primer elemento comienza en la posición cero (0).
//
//        // listaEmpleados.add(new Empleado("Mitzaida LAST LAST 13 add after to use trimToSize(), so increse auto. ", 15, 5500,13));
//        // Este item ya será en la posición 13 sino en la posición 1 del ArrayList n la consola.
//
//                              // *************     SET   Y   GET    ************
//        //listaEmpleados.set(1,new Empleado("Mitzaida LAST LAST 13 add after to use trimToSize(), so increse auto. ", 15, 5500,13));
//        //String mz1 = listaEmpleados.get(4).dameDatos();
//
//
//        //System.out.println("Imprimiendo solo una posición que está la var de tipo empleado llamada mz : "+
//        //        "\n" + mz1);
//
//
//        //System.out.println(listaEmpleados.size());
//
//        // Remember an ArrayList doesn't have indexes, de modo que no se puede recorrer
//        // la lista desde 0 hasta el final.  Para ello vamos a usar un ciclo for convenecional
//        // que es más complex y usando el method size perteneciente a la clase ArrayList.
//
//        System.out.println("\n" + "#1 From here printing by an ArrayList: listaEmpleados NO CONVENTIONAL FOR");
//        for (Empleado indice : empleadoArrayList) {
//            System.out.println(indice.dameDatos());
//            //System.out.println("\n");
//        }
//
//        //Bien, now a for convencional using the ArrayList.  Incrementa la i de uno en uno.
//        // Este es un ArrayList convencional.
//
//        System.out.println("\n" + "#2 From here printing by an ArrayList: listaEmpleados, CONVENTIONAL FOR.");
//        for (int i = 0; i < empleadoArrayList.size(); i++) {
//            Empleado items = empleadoArrayList.get(i);
//            System.out.println(items.dameDatos());
//        }
//
//
//        System.out.println("\n" + "#3 From here printing by an Array: myArrayEmpleados[i], after it is filled from the ArrayList.");
//
//        // Now copying the ArrayList to a conventional Array
//        Empleado myArrayEmpleados[] = new Empleado[empleadoArrayList.size()];
//        empleadoArrayList.toArray(myArrayEmpleados);
//
//        for (int i = 0; i < myArrayEmpleados.length; i++) {
//            //System.out.println(myArrayEmpleados[i].dameDatos());
//
//            //  Tengo que Extraer de lo q retorna dameDatos el sec.
//            String mz2;
//            mz2 = empleadoArrayList.get(i).dameDatos();
//
//            System.out.println("Ver qué tiene mz2 = " + mz2);   //tiene todo hasta sec
//            String mz3 = mz2.substring(107, 108);
//            System.out.println("MZ3 tiene: " + mz3);
//
// //           for (int z = 0; z < 7; z++) {
////                String mz4;
////                mz4 = seccionArrayList.get(z).buscaDes();
////                If (mz3 == mz4.substring(107,108)) {
////                    System.out.println("EMPLEADO--->"+mz2+" " +mz4);
////                    System.out.println();
////                }
////          }
//
//                //String mz3 = mz2.substring(5,mySecciones.size()-1 );
//
//                //System.out.println("Now mz3 = " + mz3);
//                System.out.println("\n");
//                //System.out.println(myArrayEmpleados[i].dameDatos() + mySecciones.get(sec).buscaDes());
// //           }
////
////         String mz;
////        // i will try here to create another code with loop For.  Let's see.
////        for (Empleado iz : listaEmpleados ) {
////
////            mz = iz.dameDatos();  // asigno en mz lo q devuelve el metodo dameDatos en la clase Empleado
////
////            System.out.println("Imprimiendo posición iz que funge como índice tipo Empleado: " + iz + "\n");
////            // Acá imprime los datos que se igualaron desde el metodo dameDatos.
////
////            System.out.println(mz);
////        }
//        }
//    } // fin de Main Method within UsoEmpleado.
//} // Fin de la clase UsoEmpleado
//
//
///** Empleado Class only has 3 datos from each empleado.
// *  and the class is inside the main class which is UsoEmpleado
// *
// */
//class Empleado {
//    // Encapsulo estas 3 vars de la clasa Empleado.  Ya van 5 vars.
//    private String name;
//    private int edad;
//    private double salary;
//    private int id;
//    private int sec;
//
//
//    // Defino un constructor of Empleado recibiendo 3 parámetros y asigno estos
//    // argumentos a las variable de la clase Empleado.
//
//    public Empleado(String name, int edad, double salary, int id, int sec) {
//        //public Empleado(String name, int edad, double salary, int id) {
//        this.name = name;
//        this.edad = edad;
//        this.salary = salary;
//        this.id = id;
//        this.sec = sec;
//    }
//
//
//    // Defino un method any in Empleado class to print something cuyo objective is give me
//    // los datos que establecí enel constructor, ya que esto crea objetos de tipo Empleado.
//
//    public String dameDatos() {
//
////        return "El empleado # "+id+" se llama:"+name+". Tiene "+edad+" años."+
////                " Tiene un salario de "+salary+" pesos." + "Y trabaja en la sección de: " + sec;
////                //" Tiene un salario de "+salary+" pesos. Y trabaja en la sección de: " + desseccion;
//
//    }
//}
//
//
//
///** This class is to see iin which departmente works the employer
// *  and it's my own idea, to see what can i do, with arrays an for cicles.
// */
////class Seccion {
////    private int sec;
////    private String desseccion;
////
////    public Seccion(int sec, String desseccion) {
////        this.sec = sec ;
////        this.desseccion = desseccion;
////    }
////
////    public String buscaDes() {
////
////        return  sec + "  " + desseccion;
////
////    }
////}