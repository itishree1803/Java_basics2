import java.util.Scanner;

public class Array2DSum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
      
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        int sum = 0;

        System.out.println("Enter " + (rows * cols) + " elements:");
        for (int i = 0; i < rows; i++) 
            for (int j = 0; j < cols; j++) 
                sum += arr[i][j] = sc.nextInt();
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
