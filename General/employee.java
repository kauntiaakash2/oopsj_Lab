package General;

public class employee
{
    public double basic;
    protected int empid;
    private String ename;
    public employee(int empid, String ename, double basic)
    {
        this.empid=empid;
        this.ename=ename;
        this.basic = basic;
    }
    public double earning()
    {
        return basic+(.8*basic)+(.15*basic);
    }
}