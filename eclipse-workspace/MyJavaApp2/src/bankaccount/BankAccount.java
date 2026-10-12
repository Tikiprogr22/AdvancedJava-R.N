package bankaccount;

public class BankAccount {
	//creates the bank account blueprint
	
		String owner; // Stores the owners name
		double balance; // Stores the account balance
		
		void deposit(double amount) { // Method to add money
			balance = balance + amount; // Adds deposit to balance
		}
		
		void withdraw(double amount) { // Method to take out money
			balance = balance - amount; // Subtracts from balance
		}
		
		void displayBalance() { // Method to show current balance
			System.out.println(owner + " has $ " + balance); // Prints balance
		}
}
