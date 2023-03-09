package Chapter6AnnotationAndEnums;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;


class test
{
    public static void sample1()
    {
        for(status s : status.values())
        {
            System.out.println(s+" ---> "+s.ordinal());
        }

        double earthWeight = 1000000;
        double mass = earthWeight / Planet.EARTH.surfaceGravity();

        for (Planet p : Planet.values()){
            System.out.printf("Weight on %s is %f%n",
                    p, p.surfaceWeight(mass));
        }

        double x= 10;
        double y= 3;

        for(Operation operation:Operation.values())
        {
            System.out.printf("%s --> %f%n",operation,operation.apply(10,3));
        }

        Operation operation = Operation.Newop;

        operation.apply(x,y);

        for(PayrollDay payrollDay : PayrollDay.values())
        {
            System.out.print(payrollDay);
            System.out.println(payrollDay.pay(100,20));
        }


        for(Ensemble ensemble : Ensemble.values())
        {
            System.out.print(ensemble + "--->");
            System.out.println(ensemble.numberOfMusicians());
        }
    }

    public static void sample2()
    {
       Plant[] garden = new Plant[4];

        garden[0] = new Plant("Tomato", Plant.LifeCycle.ANNUAL);
        garden[1] = (new Plant("Rose", Plant.LifeCycle.PERENNIAL));
        garden[2] = (new Plant("Carrot", Plant.LifeCycle.BIENNIAL));
        garden[3] = (new Plant("Lavender", Plant.LifeCycle.PERENNIAL));

        Map<Plant.LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(Plant.LifeCycle.class);

        for (Plant.LifeCycle lc : Plant.LifeCycle.values())
            plantsByLifeCycle.put(lc, new HashSet<>());

        for (Plant p : garden)
            plantsByLifeCycle.get(p.getLifeCycle()).add(p);

        System.out.println(plantsByLifeCycle);

        System.out.println(Arrays.stream(garden)
                .collect(groupingBy(p -> p.getLifeCycle())));


    }

    public static void sample3()
    {
        Phase fromPhase = Phase.SOLID;
        Phase toPhase = Phase.LIQUID;

        Phase.Transition transition = Phase.Transition.from(fromPhase, toPhase);
        System.out.println("Transition from " + fromPhase + " to " + toPhase + " is " + transition);
    }

    public static  void LambdaExpression()
    {
         functionInterface functionInterface =  new functionInterfaceImp();
         functionInterface.firstFunctionInterface();
         functionInterface functionInterface1 = new functionInterface() {
             @Override
             public void firstFunctionInterface() {
                 System.out.println("yes this is second Chapter6AnnotationAndEnums.functionInterface ");
             }
         };
         functionInterface1.firstFunctionInterface();


        functionInterface functionInterface2 = () -> System.out.println("yes this is third Chapter6AnnotationAndEnums.functionInterface");
        functionInterface2.firstFunctionInterface();

        SumOfValue sov = (a,b,c) -> a+b+c;
        System.out.println(sov.sum(10,20,30));
        System.out.println(sov.sum(30,40,50));


    }

    public static void streamDemo()
    {
        List<Integer> list = List.of(10,20,45,13,11,51,60,70);

        List<Integer> list1 = list.stream().filter(i->i%2==1).collect(Collectors.toList());

        System.out.println(list1);

        list.stream().map(i->i*i).sorted().forEach(i-> System.out.println(i));

        System.out.println(list.stream().min((x,y) -> x.compareTo(y)).get());

    }

    public static  void annotation()
    {
        myAnnotationClass myAnnotationClassObj = new myAnnotationClass();
        Class c = myAnnotationClassObj.getClass();

        System.out.println(c.getName());

       myAnnotation myAnnotationObj = (myAnnotation) c.getAnnotation(myAnnotation.class);

        System.out.println(myAnnotationObj.value());
        System.out.println(myAnnotationObj.name());
        System.out.println(myAnnotationObj.city());

    }
}
public class Main {
    public static void main(String[] args)
    {
       test.annotation();
    }
}