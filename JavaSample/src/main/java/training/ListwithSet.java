package training;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListwithSet {
	public static void main(String[] args) {
		int[] number = {1,2,3,4,5,9,2,3,4,5,8,10};
		List<Integer> mylist= new ArrayList<Integer>();
		for(int i=0;i<number.length;i++) {
			mylist.add(number[i]);
		}
		try {
			Set<Integer> myset = new LinkedHashSet<Integer>(mylist);
			System.out.println(myset);
			
		} catch (Exception e) {
			
		}
	}
}
		


