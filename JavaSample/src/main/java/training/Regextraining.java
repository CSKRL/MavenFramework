package training;

public class Regextraining {
	public static void main(String[] args) {
		String name = "@Amazon has 30000 emp avilable in India";
		
		String t = name.replace('a', 't');
		//System.out.println(t);
		String ka = name.replace("ar", "xy");//kxythi
		//System.out.println(ka);
		String rx = name.replaceAll("[@]"," ");
		//System.out.println(rx);
		System.out.println(rx);
		//System.out.println(rx.replace(" ", ""));
	}

}
