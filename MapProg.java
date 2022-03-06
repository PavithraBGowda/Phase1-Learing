package assisted_Practice;

import java.util.*;

public class MapProg {

	public static void main(String[] args) {
		// map
		
				//Hashmap
				HashMap<Integer,String> hm=new HashMap<Integer,String>();      
			      hm.put(1,"Apple");    
			      hm.put(2,"Orange");    
			      hm.put(3,"Chikku");   
			       
			      System.out.println("\nThe elements of Hashmap are ");  
			      for(Map.Entry m:hm.entrySet()){    
			       System.out.println(m.getKey()+" "+m.getValue());    
			      }
			      
			     //HashTable
			       
			      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
			      
			      ht.put(4,"Kiwi");  
			      ht.put(5,"Papaya");  
			      ht.put(6,"Grapes");  
			      ht.put(7,"ButterFruit");  

			      System.out.println("\nThe elements of HashTable are ");  
			      for(Map.Entry n:ht.entrySet()){    
			       System.out.println(n.getKey()+" "+n.getValue());    
			      }
			      
			      
			      //TreeMap
			      
			      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
			      map.put(8,"Banana");    
			      map.put(9,"Pomegranate");    
			      map.put(10,"Mango");       
			      
			      System.out.println("\nThe elements of TreeMap are ");  
			      for(Map.Entry l:map.entrySet()){    
			       System.out.println(l.getKey()+" "+l.getValue());    
			      }    	
	}
}
