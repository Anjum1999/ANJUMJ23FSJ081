package openlabBook;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter an Integer:");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		if(num % 2==0)
			System.out.println("Entered Integer is Even");
		else
			System.out.println("Entered Integer is Odd");

	}

}
