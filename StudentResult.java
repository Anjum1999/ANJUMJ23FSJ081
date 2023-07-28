package closelabBook;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scan.nextInt();
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scan.nextInt();
        int[][] marks = new int[numStudents][numSubjects];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = scan.nextInt();
            }
        }
        System.out.println("\nResults:");
        for (int i = 0; i < numStudents; i++) {
            int totalMarks = 0;
            for (int j = 0; j < numSubjects; j++) {
                totalMarks += marks[i][j];
            }

            double averageMarks = totalMarks / (double) numSubjects;
            System.out.println("Student " + (i + 1) + " - Total Marks: " + totalMarks + ", Average Marks: " + averageMarks);
        }

        scan.close();



	}

}
