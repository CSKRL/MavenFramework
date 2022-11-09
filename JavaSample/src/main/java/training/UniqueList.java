package training;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueList {
	public static void main(String[] args) {
		int[] number = {1,22,3,54,65,22,43,67,98};
		List<Integer> listnum = new ArrayList<Integer>();
		//Set<Integer> setter = new HashSet<Integer>(listnum);
		
		for(int eachnumber:number) {
			listnum.add(eachnumber);
			
		}
		Set<Integer> setter = new LinkedHashSet<Integer>(listnum);
		System.out.println(setter);
		
	}
	

}
