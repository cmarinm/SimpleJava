/**
Cesar Marin Project 7 Roster Class
This class uses an array list of entry objects to create a roster of students and their grades, it can insert, delete, print and calculate average
of the list of entry objects.
TA:
*/
import java.util.*;
public class Roster
{
	private ArrayList<Entry> entries;
	private final int NOT_FOUND = -1;
/**
Constructor  intantiates the arraylist to empty
*/
	public Roster()
	{
		entries = new ArrayList<Entry>();
	}
/**
Search it searches for an entry object that contains the same names of the current entry object, returns position of the same object, or -1 if there is no match
@param lookup the Entry object wished to be looked for in the arraylist
@return pos position at which the object is found or -1 for NOT_FOUND
*/
	private int search(Entry lookup)
	{
		int pos = 0;
		boolean found = false;
		while (pos < entries.size() && !found )
		{
			if (entries.get(pos).equals(lookup) )
				found = true;
			pos++;
		}
		if(found)
			return pos;
		else
		return NOT_FOUND;

	}
/**
insert calls search method to see if object wished to be added is already in arraylist, if not in there, it adds it to the list
@param entryIn Entry object wished to be added to the list
*/
	public void insert(Entry entryIn)
	{
		if( (search(entryIn) == -1))
			entries.add(entryIn);
	}
/**
deleted calls search method to see if object wished to be deleted is on the list, if it is there, it deletes it, if not, it does nothing
@param entryIn Entry object wished to be deleted form the list
*/
	public void delete (Entry entryIn)
	{
		int pos = search(entryIn);
		if (pos == -1);
		else
			entries.remove(pos-1);

	}
/**
printAll prints every Entry object in the list, each on its own line
*/
	public void printAll()
	{

			for(int pos = 0; pos < entries.size(); pos++)
				System.out.println(entries.get(pos).toString());

	}
/**
Average calculates the average grade for all the Entry objects in the list
@return average double number(the average grade)
*/
	public double average()
	{
		double total = 0.0;
		double average = 0.0;
		double count = 0.0;
		for(int pos =0; pos<entries.size();pos++)
		{
			total = total + entries.get(pos).getGrade();
			count++;
		}
		average = total/count;
		return average;

	}
}