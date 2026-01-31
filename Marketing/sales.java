package Marketing;

import General.employee;

import java.util.Scanner;

public class sales extends employee
{
    public sales(int empid, String ename, double basic)
    {
        super(empid, ename, basic);
    }
    public double tallowance()
    {
        return (.05*earning());
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        sales s = new sales(sc.nextInt(), sc.next(), sc.nextDouble());
        System.out.println("The emp id of the employee is: "+s.empid);
        System.out.println("The total earning is : "+s.earning());
    }
}