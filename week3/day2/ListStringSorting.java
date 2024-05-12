package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListStringSorting {

	public static void main(String[] args) {
		List<String> obj = new ArrayList<String>();
		obj.add("HCL");
		obj.add("Wipro");
		obj.add("Aspire Systems");
		obj.add("CTS");
	//	System.out.println(obj);
		//To reverse the list syntax
		//Collections.sort(ArrayList, Collections.reverseOrder());

		Collections.sort(obj, Collections.reverseOrder());//op wipro hcl cts aspire
		System.out.println(obj);
		
		
	}

}
