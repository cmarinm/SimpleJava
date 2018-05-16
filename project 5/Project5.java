import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
/**
Cesar Marin Project 5. This program gets integer input from a file, prints it out, sorts it from smallest to largest, and prints out the sorted list
Lab TA:Ghazaleh Beigi
*/
public class Project5
{
	static final int Limit = 25;
	public static void main(String[]args) throws FileNotFoundException
	{
		int [] numbers = new int [Limit];
		int count = getInput(numbers);
		System.out.println (count + " values were read");
		print (numbers, count); // prints original list
		sort (numbers, count);
		print (numbers, count); // prints sorted list
		System.out.println ("Program complete");
	}
/**
Displays dialog box for user to input input and output file names
@param str wished to be displayed into dialog box
@return filename String file name
*/
public static String getFileName(String str)
{
	String filename = JOptionPane.showInputDialog(str);
	return filename;
}
/**
Gets input file name, opens file, reads and stores integer into array, counts number of integers
@param  nums the array of integers wished to be stored into
@return count the number of integers read
*/
public static int getInput (int[] nums) throws FileNotFoundException
{
	String inputName = getFileName("Enter input file name");
	File inputFile = new File (inputName);
	Scanner in = new Scanner(inputFile);
	int count = 0;
	while( (in.hasNextInt())&& (count <= (nums.length-1)))
	{

		nums[count] = in.nextInt();
		count++;
	}
	in.close();
	return count;
}
/**
 Gets output file name and print integer from array into output file
 @param prntNums maxvalue the integer array, and the number of integers in the array
 */
public static void print (int[] prntNums,int maxvalue)throws FileNotFoundException
{
	String outputName = getFileName("Enter output file name");
	PrintWriter out = new PrintWriter(outputName);
	for( int element=0; element <= maxvalue; element++)
	{
		out.println(prntNums[element]);
	}
	out.close();
}
/**
Sorts the array into ascending order
@param sortNums count the integer array, and the number of integer in the array
*/
public static void sort (int[] sortNums, int count)
{
      int min;

      for (int index = 0; index < count; index++) {
         min = index;
         for (int scan = index+1; scan < count; scan++) {
            if (sortNums[scan] < sortNums[min]) {
               min = scan;
	     }
         }
         int temp = sortNums[index];
         sortNums[index] = sortNums[min];
         sortNums[min] = temp;
      }


}
}