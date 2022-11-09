package training;

public class Mapping {
	public static void main(String[] args) {
		int num1[] = {10,7,20,40};
		int num2[] = {10,7,9,20};
		for(int i=0;i<num1.length;i++) {
			
			for(int j=0;j<num2.length;j++) {
				
				if(!(num1[i]!=num2[j]))
				{
					System.out.print(num2[j]+" ");
				}
				
			}
		}
	}

}
