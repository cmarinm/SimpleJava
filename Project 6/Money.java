/**
Cesar Marin Project 6
Lab TA: Ghazaleh Beigi
This Class sets, adds subtracts, check if they are equal/less than, and convert to string objects of the class Money, which consists of two variables, dollars and cents.
*/
public class Money
{
	private int dollars = 0;
	private int cents = 0;
	/**
	Initializes/Intantiates the objects of this class
	@param dollarsIn, centsIn The initial amount of dollars and cents
	*/
	public void setMoney (int dollarsIn, int centsIn)
	{
		if (dollarsIn < 0 || centsIn < 0)
		{
			dollars = 0;
			cents = 0;
		}
		else
		{
			dollars = dollarsIn;
			cents = centsIn;
		}
	}
	/**
	Adds to the current object, another object of class Money
	@param moneyIn, the object to be added
	*/
	public void add ( Money moneyIn)
	{
		dollars = moneyIn.dollars + dollars;
		cents = moneyIn.cents + cents;
		if (cents >= 100)
		{
			dollars ++;
			cents = cents - 100;
		}

	}
	/**
	Subtracts to the current object another object of the class Money
	@param moneyIn, the object to be subtracted
	*/
	public void subtract(Money moneyIn)
	{
		dollars = dollars - moneyIn.dollars;
		cents = cents - moneyIn.cents;
		if (cents < 0)
		{
			dollars = dollars - 1;
			cents = cents + 100;
		}
		if (dollars < 0)
		{
			dollars = 0;
			cents = 0;
		}
	}
	/**
	Checks to see if two objects of class Money are equal in value
	@param moneyIn, object to be compared with current
	@return boolean, true if objects are equal, false if not
	*/
	public boolean equals (Money moneyIn)
	{
		if (dollars == moneyIn.dollars &&  cents == moneyIn.cents)
			return true;
		else
			return false;
	}
	/**
	Check to see if current object is less than another object compared to, both class Money
	@param moneyIn, object to be compared to
	@return boolean, true if current object is less than that compared to, false if not
	*/
	public boolean lessThan( Money moneyIn)
	{
		if( dollars < moneyIn.dollars)
			return true;
		else
		{
			if( dollars == moneyIn.dollars)
			{
				if (cents < moneyIn.cents)
					return true;
				else
					return false;
			}
			else
				return false;
		}

	}
	/**
	Converts object into a String
	@return String, value of object in format $dd.cc
	*/
	public String toString ()
	{
		if(cents <10)
			return "$" + dollars + ".0" + cents;
		else
			return "$" + dollars + "." + cents;
	}
}