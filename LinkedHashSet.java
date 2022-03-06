package collection;

import java.util.HashSet;
import java.util.TreeSet;
public class LinkedHashSet {

	public static void main(String[] args) {
		HashSet<String>h=new HashSet<String>();
		h.add("pavithra");
		h.add("rishvi");
		h.add("pallavi");
		h.add("ashhhh");
		
		h.remove("pallavi");
		TreeSet<String>t=new TreeSet<String>();
		t.add(".net");
		t.add("java");
		t.add("matlab");
		t.add("c++");
		t.add("python");
		t.add("c");
		
		System.out.println("Before operations:" +t);
          t.remove("matlab");
          t.remove("c");
        System.out.println("After removal of two:" +t);
        t.add("sql");
        t.add("vhdl");
        t.add("php");
        System.out.println("After adding three:" +t);
        System.out.println("Checking java is part or not?" +t.contains("java"));
        t.removeAll(t);
        System.out.println("After last operation:" +t);   
	}
}
