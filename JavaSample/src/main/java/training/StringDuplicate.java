package training;

import java.util.HashSet;
import java.util.Set;

public class StringDuplicate {
	public static void main(String[] args) {
		String Name[] = {"kk","karthi","kannan","kk","kannan"};
		Set<String> duplicate = new HashSet<String>();
		for(String eachname:Name) {
			duplicate.add(eachname);				
		}
		System.out.println(duplicate);
		
	}

}
