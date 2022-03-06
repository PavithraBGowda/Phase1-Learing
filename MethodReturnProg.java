package assisted_Practice;

public class MethodReturnProg {
	static int multipynumbers(int a,int b)//it will return integer value
	{
		return a+b;
	}
	static void dis1() //this will not written anything
	{
		System.out.println(" I am not written anything");
	}
	static String dis2()//it will return the string
	{
		return "hii java";
	}
	static char dis3()// it will return the character
	{
		return 'c';
	}

	public static void main(String[] args) {
		System.out.println("Diplaying methods with different return types");
		System.out.println("");
		System.out.println("Multiplication of numbers by passing two actual arguments:"+multipynumbers(6, 8));
		dis1();
		dis2();
		System.out.println("");
		dis3();
	}
}
