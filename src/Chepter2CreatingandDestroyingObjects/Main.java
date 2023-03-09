package Chepter2CreatingandDestroyingObjects;

import java.awt.*;

class Item
{
     public static void item1()
     {
//         pointClass point = new pointClass(20,50);
//         pointClass point1 = new pointClass(22,52,-1);
//
//         System.out.println(point);
//         System.out.println(point1);
//

         pointClass point = pointClass.fromAsItIs(20,50);
         pointClass point1 = pointClass.fromDoubelAndHalfCordinat(22,52);

         System.out.println(point);
         System.out.println(point1);
     }

     public static  void item2()
     {
        personalInfomation personalInfomation1 = new personalInfomation.Builder().setName("sanny").setCollageName("daiict").build();
         System.out.println(personalInfomation1);
     }
}

public class Main {
    public static void main(String[] args)
    {
        Item.item2();
    }
}