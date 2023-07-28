package closelabBook;

import java.util.Scanner;

public class LocateElement {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to find its location: ");
        int target = scanner.nextInt();

        int location = -1; // Initialize location as -1 (not found)
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                location = i;
                break; 
            }
        }

        if (location != -1) {
            System.out.println("Element found at index: " + location);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();


	}

}
