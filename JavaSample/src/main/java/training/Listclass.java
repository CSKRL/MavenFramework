package training;

import java.util.ArrayList;
import java.util.List;

public class Listclass {
	public static void main(String[] args) {
		int[] number = {1,22,3,54,65,22,43,67,98,1};
		List<Integer> mylist= new ArrayList<Integer>();
		
		System.out.println(mylist);
		for(Integer eachnumber:number) {
			mylist.add(eachnumber);
			System.out.print(eachnumber+" ' ");
		}
		
		
	}

}
