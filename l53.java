import java.util.*;

interface accounts
{
    void earnings();
    void deduction();
    void bonus();
}

abstract class manager implements accounts {
    double basic;

    manager(double basic) {
        this.basic = basic;
    }
    public void earnings() {
        System.out.println("Earnings: "+(basic+(0.8 * basic)+(.15 * basic)));
    }
    public void deduction() {
        System.out.println("Deduction: "+(.12*basic));
    }
}

class substaff extends manager
{
    substaff(double basic)
    {
        super(basic);
    }
    public void bonus()
    {
        System.out.println("Bonus: "+(0.5*basic));
    }
}

public class l53
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        manager m1 = new substaff(sc.nextDouble());
        m1.earnings();
        m1.deduction();
        m1.bonus();
        sc.close();
    }
}