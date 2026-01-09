import java.util.*;
class Lab3_4
{
    void subtract(int a, int b)
    {
        System.out.println("Subtraction of two integers: " + (a - b));
    }
    void subtract(double a, double b)
    {
        System.out.println("Subtraction of two doubles: " + (a - b));
    }
    void subtract(int a, int b, int c)
    {
        System.out.println("Subtraction of three integers: " + (a - b - c));
    }
    public static void main(String[] args)
    {
        Lab3_4 sub = new Lab3_4();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers to subtract:");
        int int1 = sc.nextInt();
        int int2 = sc.nextInt();
        sub.subtract(int1, int2);
        System.out.println("Enter two doubles to subtract:");
        double double1 = sc.nextDouble();
        double double2 = sc.nextDouble();
        sub.subtract(double1, double2);
        System.out.println("Enter three integers to subtract:");
        int int3 = sc.nextInt();
        int int4 = sc.nextInt();
        int int5 = sc.nextInt();
        sub.subtract(int3, int4, int5);
        sc.close();
    }
}