import java.util.*;

class plate
{
    double length;
    double width;
    plate(double length, double width)
    {
        this.length=length;
        this.width=width;
    }
    void display()
    {
        System.out.println(length+" "+width);
    }
}

class box extends plate
{
    double height;
    box(double length, double width, double height)
    {
        super(length,width);
        this.height=height;
    }
    void display()
    {
        System.out.println(length+" "+width+" "+height);
    }
}

class woodbox extends box
{
    double thick;
    woodbox(double length, double width, double height, double thick)
    {
        super(length,width,height);
        this.thick=thick;
    }
    void display()
    {
        System.out.println(length+" "+width+" "+height+" "+thick);
    }
}

public class l42
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double length =  sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        double thick =  sc.nextDouble();
        plate o1;
        o1 = new plate(length, width);
        o1.display();
        o1 = new box(length, width, height);
        o1.display();
        o1 = new woodbox(length, width, height, thick);
        o1.display();
        sc.close();
    }
}