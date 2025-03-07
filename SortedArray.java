import java.util.Scanner;

public class ArraySortedCheck 
{

    public static boolean isArraySorted(int[] arr) 
    {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        if (isArraySorted(arr)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }

        scanner.close();
    }
}

