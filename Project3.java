/**
Cesar Marin
Project 3, TA: Ghazaleh Beigi
This program asks the user for input, a character (A-D) and an integer (1-10) and prints a design
based on the character chosen, and the length(height) of the integer.
*/

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Project3
{
	public static void main(String[]args)
	{
		System.out.println("Cesar Marin");
		System.out.println("Project 3");
		System.out.println();
		Scanner in = new Scanner (System.in);
		String character = JOptionPane.showInputDialog ("Please enter a character (A-D, X to stop): ");
		char ch = character.charAt(0);
		//------------------------------------------------------------------------------------------------------------
		while(ch!= 'X' && ch!='x')
		{
			System.out.println("Please enter and integer 1-10");
			int lines = in.nextInt();
			if(lines <=0 || lines >10){
				System.out.println("Error: integer outside of range");
				System.out.println();
				}
			else if(ch < 'A' || ch> 'D')
				{
					System.out.println("Error, character is out of range");
					character = JOptionPane.showInputDialog ("Please enter another character (A-D, X to stop): ");
				 	ch = character.charAt(0);
				}
				else
				{
					switch(ch)
					{
					case 'A':
							for (int row = 1; row <= lines; row++)
							 {
								for (int star = 1; star <= row; star++)
									System.out.print ("*");

								System.out.println();
							 }

							break;
					case 'B':
							for (int row = 1; row <= lines; row++)
							{
							  for (int star = lines; star >= row; star--)
								   System.out.print ("*");

							  System.out.println();
							}
							break;
					case 'C':
							for (int row = 1; row <= lines; row++)
							 {

								for (int spaces = lines - 1; spaces >= row; spaces--)
									System.out.print (" ");
								for (int star = 1; star <= row; star++)
									System.out.print("*");

								System.out.println();
      					 	}
							break;
					case 'D':
							for (int row = 1; row <= lines; row++)
							 {

								for (int spaces = 0; spaces <= row; spaces++)
									System.out.print (" ");
								for (int star = lines; star >= row; star--)
									System.out.print("*");

								System.out.println();
							 }

							break;

					}


					character = JOptionPane.showInputDialog ("Please enter another character (A-D, X to stop): ");
					ch = character.charAt(0);



				}
		}

	}
}