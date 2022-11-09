package training;

import java.util.ArrayList;
import java.util.List;

public class ListTraining {
	public static void main(String[] args) {
		int Number[] = {1,2,3,4,4,5,2,3};
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		/*
		 * list.add("Amudhan"); list.add(2, "Rathi"); list.add(3, "Anu");
		 */
		//list.remove(0);
		//list.clear();
		boolean empty = list.isEmpty();
		System.out.println(empty);
		for(int eachname:Number) {
			list.add(eachname);
			
			}
		int size = list.size();
	System.out.println(list);
	System.out.println(size);
	}

}
