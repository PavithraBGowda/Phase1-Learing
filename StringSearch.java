package assisted_Practice;

public class StringSearch {

	public static void main(String[] args) {
		String[] ArrayOfStrings = { "Pavithra", "Pallavi", "Rishvik M Gowda" };  
        boolean content = false; //initializing x to false  
        int in = 0; //declaration of index variable  
        String s = "Rishvik M Gowda";  // String to be searched  
        // Iteration of the String Array  
        for (int i = 0; i < ArrayOfStrings.length; i++) {  
            if(s.equals(ArrayOfStrings[i])) {  
                in = i; content = true; break;  
            }  
        }  
        if(content)  
            System.out.println(s +" String is found at index "+in);  
        else  
            System.out.println(s +" String is not found in the array");
	}
}
