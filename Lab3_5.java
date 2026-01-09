import java.util.*;
class Lab3_5
{
    void area(double radius)
    {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
    void area(double base, double height)
    {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
    void area(int side)
    {
        int area = side * side;
        System.out.println("Area of Square: " + area);
    }
    public static void main(String[] args)
    {
        Lab3_5 obj = new Lab3_5();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Enter radius of the circle:");
                double radius = sc.nextDouble();
                obj.area(radius);
                break;
            case 2:
                System.out.println("Enter base and height of the triangle:");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                obj.area(base, height);
                break;
            case 3:
                System.out.println("Enter side of the square:");
                int side = sc.nextInt();
                obj.area(side);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        sc.close();
    }
}