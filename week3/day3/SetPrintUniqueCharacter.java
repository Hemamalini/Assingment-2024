package week3.day3;

import java.util.HashSet;
import java.util.Set;

public class SetPrintUniqueCharacter {

	public static void main(String[] args) {
		String name="Hemamalini";//op--> Hemalin
		System.out.println("The given name is "+name);
		char[] charArray = name.toCharArray();
		
		Set<Character> obj = new HashSet<Character>();
		
		for(char i : charArray) {
			obj.add(i);
			
		}	
		System.out.print("The unique value is"+obj);
		
	}

}
