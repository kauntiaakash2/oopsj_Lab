import java.util.*;

class Rectangle
{
    int length;
    int breadth;
    int area;
    int perimeter;
    void read()
    {
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        breadth = sc.nextInt();
    }
    void calculate()
    {
        perimeter = 2*(length+breadth);
        area = length*breadth;
    }
    void display()
    {
        System.out.println("Perimeter: "+ perimeter);
        System.out.println("Area: "+ area);
    }
}
class Lab3_2
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        r.read();
        r.calculate();
        r.display();
    }
}