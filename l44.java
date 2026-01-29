import java.util.*;

class account
{
    double balance;
    long acc_no;
    account(){};
    void input(Scanner sc)
    {
        balance=sc.nextDouble();
        acc_no=sc.nextLong();
    }
    void disp()
    {
        System.out.print(balance+" "+acc_no+" ");
    }
}
class person extends account
{
    String name;
    long aadhaar_no;
    void input(Scanner sc)
    {
        name=sc.next();
        aadhaar_no =sc.nextLong();
        super.input(sc);
    }
    @Override
    void disp()
    {
        System.out.print(name+" "+ aadhaar_no +" "+balance+" "+acc_no);
        System.out.println();
    }
}
public class l44
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        account[] a=new account[3];
        for(int i = 0; i < 3; i++)
        {
            a[i] = new person();
            a[i].input(sc);
        }
        for(int i = 0; i < 3; i++)
        {
            a[i].disp();
        }
        sc.close();
    }
}