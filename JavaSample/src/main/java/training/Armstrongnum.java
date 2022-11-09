package training;

public class Armstrongnum {
	public static void main(String[] args) {
		int calculated=0;
		int reminder;
	     int orginal = 0;		
		int n = 153;
		while(n>0) {
			reminder=n%10;
			n=n/10;
			calculated = calculated+(reminder*reminder*reminder);
			}
		if (orginal == calculated) {
			System.out.println("its armstrong number");
		}else
					System.out.println("Its not armstrong number");	
			}
			
		}
