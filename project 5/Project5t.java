import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;

public class Project5t
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
return filename String file name

public static String getFileName(String str)
{
	String filename = JOptionPane.showInputDialog(str);
	return filename;
}

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