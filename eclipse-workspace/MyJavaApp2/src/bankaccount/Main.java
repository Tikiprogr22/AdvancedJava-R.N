package bankaccount;

public class Main {

	public static void main(String[] args) {
BankAccount account1 = new BankAccount(); // Creates account #1
		
		account1.owner = "Tiki Boom"; // Sets owners name
		account1.balance = 1400; // Sets starting balance
		
		account1.deposit(200); // Adds $200
		account1.withdraw(100); // Takes out $100
		account1.displayBalance(); // Shows current balance
		
		BankAccount account2 = new BankAccount();
		
		account2.owner = "Chad Beem";
		account2.balance = 200;
		
		account2.deposit(50);
		account2.withdraw(100);
		
		account2.displayBalance();
		
		BankAccount account3 = new BankAccount();
		
		account3.owner = "Professor R.A. Nibbles";
		account3.balance = 800;
		
		account3.deposit(250);
		account3.withdraw(100);
		
		account3.displayBalance();
	}

	}


