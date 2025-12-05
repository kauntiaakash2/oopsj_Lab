import java.util.*;
class FirstProgram
{
    public static void main(String[] args)
    {
        String name, rollNo, section, branch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name:");
        name = sc.nextLine();
        System.out.println("Enter the Roll.no:");
        rollNo = sc.nextLine();
        System.out.println("Enter the Section:");
        section = sc.nextLine();
        System.out.println("Enter the Branch:");
        branch = sc.nextLine();
        System.out.println("=========OUTPUT=========");
        System.out.println("Name: "+name);
        System.out.println("Roll.no: "+rollNo);
        System.out.println("Section: "+section);
        System.out.println("Branch: "+branch);
    }
}