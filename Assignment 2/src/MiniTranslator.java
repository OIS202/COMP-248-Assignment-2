//-------------------------------------------------------------
//This program was designed to get user input of their city,country, name and year in 
//which they arrived and then output a sentence in which these variables are noted 
//and where it notes amount of years this person has stayed in this place relayive to 2020
//Assignment 2
//Written by: Omar Ihab Mohammed Aboubakr Abdalla Shehata (Student ID:40164193)
//For COMP 248 Section P - Fall 2020
//Started Writing program on 13/10/2020
//Finished writing on 1/10/2020
//-------------------------------------------------------------
import java.util.Scanner;//We need to import class in which scanner is 
//in
public class MiniTranslator {

	public static void main(String[] args) {
		Scanner myKeyboard = new Scanner(System.in);//declaring the
		//scanner
		System.out.println("Welcome to our Mini Translator Program:");//welcome prompt
		System.out.println("Please enter the input sentence in the format:"
				+ " NAME came to CITY, COUNTRY in YEAR."
				+ "(including the spaces and commmas and periods)"
				+ " please enter q to terminate program:");//prompt to inform user 
		//of what to input
		String inputSentence = myKeyboard.nextLine();//instruction to read full line of text inputed 
		char ch = '.';//initialization and declaration of char ch
		boolean found = false;//declartion and initailization of variable found to use to check if word found
		int position = 0;//initialization and declarartion of position
		while ((!found && !((inputSentence.charAt(position) == ' ')) && (position < inputSentence.length())))//while loop to find first space to recognize username
			{
				ch = inputSentence.charAt(position);
				if (ch == ' ') {found = true;}
				else {position++;}
					
			}
		String userName = inputSentence.substring(0, position);//declaration of variable userName
		position++;//Increment of position to start at beginning of next word
		found = false;//Assignment of false to found to begin another loop
		while ((!found && !((inputSentence.charAt(position) == ' ')) && (position < inputSentence.length())))//while loop to find second space to recognize the word came
		{
			ch = inputSentence.charAt(position);
			if (ch == ' ') {found = true;}//if to check whether char extracted is a whitespace
			else {position++;}
				
		}
		position++;//Increment of position to start at beginning of next word
		found = false;//Assignment of false to found to begin another loop
		while ((!found && !((inputSentence.charAt(position) == ' ')) && (position < inputSentence.length())))//while loop to find third space to recognize the word to
		{
			ch = inputSentence.charAt(position);
			if (ch == ' ') {found = true;}//if to check whether char extracted is a whitespace
			else {position++;}
				
		}
		position++;//Increment of position to start at beginning of next word
		int index1 = position;
		found = false;//Assignment of false to found to begin another loop
		while ((!found && !((inputSentence.charAt(position) == ' ')) && (position < inputSentence.length())))//while loop to find fourth space to recognize city
		{
			ch = inputSentence.charAt(position);
			if (ch == ' ') {found = true;}//if to check whether char extracted is a whitespace
			else {position++;}
				
		}
		String userCity = inputSentence.substring(index1, position-1);//declaration of variable username
		position++;//Increment of position to start at beginning of next word
		found = false;//Assignment of false to found to begin another loop
		int index2 = position;
		
		while ((!found && !((inputSentence.charAt(position) == ' ')) && (position < inputSentence.length())))//while loop to find fifth space to recognize country
		{
			ch = inputSentence.charAt(position);
			if (ch == ' ') {found = true;}//if to check whether char extracted is a whitespace
			else {position++;}
				
		}
		String userCountry = inputSentence.substring(index2, position);//declaration of variable username
		position++;//Increment of position to start at beginning of next word
		found = false;//Assignment of false to found to begin another loop
		while ((!found && !((inputSentence.charAt(position) == ' ')) && (position < inputSentence.length())))//while loop to find sixth space to recognize the word in
		{
			ch = inputSentence.charAt(position);
			if (ch == ' ') {found = true;}//if to check whether char extracted is a whitespace
			else {position++;}
				
		}
		position++;//Increment of position to start at beginning of next word
		found = false;//Assignment of false to found to begin another loop
		int index3 = position;
		
		while ((!found && !((inputSentence.charAt(position) == '.')) && (position < inputSentence.length())))//while loop to find period to recognize year
		{
			ch = inputSentence.charAt(position);
			if (ch == '.') {found = true;}//if to check whether char extracted is a period
			else {position++;}
				
		}
		String yearArrived = inputSentence.substring(index3, position);//declaration of variable username
	
		//Name came to City, Country in Year.
		
		int integerYearArrived	 = Integer.parseInt(yearArrived);//to convert string year arrived to an integer

		int numberOfYearsResided = 2020 - integerYearArrived;//to calculate amount of years user has stayed in this given place
		System.out.println(userName + " stay in " + userCity + " for " + numberOfYearsResided + ((numberOfYearsResided==1) ? "year." : " years.") + userCity + " is in "
				+ userCountry + "." );//to prompt output statement
		System.out.println("Thank you for using our Mini Translator Program.");
		myKeyboard.close();//to close scanner
				

	
	
	
	
	
	
	
	
	}

}
