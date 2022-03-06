package assisted_Practice;

import java.util.Scanner;
import org.omg.PortableInterceptor.Interceptor;

public class TypeCastingProj {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s=input.next();
		
		System.out.println("you entered string is:"+s);
		char[ ] ch=s.toCharArray();
		System.out.println(ch);
		//enter number type string like ex:"6474","8789"
		System.out.println("enter number type string like:4757,35735 ");
		String s1=input.next();
		int i=Integer.parseInt(s1);
		System.out.println(i);	
	}
}
//int n1=73;
//double n2=67.43225543;
//boolean n3=true;
//char n4='s';
//long n5=45456436436L;
//float n6=6434.54478F;
//byte n11=124;
//int n7=(int)n2;
//System.out.println("value is :"+n7);
//char n8=(char)n1;
//System.out.println("value is :"+n8);
//long n9=(long)n6;
//System.out.println("value is :"+n9);
//float n10=(float)n2;
//System.out.println("value is :"+n10);
//int n12=(int)n11;
//double n13=(double)n11;