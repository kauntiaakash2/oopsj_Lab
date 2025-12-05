import java.util.*;
import java.math.*;
class ForthProgram
{
    public static void main(String[] args)
    {
        float a, b, c, s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st side:");
        a = sc.nextFloat();
        System.out.println("Enter 2nd side:");
        b = sc.nextFloat();
        System.out.println("Enter 3rd side:");
        c = sc.nextFloat();
        s = (a+b+c)/2;
        float area = (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle using Heron's Formula: "+area);
    }
}