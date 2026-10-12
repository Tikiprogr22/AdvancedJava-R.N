package itemployee;

public class ItEmployee {

	public static void main(String[] args) {
		  
        // We use String because names contain letters and spaces, not numbers.
        String employeeName = "Alicia Taylor";
        // It is best here because the title is not a calculation.
        String jobTitle = "Help Desk Technician";
        // Strings are used for words and phrases in Java.
        String department = "Information Technology";

        // int stores whole numbers without decimals.
        // This is best for years of experience because you count years as a whole number.
        int yearsExperience = 7;

        // double stores decimal numbers, so it is the best type for pay rates like 36.50.
        // We use double because money can include cents, which are decimals.
        double hourlyPayRate = 36.50;

        // final means this value cannot be changed later.
        // int is best here because 40 is a whole number and it represents a fixed workweek.
        final int HOURS_PER_WEEK = 40;

        // This calculates weekly gross pay.
        // double is used because multiplying pay rate by hours may produce a decimal value.
        double weeklyGrossPay = hourlyPayRate * HOURS_PER_WEEK;

        // This prints the section title to make the output easy to read.
        System.out.println("IT Employee Profile");
        // This prints a line under the title for formatting.
        System.out.println("-----------------");
        // This prints the employee's name with a label.
        System.out.println("Name: " + employeeName);
        System.out.println("Title: " + jobTitle);
        System.out.println("Department: " + department);
        System.out.println("Years of Experience: " + yearsExperience);
        // printf is used because we want exactly two digits after the decimal point.
        // %.2f means "format this number with 2 decimal places".
        System.out.printf("Hourly Pay Rate: $%.2f%n", hourlyPayRate);
        // This prints the number of hours worked per week.
        System.out.println("Hours Per Week: " + HOURS_PER_WEEK);
        // printf is used again so the weekly pay shows as money with two decimal places.
        System.out.printf("Weekly Gross Pay: $%.2f%n", weeklyGrossPay);
    }

	}


