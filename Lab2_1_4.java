import java.util.*;
class Lab2_1_4_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numner: ");
        int original = sc.nextInt();
        int number = original;
        int revNumber = 0;
        while(number != 0)
        {
            int digit = number%10;
            revNumber = (revNumber * 10) + digit;
            number = number / 10;
        }
        System.out.println("======OUTPUT======");
        if(revNumber == number) System.out.println(original + "is palindrome.");
        else System.out.println(original + " is not palindrome.");
    }
}