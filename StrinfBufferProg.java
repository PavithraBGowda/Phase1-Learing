package assisted_Practice;

public class StrinfBufferProg {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Painter "); 
		s1.append("race");        
		System.out.println(s1);  
		s1.insert(1,"pen");     
		System.out.println(s1);  
		s1.replace(1,4,"drop");  
		System.out.println(s1);
		s1.delete(1,3);  
		System.out.println(s1);
		s1.reverse();  
		System.out.println(s1);
		System.out.println(s1.charAt(3));
		StringBuilder s2 = new StringBuilder("Core");
		System.out.println(">>>>>>>"+ s2);
		s2.append("ink");
		System.out.println(s2);
		System.out.println(s2.length());
		System.out.println(s2.charAt(6));
		System.out.println(s2.reverse());
	}
}
