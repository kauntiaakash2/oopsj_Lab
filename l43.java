import java.util.*;

class apple
{
    void show()
    {
        System.out.println("This is an Apple");
    }
}
class banana extends apple
{
    @Override
    void show()
    {
        System.out.println("This is a banana");
    }
}
class cherry extends apple
{
    @Override
    void show()
    {
        System.out.println("This is a cherry");
    }
}
public class l43
{
    public static void main(String[] args)
    {
        apple a;
        a=new apple();
        a.show();
        a=new banana();
        a.show();
        a=new cherry();
        a.show();
    }
}