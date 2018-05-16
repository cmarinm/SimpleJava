public class Rev
{
	public static void main (String[] args)
	{
		Money revi = new Money();
		revi.setMoney(12,30);
		Money revi2 = new Money();
		revi2.setMoney(12,30);
		revi2.add(revi);

	}
}