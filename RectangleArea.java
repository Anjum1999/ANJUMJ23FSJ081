package openlabBook;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Rectangle:");
		double length=scan.nextDouble();
		System.out.println("Enter the width of Rectangle:");
		double width=scan.nextDouble();
		double area=length*width;
		System.out.println("Area of Recatangle is:" + area);

	}

}
