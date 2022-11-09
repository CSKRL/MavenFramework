package training;

import java.util.HashMap;
import java.util.Map;

public class MapLooping {
	public static void main(String[] args) {
		String text = "karthikannan";
			Map<Character,Integer> maploop = new HashMap<Character,Integer>();
		for(int i=0;i<text.length();i++) {
			//System.out.println(text.charAt(i));
			if(maploop.containsKey(text.charAt(i))){
				maploop.put(text.charAt(i), maploop.get(text.charAt(i))+1);
			}else {
				maploop.put(text.charAt(i),1);
			}
			
		}
		System.out.println(maploop);
		
	}

}
