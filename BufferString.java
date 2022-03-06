package program.test;

public class BufferString {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("started Java");
		System.out.println(s.append("Phase1"));
		System.out.println(s.delete(2,5));
		
		System.out.println(s.replace(5, 9, "Python "));
		System.out.println(s.insert (5,"Language "));
		System.out.println(s.reverse());
		System.out.println(s.charAt(9));
	}

}
