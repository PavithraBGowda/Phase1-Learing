package program.java.inner.classes;

class MotherBoard {

	   // static nested class
	   static class USB{
	       int usb2 = 2;
	       int usb3 = 1;
	       int getTotalPorts(){
	           return usb2 + usb3;
	       }
	       static void disp(){
	    	   System.out.println("We are into static method of inner class");
	       }
	   }

	}
public class Static_Nest_Main {

	public static void main(String[] args) {
		 MotherBoard.USB usb = new MotherBoard.USB();
	       System.out.println("Total Ports = " + usb.getTotalPorts());
	       
	       MotherBoard.USB.disp();
	}

}
