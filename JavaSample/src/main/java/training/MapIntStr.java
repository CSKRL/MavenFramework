package training;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapIntStr {
	public static void main(String[] args) {
		Map<Integer,String> mapping = new LinkedHashMap<Integer,String>();
		
		mapping.put(101, "karthi");
		mapping.put(102, "kannan");
		mapping.put(103, "Rathi");
		mapping.put(104, "Amudhan");
		mapping.put(102, "kannan");
		mapping.put(105, "Anu");
		mapping.put(106, "Kumar");
		mapping.put(102, "kannan");
		mapping.put(103, "Rathi");
		mapping.put(107, "kannan");
		System.out.println(mapping);
	}

}
