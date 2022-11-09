package training;

public class Fibbo {
	public static void main(String[] args) {
		// int a = 0, int b = 1; int c;
		int a=0;
		int b=1;
		int c;
		int d=12;
		System.out.print(a+" ");
		System.out.print(b+" ");
		//0 1 1 2 3 5 8
		for(int i=3;i<=d;i++) {
			c =a+b;
			System.out.print(c+" ");
			// a=0,b=1,c=1
			a=b;
			b=c;
		}
		
		
	}

}
