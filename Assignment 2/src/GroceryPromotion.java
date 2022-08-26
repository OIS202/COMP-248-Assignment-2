//-------------------------------------------------------------
//This program was designed to calculate the total price and amount of points earned
//from the items the user has chosen
//Assignment 2
//Written by: Omar Ihab Mohammed Aboubakr Abdalla Shehata (Student ID:40164193)
//For COMP 248 Section P - Fall 2020
//Started Writing program on 10/10/2020
//Finished writing on 11/10/2020
//-------------------------------------------------------------
import java.util.Scanner;//We need to import class in which scanner is 
//in
public class GroceryPromotion {

	public static void main(String[] args) {
		Scanner myKeyboard = new Scanner(System.in);//declaring the
		//scanner
		final double FRUIT_PRICE = 26.99;//declare fruit price constant
		final double CHEESE_PRICE = 22.99;//declare cheese price constant
		final double DAIRY_PRICE = 13.99;//declare dairy price constant
		final double MEAT_PRICE = 56.99;//declare meat price constant
		final double SEAFOOD_PRICE = 38.99;//declare seafood price constant
		boolean membership = false;//declaration of boolean variable membership
		double discountedPrice = 0.0;//declaration of discounted price variable
		int points = 0;//declaration of variable points
		System.out.println("Welcome to our grocery, today we are selling:\n1) Fruit,price: 26.99$\n2) Cheese,price: 22.99$\n3) Dairy,price: 13.99$"
				+ "\n4) Meat,price: 56.99$\n5) Seafood,price: 38.99$ ");//Prompt to inform user about items and prices
		System.out.println("Please enter the amount you would like of fruit:");//Prompt to ask user the amount he wants of fruit
		int fruitQuantity = myKeyboard.nextInt();//instruction to read the amount user wants of fruit
		System.out.println("Please enter the amount you would like of Cheese:");//Prompt to ask user the amount he wants of Cheese
		int cheeseQuantity = myKeyboard.nextInt();//instruction to read the amount user wants of Cheese
		System.out.println("Please enter the amount you would like of Dairy:");//Prompt to ask user the amount he wants of Dairy
		int dairyQuantity = myKeyboard.nextInt();//instruction to read the amount user wants of Dairy
		System.out.println("Please enter the amount you would like of Meat:");//Prompt to ask user the amount he wants of meat
		int meatQuantity = myKeyboard.nextInt();//instruction to read the amount user wants of Meat
		System.out.println("Please enter the amount you would like of Seafood:");//Prompt to ask user the amount he wants of seafood
		int seafoodQuantity = myKeyboard.nextInt();//instruction to read the amount user wants of seafood
		System.out.println("Do you have a membership: (Enter Y or N) ");
		char membershipStatus = myKeyboard.next().charAt(0);//this instruction reads the first letter
		//of the input to ensure that the value assigned to this variable is a char
		if (membershipStatus == 'Y')//instruction to change membership status according to input
		{
			membership = true;
		}
		double totalDiscountPrice = (FRUIT_PRICE * fruitQuantity) + (CHEESE_PRICE * cheeseQuantity) + (DAIRY_PRICE * dairyQuantity) + 
				(MEAT_PRICE * meatQuantity);//instruction to calculate total discount price
		double totalPrice = (FRUIT_PRICE * fruitQuantity) + (CHEESE_PRICE * cheeseQuantity) + (DAIRY_PRICE * dairyQuantity) + 
				(MEAT_PRICE * meatQuantity) + (SEAFOOD_PRICE * seafoodQuantity);//instruction to calculate total price
		if (totalDiscountPrice < 250.0)//if statement to calculate discounted price according to the total discount price
		{
			discountedPrice = 0.9*totalDiscountPrice;
		}
		else if (totalDiscountPrice >= 250.0 && totalDiscountPrice <= 500.0)
		{
			discountedPrice = 0.85*totalDiscountPrice;
		}
		else
		{
			discountedPrice = 0.8*totalDiscountPrice;
		}
		if (membership == true)//if statement to calculate points according to the membership status and total price 
		{
			if (totalPrice <= 500)
			{
				points = (int) Math.round(totalPrice * 2);
			}
			else
			{
				points = (int) Math.round(totalPrice * 3);
			}
		}
		double finalPrice = discountedPrice + (SEAFOOD_PRICE * seafoodQuantity);//instruction to declare and initialize finalPrice variable
		System.out.println("The total price is " + finalPrice + ". You will recieve " + points + ".");//prompt to inform user about their discounted price
		//and the amount of points they will receive 
		System.out.println("This is the end of the program, Thank you.");//prompt to inform user that program has ended
		myKeyboard.close();//instruction to close the scanner
		
		

	}

}
