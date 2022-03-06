package collection;

import java.util.HashSet;
import java.util.TreeSet;

public class HasSetExample {

	public static void main(String[] args) {
		HashSet<String>h=new HashSet<String>();
		h.add("pavithra");
		h.add("rishvi");
		h.add("pallavi");
		h.add("ashhhh");
		
		h.remove("pallavi");
		System.out.println(h);
		TreeSet<String>t=new TreeSet<String>();
		t.add("manu");
		t.add("shru");
		t.add("jaya");
		t.add("gowda");
		System.out.println(t);
	}

}
