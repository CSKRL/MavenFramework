package training;

public class objpro {
	public int add() {
		int a=5;
		int b=6;
		int c =a+b;
		return c;
	}
	public int mul(int a,int b, int c) {
		return c=a*b*c;
	}
	public static void main(String[] args) {
		objpro objclass = new objpro();
		Object action = objclass.mul(2, 22, 2);
		int add = objclass.add();
		System.out.println(action);
		System.out.println(add);
	}

}
