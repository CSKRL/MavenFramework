package javaoops;

public class Computer extends Desktop {
	public void computername(){
		System.out.println("Dell");
		
	}
	public void computermodel() {
		System.out.println("Dell5790");
	}
	public static void main(String[] args) {
		Computer cd = new Computer();
		Desktop d = new Desktop();
		cd.computername();
		cd.computermodel();
		d.computermodel();
		d.computername();
		
		
	}

}
