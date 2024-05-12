package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMissingElement {

	public static void main(String[] args) {
		int[] input = {1,2,3,4,10,6,8};
		List<Integer> obj = new ArrayList<Integer>();
		for(Integer i : input ) {
			obj.add(i);
		}
		//int flag=0;
		Collections.sort(obj);
		System.out.println(obj);
		for(Integer i : obj ) {
			//System.out.println(i);
			if((obj.get(i)+1)!=obj.get(i+1)) {
				//flag=i+1;
				System.out.println(obj.get(i)+1);
				break;
			}

		}
	}

}
