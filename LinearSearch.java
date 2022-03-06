package searchingProgram;

public class LinearSearch {

	public static void main(String[] args) {
		int ele=31;
		int[] a=new int[10];
		a[0]=29;
		a[1]=33;
		a[2]=456;
		a[3]=67;
		a[4]=90;
		a[5]=31;
		a[6]=754;
		a[7]=656;
		a[8]=67;
		a[9]=88;
		for(int i=1;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				System.out.println("found");
			}
			else
			{
				System.out.println("not found");
	}
		}
	}
}
