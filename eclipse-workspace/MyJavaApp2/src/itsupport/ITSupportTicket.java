package itsupport;

import java.util.Scanner;

public class ITSupportTicket {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);   //Scanner=the type of object were creating input=variable name new Scanner = create a new scanner System.in=get information coming into the program
													//So this creates a new scanner named input that listens for what the user types
		// Asks the user to input their name
		System.out.print("Enter your name: ");    
		//Stores the user name entered
		String userName = input.nextLine();     //String=the data type "text" userName=variable name =assigns whats on the right side of the variable on the left input=scanner .nextLine=tells the scanner to read entire line user types
												// basically take the line the user types and store it as text in a variable named userName
		
		
		//Asks the user to input the computer name
		System.out.print("Enter computer name: ");
		//Stores the computer name entered by the user
		String computerName = input.nextLine();
		
		//Asks the user to input the problem their experiencing 
		System.out.print("Problem description: ");
		//Stores the problem entered by the user
		String problemDescription = input.nextLine();
		
		//Asks the user to enter a priority number
		System.out.print("Enter priority (1 = High, 2 = Medium, 3 = Low): ");
		//Stores the priority number entered by the user
		int priority = input.nextInt();			//.nextInt=tells the scanner user will type whole number not text
		
		//Variable called priorityLevel it will hold a string and value later in the code
		String priorityLevel = "High";
		
		//Java making a decision
		if (priority == 1) {					//If this condition is true render High, == will compare 2 values are they equal
			priorityLevel = "High";
		}	
			else if (priority == 2) {			//else if user enters 2 this would render
				priorityLevel = "Medium";
			}
			else if (priority == 3) {
				priorityLevel = "Low";
			}
			else System.out.println("Invalid Entry! Please enter priority (1 = High, 2 = Medium, 3 = Low) ");
		System.out.println(" \n--- IT TICKET SUPPORT ---"); 
		System.out.println("Name: " + userName);   	//Prints out username input by user and automatically goes to the next line
		System.out.println("Computer Name: " + computerName);
		System.out.println("Problem description: " + problemDescription);
		System.out.println("Priority Level: " + priorityLevel);
			
		//Closes the Scanner after we are finished using it
		input.close();
			
	}

}
