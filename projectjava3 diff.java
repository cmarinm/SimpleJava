import java.util.Scanner;
public class Project3
{
	public static void main(String[]args)
	{
		System.out.println("Cesar Marin");
		System.out.println("Project 3");
		System.out.println();
		System.out.println("Please enter a character (A-D,X to stop)");
		Scanner in = new Scanner (System.in);
		int lines = 1;
		String character = in.next();
		char ch = character.charAt(0);
		while(ch!= 'X' && ch!='x')
			do
			{
				System.out.println("Please enter an integer 0-10");
				 lines = in.nextInt();
				 if(lines <=0 || lines>10)
				 	System.out.println("integer outside of range");
			}
			while(lines <=0 && lines >10);
			System.out.println("hey");