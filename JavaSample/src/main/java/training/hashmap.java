package training;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
	public static void main(String[] args) {
		String name[] = {"karthikannan","anu"};
		int num[]= {1001,1002};
		for(int i=0;i<name.length;i++) {
			for(int j=0;j<num.length;j++) {
				Map<String, Integer> mymap= new HashMap<String, Integer>();
					mymap.put(name[i], num[j]);
					System.out.println(mymap);
		}
		
	}
	}
}


