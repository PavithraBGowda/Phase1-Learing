package vehicleAssignment;

public abstract class Vehicle {
	int speed = 40;
	long distance = 150;
	Vehicle(){
		
	}
	Vehicle(int speed,long distance)
	{
		
	}
	abstract void run();
	abstract void stop();
	public void fuel(int cost,String type)
	{
		
	}
	public void fuel(float cost,String type)
	{
		
	}
	public void fuel(char type,int cost)
	{
		
	}
	public static void main(String args[])
	 {
		 Vehicle v=new TwoWheeler();
		 Vehicle v1=new ThreeWheeler();
		 Vehicle v2=new FourWheeler();
		 Vehicle v3=new EightWheeler();
		 v.run();
		 v.stop();
		 
		 v1.run();
		 v1.stop();
		 v2.run();
		 v2.stop();
		 v3.run();
		 v3.stop();	 
	 }
	
}
 class TwoWheeler extends Vehicle{
	 int speed = 30;
	 long distance = 110L;
	 int no_of_tyre = 2;
	void run()
	{
		System.out.println("2 Wheeler Runs");
		
	}
	void stop()
	{
		System.out.println("2 Wheeler Stops");
		display();
	}
	void display()
	{
		System.out.println(speed+" "+distance+" "+no_of_tyre+" "+super.speed+" "+super.distance);
	}
	
}
 class ThreeWheeler extends Vehicle{
	 int speed = 45;
	 long distance = 150L;
	 int no_of_tyre = 3;
	void run()
	{
		System.out.println("3 Wheeler Runs");
	}
	void stop()
	{
		System.out.println("3 Wheeler Stops");
		display();
	}
	void display()
	{
		System.out.println(speed+" "+distance+" "+no_of_tyre+" "+super.speed+" "+super.distance);
	}
	
}
 class FourWheeler extends Vehicle{
	 int speed = 30;
	 long distance = 280L;
	 int no_of_tyre = 4;
	void run()
	{
		System.out.println("4 Wheeler Runs");
	}
	void stop()
	{
		System.out.println("4 Wheeler Stops");
		display();
	}
	void display()
	{
		System.out.println(speed+" "+distance+" "+no_of_tyre+" "+super.speed+" "+super.distance);
	}
	
}
 class EightWheeler extends Vehicle{
	 int speed = 35;
	 long distance = 450L;
	 int no_of_tyre = 8;
	void run()
	{
		System.out.println("8 Wheeler Runs");
	}
	void stop()
	{
		System.out.println("8 Wheeler Stops");
		display();
	}
	 void display()
	{
		System.out.println(speed+" "+distance+" "+no_of_tyre+" "+super.speed+" "+super.distance);
	}
 }