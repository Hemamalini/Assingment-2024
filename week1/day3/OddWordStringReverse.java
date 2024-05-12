package week1.day3;

public class OddWordStringReverse {

	public static void main(String[] args) {
		String test = "I am a software tester";
		char[] charArray = test.toCharArray();
		for (int i = 0; i <= charArray.length-1; i++) {
			if(i%2!=0) {
				System.out.print(charArray[i]+ " ");
			}

		}
	}
}