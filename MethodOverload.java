package program.test;

public class MethodOverload {

	public static void main(String[] args) {
		MethodOverload ob1 = new MethodOverload();
		int x1 = ob1.add(4,5);
		double x2 = ob1.areaCircle(4);
		int x3 = ob1.areaRectangle(5,2);
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
	}
	int add(int a, int b){
		return a+b;
	}
	 private double areaCircle(int radius) {
		return 3.14*radius*radius;
	}
	 private int areaRectangle(int length, int breadth) {
			return length*breadth;
	 }
		
	}
