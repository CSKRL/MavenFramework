package training;

public class Letteridentification {
	public static void main(String[] args) {
		char letter = 'a';
		String name ="karthikannan";
		int c = 0;
		for(int i=0;i<name.length();i++) {
			//System.out.println(name.charAt(i));
			if(name.charAt(i)==letter) {
				c=1;
				break;
			}else {
				c=0;
			}
			}
		if(c==1) {
			System.out.println("Name has expected chracter");
		}else
				System.out.println("Name doesnt have expected chracter");
		}
	}


