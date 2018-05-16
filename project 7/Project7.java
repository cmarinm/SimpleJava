//package project7;
import java.util.*;

public class Project7 {

/*
 * Test program for Spring 15 110.
 *
 * Eight test cases for Roster
 */

		/* main method to control tests to be performed.
		 *
		 */
		public static void main (String [] args)
		{
			char ch;
			boolean end = false;
			do
			{
				ch = getCommand();
				switch (ch)
				{
					case '1' : 	test1();
								break;
					case '2' :	test2();
								break;
					case '3' :  test3();
								break;
					case '4' :	test4();
								break;
					case '5' :	test5();
								break;
					case '6' :	test6();
								break;
					case '7' :	test7();
								break;
					case '0' :	end = true;
								break;
				}
			}
			while (!end);
			System.out.println ("Program complete");
		}

		/* prompt the user to enter a test number and return it as a character
		 *
		 */

		static char getCommand ()
		{
			final Scanner input = new Scanner (System.in);
			char command;
			boolean valid;

			do {
				System.out.println ();
				System.out.print ("Enter test number (1..7) (0 to stop): ");
				String answer = input.next();
				command = answer.charAt(0);
				valid = command >= '0' && command <= '7';
				if (!valid)
					System.out.println ("Entry not valid, enter again");
			} while (!valid);
			return command;
		}

		/* test 1 - empty book
		 */

		static void test1()
		{

			System.out.println ("Test 1: Entry");

			Entry entry1 = new Entry ("Joe", "Smith", 100);

			System.out.println ("Expecting: Smith, Joe	100");
			System.out.println ("Result: " + entry1);
			System.out.println ();

			System.out.println ("Expecting: true");
			System.out.println ("Result: " + entry1.equals(entry1));
			System.out.println ();

			System.out.println ("Expecting: false");
			Entry entry2 = new Entry ("Bill", "Jones", 0);
			System.out.println ("Result: " + entry1.equals(entry2));
			System.out.println ();

			System.out.println ("Expecting: 100");
			System.out.println (entry1.getGrade());
		}

		/* test 2 - empty Roster
		*/

		static void test2()
		{
			System.out.println ("Test2: empty");
			System.out.println ();

			Roster book = new Roster ();
			System.out.println ("Expecting nothing");
			book.printAll();

			System.out.println ("Expecting 0.0");
			System.out.println (book.average());
			System.out.println ();
		}

		/* test 3 - insert and search
		*/

		static void test3()
		{
			System.out.println ("Test3: insert ");
			System.out.println ();

			Roster list = new Roster();
			Entry temp = new Entry ("John", "Smith", 99);
			list.insert(temp);
			System.out.println ("Expecting Smith, John	99");
			list.printAll();
			System.out.println ();

			list.insert (new Entry ("Tom", "Jones", 78));
			list.insert (new Entry ("Fred", "Flintstone", 55));
			list.insert(new Entry ("Jill", "St. John", 79));
			list.insert(new Entry ("Jim", "Smith", 88));
			System.out.println ("Expecting 5 entries");
			list.printAll();
			System.out.println ();

			System.out.println ("Expecting 79.8");
			System.out.println (list.average());
		}

		/* test 4 - insert with duplicates
		*/

		static void test4()
		{
			System.out.println ("Test4: Duplicate Entries ");
			System.out.println ();

			Roster book = new Roster();
			book.insert(new Entry ("John", "Bob", 77));
			book.insert(new Entry ("Jim","Bob", 89));
			book.insert(new Entry ("John", "Bob", 89));
			book.insert(new Entry ("Jim","Bob", 55));

			System.out.println ("Expecting 2 entries");
			book.printAll();
			System.out.println ();
		}

		/* test 5 - deleting
		*/

	static void test5()
		{
			System.out.println ("Test5: Deleting");
			System.out.println ();

			Roster list = new Roster ();
			list.insert(new Entry ("John", "Johnson", 77));
			list.insert(new Entry ("Tom","Thompson", 99));
			list.insert(new Entry ("Jeff", "Jefferson", 44));
			list.insert(new Entry ("Fred", "Fredrickson", 91));
			list.insert(new Entry ("Tina", "Tina", 95));

			System.out.println ("Expecting 5 entries");
			list.printAll();
			System.out.println ();

			System.out.println ("Expecting 4 entries");
			list.delete(new Entry ("John", "Johnson", 0));
			list.printAll();
			System.out.println ();

			System.out.println ("Expecting 3 entries");
			list.delete(new Entry ("Tina", "Tina", 0));
			list.printAll();
			System.out.println ();

			System.out.println ("Expecting 2 entries");
			list.delete(new Entry ("Fred", "Fredrickson", 0));
			list.printAll();
			System.out.println ();

			System.out.println ("Expecting 1 entry");
			list.delete(new Entry ("Tom", "Thompson", 0));
			list.printAll();
			System.out.println ();

			System.out.println ("Expecting 0 entries");
			list.delete(new Entry ("Jeff", "Jefferson", 0));
			list.printAll();

			System.out.println ();

		}


		/* test 6 - delete duplicates
		 */

		static void test6() {
			System.out.println ("Test6: delete duplicates");
			System.out.println ();

			// create new book and fill
			Roster list = new Roster ();

			list.insert(new Entry ("John", "Johnson", 77));
			list.insert(new Entry ("Tom","Thompson", 99));
			list.insert(new Entry ("Jeff", "Jefferson", 44));
			list.insert(new Entry ("Fred", "Fredrickson", 91));
			list.insert(new Entry ("Tina", "Tina", 95));

			System.out.println ("Expecting all");
			list.printAll();
			System.out.println ();

			System.out.println ("Expecting 4 entries");
			list.delete(new Entry ("Jeff", "Jefferson", 0));
			list.printAll();
			System.out.println ();

			System.out.println ("Expecting 4 entries");
			list.delete(new Entry ("Jeff", "Jefferson", 0));
			list.printAll();
			System.out.println ();

		}

		/* test 7- enpty and fill
		 */

		static void test7 () {
			Roster list = new Roster ();
			list.insert(new Entry ("John", "Johnson", 77));
			list.insert(new Entry ("Tom","Thompson", 99));
			list.insert(new Entry ("Jeff", "Jefferson", 44));

			System.out.println ("Expecting 3 entries");
			list.printAll();
			System.out.println ();

			list.delete(new Entry ("John", "Johnson", 0));
			list.delete(new Entry ("Tom", "Thompson", 0));
			list.delete(new Entry ("Jeff", "Jefferson", 0));

			System.out.println ("Expecting 0 entries");
			list.printAll();
			System.out.println ();

			list.insert(new Entry ("John", "Johnson", 87));
			list.insert(new Entry ("Tom","Thompson", 76));
			list.insert(new Entry ("Jeff", "Jefferson", 83));

			System.out.println ("Expecting 3 entries");
			list.printAll();
			System.out.println ();

		}
}