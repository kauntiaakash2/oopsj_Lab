import java.util.*;
class Box
{
    int length;
    int width;
    int height;
    Box(int l, int w, int h)
    {
        length = l;
        width = w;
        height = h;
    }
    int volume()
    {
        return length * width * height;
    }
}
class Lab3_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length, width and height of the box: ");
        int l = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        Box box = new Box(l, w, h);
        int vol = box.volume();
        System.out.println("Volume of the box: " + vol);
        sc.close();
    }
}