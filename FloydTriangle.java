package openlabBook;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		int rows,num=1,counter,j;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows for floyd's triangle:");
		rows=scan.nextInt();
		System.out.println("Floyd's triangle");
		System.out.println("****************");
		for(counter=1;counter<=rows;counter++) {
			for(j=1;j<=counter;j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
			
		}

	}

}
