package closelabBook;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySorter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter 'A' for ascending order or 'D' for descending order: ");
        char order = scanner.next().charAt(0);
        if (order == 'A' || order == 'a') {
            // Sort in ascending order
            Arrays.sort(arr);
            System.out.println("Sorted array in ascending order:");
        } 
        else if (order == 'D' || order == 'd') {
            // Sort in descending order
            Arrays.sort(arr);
            for (int i = 0; i < n / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[n - 1 - i];
                arr[n - 1 - i] = temp;
            }
            System.out.println("Sorted array in descending order:");
        } 
        else {
            System.out.println("Invalid input! Please enter 'A' or 'D'.");
            scanner.close();
            return;
        }

        // Display the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();




	}

}
