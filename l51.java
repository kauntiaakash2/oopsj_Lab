import java.util.*;
abstract class student
{
    int roll_no;
    long reg_no;
    void getinput(int roll_no, long reg_no)
    {
        this.roll_no = roll_no;
        this.reg_no = reg_no;
    }
    abstract void course();
}
class kiitian extends student
{
    void course()
    {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }
}
public class l51
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        student s1 = new kiitian();
        s1.getinput(sc.nextInt(), sc.nextLong());
        s1.course();
        sc.close();
    }
}