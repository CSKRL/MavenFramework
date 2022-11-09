package training;

public class Duplicatelistnumber {
	public static void main(String[] args) {
		int[] number = {1,22,3,54,65,22,43,67,98,1};
		
		for(int i=0;i<number.length;i++) {
			for(int j=i+1;j<number.length;j++) {
				if(number[i]==number[j]) {
					//System.out.print(number[j] +",");
				}
				System.out.print(number[j]+" ");
			}
		}
		
	}

}
