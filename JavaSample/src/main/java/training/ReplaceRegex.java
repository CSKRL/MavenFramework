package training;

public class ReplaceRegex {
	
	public static void main(String[] args) {
		String test = "$$ Welcome to 1st Automation Interview $$ ";
		
		String alp = test.replaceAll("[^a-zA-Z]", ""); //WelcometostAutomationInterview
		System.out.println(alp);

		String onlyNumber = test.replaceAll("[^0-9]", ""); // other options is \\D
		System.out.println(onlyNumber);

		String spl = test.replaceAll("[0-9a-zA-Z ]", ""); //excluding space as well $$$$
		System.out.println(spl);
		test.replace(onlyNumber, spl);
	}

}
