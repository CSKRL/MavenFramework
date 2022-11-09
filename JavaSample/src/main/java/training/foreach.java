package training;

import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.commons.math3.analysis.function.Add;

public class foreach {
	public static void main(String[] args) {
		int[] number = {1,22,3,54,65,22,43,67,98,1};
		
		Set<Integer> myset = new LinkedHashSet<Integer>();
		for(int i=0;i<number.length;i++) {
			myset.add(number[i]);
		}
		System.out.println(myset);
			
	}

}

