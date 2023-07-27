package openlabBook;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a value for m...:");
		int m=scan.nextInt();
		System.out.println("Enter a value for n...:");
		int n=scan.nextInt();
		int mul=m*n;
		System.out.println("The Multiplication of m and n is.....:" + mul);

	}

}
