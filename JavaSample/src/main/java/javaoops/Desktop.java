package javaoops;

public class Desktop implements Dell {

	public void computername() {
		System.out.println("Dellsystem");
		
	}

	public void computermodel() {
		System.out.println("Dell5950");
		
		
	}
	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		desktop.computername();
		desktop.computermodel();
	}
	

}
