package training;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class diffList {
	public static void main(String[] args) {
		String[] name = {"kk","karthi kannan","kk"};
		List<String> namelist = new ArrayList<String>();
		Set<String> myset = new HashSet<String>();
		//for(int i=0;i<name.length;i++) 
		for(String eachname:name){
			//namelist.contains(name[i]);
			//System.out.println(name[i]);
			namelist.add(eachname);
			namelist.remove(" ");
		}
		for(int i=0;i<name.length;i++) {
			myset.add(name[i]);
		}
				System.out.println(namelist);
				System.out.println(myset);
		
	}

}
