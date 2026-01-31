import java.util.Scanner;

interface employee
{
    void getDetails();
}

interface manager1 extends employee
{
    void getDeptDetails();
}

class head implements manager1
{
    int empId;
    String empName;
    int deptId;
    String deptName;
    head(int empId, String empName, int deptId, String deptName)
    {
        this.empId=empId;
        this.empName=empName;
        this.deptId=deptId;
        this.deptName=deptName;
    }
    public void getDetails()
    {
        System.out.println(empId+" "+empName);
    }
    public void getDeptDetails()
    {
        System.out.println(deptId+" "+deptName);
    }
}

public class l54
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        manager1 m1 = new head(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
        m1.getDetails();
        m1.getDeptDetails();
        sc.close();
    }
}