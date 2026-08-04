package ex_16_Arrays;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Arraylist_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("Apple");
		a.add("Banana");
		a.add("Watermelon");
		a.add("");
		a.add("Watermelon");
		
		

		Set<String> set = new HashSet<String>();
		
		for(int i = 0;i<a.size();i++)  {
			if(!set.add(a.get(i))){
				System.out.println(a.get(i)+" duplicate at index "+ i);
			}
		}
}
}
