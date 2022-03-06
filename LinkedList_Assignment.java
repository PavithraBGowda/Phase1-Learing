package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Assignment {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
        
        ll.add("May");
        ll.add("June");
        ll.add("July");
        ll.add("August");
        ll.add("April");
        ll.add("November");
        ll.addLast("December");       
        ll.addFirst("January");
        System.out.println("After adding:"+ll);
        ll.add(1, "March");
        ll.add(2, "February");
        ll.add(8, "September");
        ll.add(9, "October");
        System.out.println("List of months:"+ll);
        for(int i=0;i<ll.size();i++)
        	if(i%2==0)
        		System.out.println(ll.get(i));
       for(int i=0;i<ll.size();i++)
    	   if(i%2!=0)
    		   System.out.println(ll.get(i));
        	 	                 
        Iterator itr=ll.iterator();
        while(itr.hasNext()) {
        System.out.println("List is" + itr.next());
        }
       
        System.out.println(ll);
        System.out.println("First and last month is" + ll.getFirst() + "and" + ll.getLast());
        System.out.println("My domonth is aug" + ll.remove("August"));
        System.out.println("Does LinkedList contains winter month?" + ll.contains("November"));
         ll.peekFirst();
         ll.peekLast();
         ll.pollFirst();
         ll.pollLast();
	        System.out.println(ll);
	}
}
