package studentgradeanalyzer;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class GradeAnalyzer {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int [] grades = new int [5];
		
		for (int i = 0; i < grades.length; i++) {
			System.out.println("Enter grade for student " + (i + 1) + ": ");
			grades[i] = input.nextInt();
		}
		
		System.out.println("\nStudent Grades");
		System.out.println("----------------");
		
		for (int i = 0; i < grades.length; i++) {
			System.out.println("Student " + (i + 1) + ": " + grades[i]);
		}
		
		int total = 0;
		
		for (int i = 0; i < grades.length; i++) {
			total += grades[i];
		}
		
		System.out.println("\nTotal Points: " + total);
		
		double average = (double) total / grades.length;
		
		System.out.println("Average Grade: " + average);
		
		int highest = grades[0];
		
		for (int i = 1; i < grades.length; i++) {
			if (grades[i] > highest) {
				highest = grades[i];
			}
		}
		
		System.out.println("Highest Grade: " + highest);

	}

}