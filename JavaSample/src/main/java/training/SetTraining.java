package training;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTraining {
	public static void main(String[] args) {
		Set<Integer> myset= new HashSet<Integer>();
		Set<Integer> myset1= new TreeSet<Integer>();
		Set<Integer> myset2= new LinkedHashSet<Integer>();
	int number[] = {10,60,30,10,30,50,60,70,11};
		for(int i=0;i<number.length;i++) {
			myset.add(number[i]);			
		}
		System.out.println(myset);
		for(int i=0;i<number.length;i++) {
			myset1.add(number[i]);			
		}
		System.out.println(myset1);
		for(int i=0;i<number.length;i++) {
			myset2.add(number[i]);			
		}
		System.out.println(myset2);
	}
	

}
