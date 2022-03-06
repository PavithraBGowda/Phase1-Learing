package assignmentTest;
import java.util.Scanner;
public class FrameSentence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Sentence:");
		String str = input.nextLine();
		String word = "" + str.charAt(0);
		int len = str.length();
		
		for(int i=0; i<len; i++)
		{
			char ch =str.charAt(i);
			if (ch == ' ')
				word += str.charAt(i + 1);
		}
		System.out.println(word);
	}
}
