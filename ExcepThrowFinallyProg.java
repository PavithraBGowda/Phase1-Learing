package assisted_Practice;

public class ExcepThrowFinallyProg {
	void display(int money) throws LessMoneyException
	{
		if(money <4000)
		{
			System.out.println("ok i your money was less than 4000");
		}
	}

	public static void main(String[] args) {
		ExcepThrowFinallyProg ob1=new ExcepThrowFinallyProg();
		try
		{
			ob1.display(5999);
			System.out.println("displaying money");
		}
		catch(LessMoneyException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("program execution completed");
		}
	}

}
class LessMoneyException extends Exception
{
	LessMoneyException(String s)
	{
		super(s);
	}
}
