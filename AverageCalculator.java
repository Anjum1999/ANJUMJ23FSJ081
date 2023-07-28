package closelabBook;

import java.util.Scanner;

public class AverageCalculator {

	public static void main(String[] args) {
	   
	        Scanner scan = new Scanner(System.in);

	        System.out.print("Enter the number of elements: ");
	        int n = scan.nextInt();

	        double[] numbers = new double[n];
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter element " + (i + 1) + ": ");
	            numbers[i] = scan.nextDouble();
	        }

	        double average = calculateAverage(numbers);
	        System.out.println("Average of the numbers: " + average);

	        scan.close();
	    }

	    public static double calculateAverage(double[] numbers) {
	        double sum = 0.0;
	        for (double num : numbers) {
	            sum += num;
	        }
	        return sum / numbers.length;


	}

}
