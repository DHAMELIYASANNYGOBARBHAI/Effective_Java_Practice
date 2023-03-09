package Chapter5Generics;


import java.util.ArrayList;
import java.util.List;

public class Main5 {

    public static void main(String args[])
    {

    /*    // Fails at runtime
        Object[] objectArray = new Long[1];
        objectArray[0] ="I don't fit in" ;// Throws ArrayStoreException
        System.out.println(objectArray);*/

//        // Won't compile
//        List<Object> ol = new ArrayList<Long>();//Incompatible types
//        ol.add("I don't fit in")

       /* Glass glass = new Glass();

        // single  type parameter
        Glass<Water> glassOfWater = new Glass<Water>();
        Glass<Juice> glassOfJuice = new Glass<>();

       Water water = new Water();
       Juice juice = new Juice();

       glass.liquid = water;
       glassOfWater.liquid = water;
       glassOfJuice.liquid = juice;

        // need of type casting
       Water water1 = (Water) glass.liquid;

        // no need of type casting
       Water water2 = glassOfWater.liquid;
       Juice juice1 = glassOfJuice.liquid;


        // Multiple type parameter
        Color<Red,Green,Blue> color = new Color<Red, Green, Blue>(new Red(),new Green(),new Blue());


        // use Generic in Method
        Bartender bartender = new Bartender();
        bartender.<Juice,Water>mix(juice,water);

        //Interface and extend class using OrangeJuice.
        Glass2<OrangeJuice> orangeJuice = new Glass2<OrangeJuice>();

        // parameter is not matching because appleJuice has only extends Juice and use Liquid
      //  Glass2<AppleJuice> appleJuice = new Glass2<AppleJuice>();


     Glass<Water> waterGlass = new WineGlass<Water>();

     // it will give error type mismatch
    // Glass<Liquid> liquidGlass = new WineGlass<Water>();


      TTry tTry = new TTry();

     // tTry.add(new Glass<Object>()); it is spiffying class, so it give error


        // when using wildcard then it all the object are work
      tTry.add(new Glass<Object>());
      tTry.add(new Glass<Water>());

      // this both work it and also its lower class Juice2 ---> used by OrangeJuice2-->UpperBoundWildCard (Liquid ---> Juice2 --> OrangeJuice2)
    tTry.add2(new Glass<OrangeJuice2>());
    tTry.add2(new Glass<Juice2>());

   // tTry.add2(new Glass<Liquid>()); it is not working Because it is upper side of the Juice2 ... Liquid --> used by Juice2

        //working of Upper of class we use --> lowerBoundWildCard (cock --> cokeDate ---> cockZero)

        tTry.add3(new Glass<CockDate>());
        tTry.add3(new Glass<Cock>());
        //tTry.add3(new Glass<CockZero>());  ---> this down side of cockdate, so it is not working at all

      //  tTry.add3(new Glass<CockTime>());  ---> it also use Cock, but it is not part of CockDate hierarchies, so it's not working

*/





    }
}
