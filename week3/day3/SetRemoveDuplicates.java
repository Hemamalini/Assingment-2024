package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;


public class SetRemoveDuplicates {

	public static void main(String[] args) {
		String name= "PayPal India";
		String[] split = name.split("");
		System.out.println("Before duplicate : "+name);
		//using Set
		Set<String> charSet = new LinkedHashSet<String>();
		for(String i :split ) {
			charSet.add(i);
		}
		for(String i :charSet ) {
			System.out.print(i);
		}

	}

}
