package Chapter5Generics;

public class TTry {

    public void add(Glass<?> glass)
    {
        System.out.println(glass);
    }


    public  void add2(Glass<? extends Juice2> glass)
    {
        System.out.println(glass);
    }

    public void add3(Glass<? super CockDate> glass)
    {
        System.out.println(glass);
    }

}
