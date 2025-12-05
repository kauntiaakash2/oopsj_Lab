import java.util.*;
class ProgThird {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3-digit number:");
        a = sc.nextInt();
        int ans = 0;
        ans += a%10;
        a = a/10;
        ans += a%10;
        a = a/10;
        ans += a%10;
        System.out.println("The Sum is: "+ans);
    }
}