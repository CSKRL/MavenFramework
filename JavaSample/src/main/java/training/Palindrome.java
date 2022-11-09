package training;

public class Palindrome {
	public static void main(String[] args) {
		String str = "Radar", reverseStr = "";
		int strlength = str.length();
		for(int i=(strlength-1);i>=0;i--) {
			reverseStr= reverseStr+str.charAt(i);
		}
		System.out.println(reverseStr);
	}

}
