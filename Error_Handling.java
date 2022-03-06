package exceptionHandling;

import java.util.Scanner;

public class Error_Handling {
    
     Scanner sc=new Scanner(System.in);
 	int sal=sc.nextInt();
 	static void salCheck(int sal) throws InvalidSal,InvalidateSal,InvalidatedSal
 	{
 		if(sal<2500)
 		{
 			throw new InvalidSal("you need to work hard");
 		}
 		
 		if(sal<2500 || sal>5800)
 		{
 			throw new InvalidateSal("Salary is somehow Good");
 		}
 		if(sal<6100 || sal>8000)
 		{
 			throw new InvalidatedSal("Salary is very Good");
 		}
 	}
 	public static void main(String[] args)
 	{
 		try
 		{
 			salCheck(4330);
 		}
 		catch(Exception e)
 		{
 			System.out.println("exception ocurred : "+e.getMessage());
 		}
 		
 	}
 }
 class InvalidSal extends Exception
 {
 	public InvalidSal(String s) 
 	{
 		super(s);
 	}
 }
 class InvalidateSal extends Exception
 {
 	public InvalidateSal(String s) 
 	{
 		super(s);
 	}
 }
 class InvalidatedSal extends Exception
 {
 	public InvalidatedSal(String s) 
 	{
 		super(s);
 	}
 }
