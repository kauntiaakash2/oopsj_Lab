import java.util.*;
class Lab2_2_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row & column: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][] arr = new int[row][col];
        int rightSum = 0;
        int leftSum = 0;
        System.out.println("Enter values: ");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                arr[i][j] = sc.nextInt();
                if(i == j) leftSum += arr[i][j];
                if(i + j == (row - 1)) rightSum += arr[i][j];
            }
        }
        System.out.println("LEFT: " + leftSum);
        System.out.println("RIGHT: " + rightSum);
    }
}