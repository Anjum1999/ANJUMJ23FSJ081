package openlabBook;

import java.util.Scanner;

public class SquareArea {

	public static void main(String[] args) {
		System.out.println("Enter Side of Square:");
		Scanner scan=new Scanner(System.in);
		double side=scan.nextDouble();
		double area=side*side;
		System.out.println("Area of Square is:" + area);

	}

}
