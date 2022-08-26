//-------------------------------------------------------------
//This program was designed to prompt user for a letter from a-z and then display the 
//letter's ASCII number and whether its a multiple of 2,3,5 and 7 or none of them
//Assignment 2
//Written by: Omar Ihab Mohammed Aboubakr Abdalla Shehata (Student ID:40164193)
//For COMP 248 Section P - Fall 2020
//Started Writing program on 06/10/2020
//Finished writing on 10/10/2020
//-------------------------------------------------------------
import java.util.Scanner;//We need to import class in which scanner is 
//in
public class Question1 {

	public static void main(String[] args) {
		Scanner myKeyboard = new Scanner(System.in);//declaring the
		//scanner
		System.out.println("Please enter a letter between a and z inclusive: ");//prompt for user to input letter
		char inputLetter = myKeyboard.next().charAt(0);//this instruction reads the first letter
		//of the input to ensure that the value assigned to this variable is a char
		int ascii = (int) inputLetter;//this instruction is to get the ASCII value of the 
		//letter that was inputed
		if (ascii%2 == 0)
		{
			System.out.println("The ASCII number of "+ inputLetter + " is " + ascii + " which is an even number");//output of the ASCII number of the letter inputed 
			//and if its even or odd
		}
		else 
		{
			System.out.println("The ASCII number of "+ inputLetter + " is " + ascii + " which is an odd number");//output of the ASCII number of the letter inputed 
			//and if its even or odd
		}
		
		int multiple = 2;//Declaration of the multiple variable
		boolean multipleOf2 = false;//declaration of the variable of "is it a multiple of 2"
		boolean multipleOf3 = false;//declaration of the variable of "is it a multiple of 3"
		boolean multipleOf5 = false;//declaration of the variable of "is it a multiple of 5"
		boolean multipleOf7 = false;//declaration of the variable of "is it a multiple of 7"
		switch (ascii%multiple)//switch statement to test if the ASCII value is a multiple of each of the multiples chosen for this question(2,3,5 and 7)
		{
		case 0 :
				System.out.println("ASCII value of "+ inputLetter + " is a multiple of 2");//output to user to note that ASCII value is a multiple of 2
				multipleOf2 = true;//assigns true to boolean variable to note that ASCII value is a multiple of 2 
		}	
		multiple = 3;//to assign 3 to multiple variable so it can check if its a multiple of 3 in the next case
		switch (ascii%multiple)//switch statement to test if the ASCII value is a multiple of each of the multiples chosen for this question(2,3,5 and 7)
		{
		case 0 :
				System.out.println("ASCII value of "+ inputLetter + " is a multiple of 3");//output to user to note that ASCII value is a multiple of 3
				multipleOf3 = true;//assigns true to boolean variable to note that ASCII value is a multiple of 3
		}	
		multiple = 5;//to assign 5 to multiple variable so it can check if its a multiple of 5 in the next case
		switch (ascii%multiple)//switch statement to test if the ASCII value is a multiple of each of the multiples chosen for this question(2,3,5 and 7)
		{
		case 0 :
				System.out.println("ASCII value of "+ inputLetter + " is a multiple of 5");//output to user to note that ASCII value is a multiple of 5
				multipleOf5 = true;//assigns true to boolean variable to note that ASCII value is a multiple of 5
		}
		multiple = 7;//to assign 7 to multiple variable so it can check if its a multiple of 7 in the next case
		switch (ascii%multiple)//switch statement to test if the ASCII value is a multiple of each of the multiples chosen for this question(2,3,5 and 7)
		{
		case 0 :
				System.out.println("ASCII value of "+ inputLetter + " is a multiple of 7");//output to user to note that ASCII value is a multiple of 7
				multipleOf7 = true;//assigns true to boolean variable to note that ASCII value is a multiple of 7
		}	
		if (multipleOf2 == false && multipleOf3 == false && multipleOf5 == false && multipleOf7 == false)//if statement to check if ASCII value is a multiple of any
			//of the multiples we have chosen
		{
			System.out.println("ASCII value of " + inputLetter + " is not a multiple of 2,3,5 and 7");//output to user to inform him that ASCII value isn't a multiple of 2,3,5, and 7
		}
		System.out.println("The program has ended, Thank you.");//prompt to user to inform that program hhas ended
		myKeyboard.close();//instruction to close Scanner object
		
			
	}

}
