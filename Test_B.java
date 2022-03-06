package accessModifiers;

public class Test_B {

	public static void main(String[] args) {
		new Test_A().methodPublic();
		new Test_A().methodProtected();
		new Test_A().methodDefault(); 
		System.out.println("Value of long"+ new Test_A().k);		
	}

	public void methodPublic() {
		System.out.println("Class TestB: methodPublic");
	}

	protected void methodProtected() {
		System.out.println("Class TestB: methodProtected");
		
	}

	void methodDefault() {
		System.out.println("Class TestB: methodDefault");
	}

	private void methodPrivate() {
		System.out.println("Class TestB: methodPrivate");


	}

}
