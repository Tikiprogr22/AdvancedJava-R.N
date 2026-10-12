// Created by: La'Tysha Turner
// Date: 10/03/2026
// Created a program that displays letter grade, GPA, and pass or fail for the student and test scores the user inputs.

package studentgrade;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter student name: ");
		String studentName = input.nextLine();
		
		System.out.println("Enter score 1: ");
		int score1 = input.nextInt();
		System.out.println("Enter score 2: ");
		int score2 = input.nextInt();
		System.out.println("Enter score 3: ");
		int score3 = input.nextInt();

		double average = (score1 + score2 + score3) / 3.0;

		System.out.println("Student: " + studentName);
		System.out.printf("Average: %.2f%n" , average);
		
		String letterGrade;
		if (average >= 90) {
			letterGrade = "A";
		}
		else if (average >= 80) {
			letterGrade = "B";
		}
		else if (average >= 70) {
			letterGrade = "C";
		}	
		else if (average >= 60) {
				letterGrade = "D";
		}
		else {
			letterGrade = "F";
		}
		System.out.println("Grade: " + letterGrade);
		
		String passFail;
		if (average >= 60) {
			passFail = "PASS";
			
		} else {
			passFail = "FAIL";
		}
		System.out.println("Pass/Fail: " + passFail);
		
		input.close();
		import.close();
	}

}

/* per claude
 * Your program stores a students name and three test scores. It adds the three
 * scores together, divides the total by three to calculate an average, stores
 * that result as a double, and then displays the students name and average. Two
 * improvements I recommend are adding letter-grade logic with if / else if /
 * else and using Scanner so the user can enter the students name and scores
 * instead of having "Jordan", 85, 90, 70 permanently written into the code
 */
