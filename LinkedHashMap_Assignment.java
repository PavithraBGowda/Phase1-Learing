package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_Assignment {

	public static void main(String[] args) {
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		
		linkedHashMap.put(1, new String("Apple"));
        linkedHashMap.put(2, new String("Chikku"));
        linkedHashMap.put(3, new String("Grapes"));
        linkedHashMap.put(4, new String("Strawberry"));
        linkedHashMap.put(5, new String("Muskmelon"));
        linkedHashMap.put(6, new String("Avocado"));
        linkedHashMap.put(7, new String("Guava"));
        linkedHashMap.put(8, new String("Banana"));
        linkedHashMap.put(9, new String("Kiwi"));
        linkedHashMap.put(10, new String("Mango"));
        
        System.out.println("Contents of LinkedHashMap : " + linkedHashMap);
        System.out.println("\nValues of map after iterating over it : ");
        
        for (Integer key : linkedHashMap.keySet()) {
            System.out.println(key + ":\t" + linkedHashMap.get(key));
        }
        System.out.println("\nRemove entry for key 4: " + linkedHashMap.remove(4));
        System.out.println("Content of LinkedHashMap after removing key 7: " + linkedHashMap);
        
        System.out.println("\nLinkedHashMap contains fruit? : " + linkedHashMap.containsValue("Banana")+"and"+linkedHashMap.containsValue("Apple"));
        System.out.println("\nLinkedHashMap contains 4 as key?: " + linkedHashMap.containsKey(4));
        
        linkedHashMap.hashCode();
        linkedHashMap.clear();
        System.out.println("\nContent of LinkedHashMap after clearing: " + linkedHashMap);
	}
}
