import java.util.*;
class Lab2_2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        boolean[] visited = new boolean[size];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
            visited[i] = false;
        }
        System.out.println("Occurrences of each element:");
        for (int i = 0; i < size; i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println("Occurrence of " + numbers[i] + " = " + count);
        }
        sc.close();
    }
}