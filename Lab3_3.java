import java.util.*;

class Student
{
    int roll;
    String Name;
    double cgpa;
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Roll_no:");
        roll = sc.nextInt();
        System.out.println("Name:");
        Name = sc.nextLine();
        System.out.println("CGPA:");
        cgpa = sc.nextDouble();
    }
    void display()
    {
        System.out.println("Roll_no: "+roll);
        System.out.println("Name: "+Name);
        System.out.println("CGPA: "+cgpa);
    }
    public static void main(String[] argst)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of entries:");
        int n = sc.nextInt();
        Student s[] = new Student[n];
        /*🔹 Summary table
                Word	What it is
                Student	A class (blueprint)
                new Student()	Creates an object
                s[i]	A reference to a Student object
                Student s[]	An array of Student objects*/
        for(int i = 0; i < n; i++)
        {
            s[i] = new Student();
            s[i].read();
        }
        for(int i = 0; i < n; i++)
        {
            s[i].display();
        }
        double min = s[0].cgpa;
        String minName = s[0].Name;
        for(int i = 1; i < n; i++)
        {
            if(s[i].cgpa < min)
            {
                min = s[i].cgpa;
                minName = s[i].Name;
            }
        }
        System.out.println("Student with lowest CGPA: " + minName);
    }
}