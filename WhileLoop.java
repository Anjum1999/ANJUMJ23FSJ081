package openlabBook;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any integer below 10: ");
		num=sc.nextInt();
		while(num<=10) {
			sum=sum+num;
			num++;
		}
		System.out.format("sum of the Numbers from the while loop is: %d", sum);

	}

}
