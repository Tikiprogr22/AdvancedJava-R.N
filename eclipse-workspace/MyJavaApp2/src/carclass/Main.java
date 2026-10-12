package carclass;

		public class Main { // This class contains the main method to test the Car class
		    public static void main(String[] args) { // The main method where the program execution begins

		        Car car1 = new Car(); // Create a new Car object named car1
		        car1.make = "Honda"; // Set the make of the car
		        car1.model = "Civic"; // Set the model of the car
		        car1.year = 2020; // Set the manufacturing year of the car
		        car1.speed = 15.5; // Initialize the car's speed to 0 mph  
		        
		        car1.accelerate(); // Increase the car's speed by 10 mph
		        car1.displaySpeed(); // Display the current speed of the car

	}

}
