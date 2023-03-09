package Chepter2CreatingandDestroyingObjects;

public class pointClass
{
    private int x;
    private int y;

//    public pointClass(int xx,int yy)
//    {
//        this.x=xx;
//        this.y=yy;
//    }
//
//    public pointClass(int xx,int yy,int dummy)
//    {
//        this.x = xx*2;
//        this.y = yy/2;
//    }

    private  pointClass(int xx,int yy)
    {
        this.x=xx;
        this.y=yy;
    }

   private pointClass(int xx,int yy,int dummy)
    {
        this.x = xx*2;
        this.y = yy/2;
    }


    public static pointClass fromAsItIs(int xx,int yy)
    {
        return new pointClass(xx,yy);
    }

    public static pointClass fromDoubelAndHalfCordinat(int xx, int yy)
    {
        return  new pointClass(xx,yy,-1);
    }

    @Override
    public String toString() {
        return "pointClass{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
