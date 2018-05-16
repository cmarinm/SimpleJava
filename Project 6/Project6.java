//package project6;

// Test program for the Money class

public class Project6 {

	public static void main(String[] args) {

		// test setMoney and toString
		testSet ();
		testAdd ();
		testSubtract();
		testEquals();
		testLessThan();
	}

	private static void testSet () {

		System.out.println ("Testing set and toString");
		Money myMoney = new Money ();
		myMoney.setMoney(5, 75);
		System.out.println (myMoney.toString());  // $5.75

		myMoney.setMoney(75, 5);
		System.out.println (myMoney.toString()); // $75.05

		myMoney.setMoney(0, 5);
		System.out.println (myMoney.toString()); // $0.05

		myMoney.setMoney (-1, 5);
		System.out.println (myMoney.toString()); // $0.00

		myMoney.setMoney (1, -5);
		System.out.println (myMoney.toString()); // $0.00
	}

	private static void testAdd () {

		System.out.println ("Testing add");
		Money total = new Money();
		Money temp = new Money();
		total.setMoney (0, 0);

		for (int value = 1; value < 100; value += 15) {
			temp.setMoney (1, value);
			System.out.print(total + " + " + temp + " = ");
			total.add(temp);
			System.out.println (total.toString());
		}
	}

	private static void testSubtract () {

		System.out.println ("Testing subtract");
		Money total = new Money();
		Money temp = new Money();
		total.setMoney (10, 10);

		for (int value = 1; value < 100; value += 15) {
			temp.setMoney (1, value);
			System.out.print(total + " - " + temp + " = ");
			total.subtract(temp);
			System.out.println (total.toString());
		}
	}

	private static void testEquals () {

		System.out.println ("Testing equals");
		Money wallet1 = new Money();
		Money wallet2 = new Money();

		wallet1.setMoney(7, 7);
		wallet2.setMoney(7, 7);
		System.out.println (wallet1 + " = " + wallet2 + " is " +
				wallet1.equals(wallet2));
		System.out.println (wallet1 + " = " + wallet2 + " is " +
				wallet2.equals(wallet1));
		wallet2.setMoney(7, 17);
		System.out.println (wallet1 + " = " + wallet2 + " is " +
				wallet1.equals(wallet2));
		wallet2.setMoney(17, 1);
		System.out.println (wallet1 + " = " + wallet2 + " is " +
				wallet1.equals(wallet2));

	}

	private static void testLessThan () {

		System.out.println ("Testing lessThan");
		Money wallet1 = new Money();
		Money wallet2 = new Money();

		wallet1.setMoney(7, 7);
		wallet2.setMoney(7, 7);
		System.out.println (wallet1 + " < " + wallet2 + " is " +
				wallet1.lessThan(wallet2));
		wallet2.setMoney(17, 7);
		System.out.println (wallet1 + " < " + wallet2 + " is " +
				wallet1.lessThan(wallet2));
		wallet2.setMoney(5, 7);
		System.out.println (wallet1 + " < " + wallet2 + " is " +
				wallet1.lessThan(wallet2));
		wallet2.setMoney(7, 20);
		System.out.println (wallet1 + " < " + wallet2 + " is " +
				wallet1.lessThan(wallet2));
		wallet2.setMoney(7, 4);
		System.out.println (wallet1 + " < " + wallet2 + " is " +
				wallet1.lessThan(wallet2));
	}
}

/*
 * Expected output
 *
Testing set and toString
$5.75
$75.05
$0.05
$0.00
$0.00
Testing add
$0.00 + $1.01 = $1.01
$1.01 + $1.16 = $2.17
$2.17 + $1.31 = $3.48
$3.48 + $1.46 = $4.94
$4.94 + $1.61 = $6.55
$6.55 + $1.76 = $8.31
$8.31 + $1.91 = $10.22
Testing subtract
$10.10 - $1.01 = $9.09
$9.09 - $1.16 = $7.93
$7.93 - $1.31 = $6.62
$6.62 - $1.46 = $5.16
$5.16 - $1.61 = $3.55
$3.55 - $1.76 = $1.79
$1.79 - $1.91 = $0.00
Testing equals
$7.07 = $7.07 is true
$7.07 = $7.07 is true
$7.07 = $7.17 is false
$7.07 = $17.01 is false
Testing lessThan
$7.07 < $7.07 is false
$7.07 < $17.07 is true
$7.07 < $5.07 is false
$7.07 < $7.20 is true
$7.07 < $7.04 is false

*/