package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListIntersection {

	public static void main(String[] args) {
		int []arr1 = {3,2,11,4,6,7};
		int []arr2 = {1,2,8,4,9,7};
		List<Integer> input1 = new ArrayList<Integer>();
		for(Integer i : arr1 ) {
			input1.add(i);
		}
		//System.out.println(input1);
		List<Integer> input2 = new ArrayList<Integer>();
		for(Integer j : arr2 ) {
			input2.add(j);
		}
		//System.out.println(input2);
		for(Integer i : input1) {
			for(Integer j : input2) {
				if(i==j) {
					System.out.println(j);
				}
			}
		}

	}

}
