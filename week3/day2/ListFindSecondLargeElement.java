package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFindSecondLargeElement {

	public static void main(String[] args) {
		List<Integer> obj = new ArrayList<Integer>();
		obj.add(3);
		obj.add(2);
		obj.add(11);
		obj.add(4);
		obj.add(6);
		obj.add(7);
		Collections.sort(obj);
		//System.out.println(obj);
		int size = obj.size();
		Integer integer = obj.get(size-2);
		System.out.println("The Second Largest Value is : "+integer);
		

	}

}
