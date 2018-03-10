import java.util.Scanner;
public class DogFoodCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number of dogs:");
		int numberOfDogs = input.nextInt();
		System.out.println("Please enter number of days:");
		int numberOfDays = input.nextInt();
		int wetFood = 2*numberOfDogs*numberOfDays;
		int veggies = 2*numberOfDogs*numberOfDays;
		int dryFood = numberOfDogs*numberOfDays;
		System.out.println(wetFood+" ounces of wet food "+", "+veggies+
		" ounces of veggies "+"and "+dryFood+" ounces of dry food.");
		input.close();
	}
}
//Create a Java program named DogFoodCalculator that does the following:
//1. Takes user input for number of dogs
//2. Takes user input for number of days
//3. Performs calculation based on the data given below
//4. Displays detailed response to the user
//Variables to use in the program:
//int numberOfDogs
//int numberOfDays
//int wetFoodPerDay
//int veggies
//int dryFoodPerDay
//int totalWetFood
//int totalDryFood
//Test data:
//Wet food for average dog per day = 2 oz
//Dry food for average dog per day = 1 oz
//Veggies for average dog per day = 2 oz

