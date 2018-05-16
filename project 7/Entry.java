/**
Cesar Marin Project 7, Entry Class
This class takes input for Roster class and creates, compares, get grades and turn to string Entry objects.
*/
public class Entry
{
	private String firstName = "";
	private String lastName = "";
	private int grade = 0;
/**
Constructor creates an Entry object
@param first last gradeIn - First name, last name, and grade for the new Entry object
*/
	public Entry (String first, String last, int gradeIn)
	{
		firstName = first;
		lastName = last;
		grade = gradeIn;
	}
/**
equals compared the names of two Entry objects, if they are the same, return true, false otherwise
@param entryIn Entry object wished to be compared with current object
@return boolean true if they are the same, false otherwise
*/
	public boolean equals (Entry entryIn)
	{
		if(firstName.equals(entryIn.firstName) && lastName.equals(entryIn.lastName))
			return true;
		else
			return false;
	}
/**
getGrade returns the grade of an Entry object
@return grade
*/
	public int getGrade ()
	{
		return grade;
	}
/**
toString returns the object as lastname, firstname	grade
@return lastname firstname	grade
*/
	public String toString ()
	{
		return lastName + "," + firstName + "\t" + grade;
	}

}