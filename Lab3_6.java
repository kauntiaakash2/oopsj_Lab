import java.util.*;
class Lab3_6
{
    int length;
    int breadth;

    // Default constructor
    Lab3_6()
    {
        this.length = 0;
        this.breadth = 0;
    }

    // Parameterized constructor
    Lab3_6(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    void area()
    {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Using default constructor
        Lab3_6 rect1 = new Lab3_6();
        System.out.println("Using default constructor:");
        rect1.area();

        // Using parameterized constructor
        System.out.println("Enter length and breadth of the rectangle:");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        Lab3_6 rect2 = new Lab3_6(length, breadth);
        System.out.println("Using parameterized constructor:");
        rect2.area();

        sc.close();
    }
}