import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
      
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
      
        int maxValue = arr[0], minValue = arr[0];
        for (int num : arr) {
            if (num > maxValue) maxValue = num;
            if (num < minValue) minValue = num;
        }

        System.out.println("Max element: " + maxValue + ", Min element: " + minValue);

        sc.close();
    }
}
