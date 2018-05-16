/**
Cesar Marin Project 4 TA:Ghazaleh Beigi
The program aks the user for a potential palindrome and then tests
if such string is a plaindrome or not, and what kind it is (word, number or phrase).
*/
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Project4
{
	public static void main(String[]args)
	{
				String line = getInputLine();
				while (!isEmptyLine (line)) {
					if (isPalindrome (line))
						System.out.println ("\"" + line +
							"\" is a palindrome and a " + getPalType (line));
					else
						System.out.println ("\"" + line +
							"\" is not a palindrome");
						line = getInputLine();

				}
				System.out.println ("End of program");

	}



/**
Gets input from the user (potential palindrome)
@param
@return string
*/
	public static String getInputLine()
	{
		String palindrome = JOptionPane.showInputDialog ("Please enter a potential palindrome");
		return palindrome;
	}
/**
Tests if the input line is empty
@param string str, the input from user
@return boolean true if it is empty, false if its not
*/
	public static boolean isEmptyLine(String str)
	{
		boolean empty= false;
		if( str.length()== 0)
	 		 empty = true;
	 	return empty;
	}
/**
Test to see which kind of palindrome the input is
@param string str, the input from the user
@return string either "word", "number", or "phrase"
*/
	public static String getPalType(String str)
	{
		String palType = "";
		int counter = 0;
		while(str.length()>counter)
		{
			char ch = str.charAt(counter);
			if(ch>= 48 && ch<=57)
				palType= "number";
			else
			{
				if((ch <= 'Z' && ch >= 'A') ||(ch>= 'a' && ch<= 'z'))
					palType = "word";
					else
					{
						palType = "phrase";
						counter = str.length() +1;
					}
			}
			counter++;
		}
		return palType;
	}
/**
Test to see if the input is a palindrome or not
@param string str, input from user
@return boolean, true if it is a palindrome, false if not
*/
	public static boolean isPalindrome(String str)
	{
		int left = 0;
		int right = str.length()-1;
		boolean okay = true;
		while( okay && left<right)
		{
			char ch1 = str.charAt(left);
			if( !(Character.isDigit(ch1) || Character.isLetter(ch1)))
				left++;
			else
			{
				char ch2 = str.charAt(right);
				if(!(Character.isDigit(ch2) || Character.isLetter(ch2)))
					right--;
				else
				{
					ch1 = Character.toUpperCase(ch1);
					ch2 = Character.toUpperCase(ch2);
					if( ch1 == ch2)
					{
						left ++;
						right--;
					}
					else
						okay = false;
				}
			}


		}
		return okay;

	}
}