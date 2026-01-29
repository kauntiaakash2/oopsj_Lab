import java.util.*;
class plastic2D
{
    double length;  //  this.length;
    double width;   //  this.width;
    final int cost = 40;
    plastic2D(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    void cost()
    {
        System.out.println("Cost of 2D Obj: " + (length*width)*cost);
    }
}

class plastic3D extends plastic2D
{
    double height;
    final int cost = 60;
    plastic3D(double length, double width, double height)
    {
        super(length, width);
        this.height = height;
    }
    void cost()
    {
        System.out.println("Cost of 3D Obj: " + (length*width*height)*cost);
    }
}
public class l41
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        plastic2D o1 = new plastic2D(length, width);
        o1.cost();

        plastic2D o2 = new plastic3D(length, width, height);
        o2.cost();

        sc.close();
    }
}