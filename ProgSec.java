import java.util.*;
import java.math.*;

class ProgSec
{
    public static void main(String[] args)
    {
        float a, b, c, sqrt, ans1, ans2 = 0;
        System.out.println("Enter the coefficient to find the Sqrt:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        sqrt =(float) Math.sqrt((b*b)-(4*a*c));
        ans1 = (-b + sqrt)/(2*a);
        ans2 = (-b - sqrt)/(2*a);
        System.out.println("The 1st root is: "+ans1);
        System.out.println("The 2nd root is: "+ans2);
    }
}