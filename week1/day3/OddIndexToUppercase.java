package week1.day3;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		String textName= "changeme";//H N E E
		String upperCase = textName.toUpperCase();
		char[] charArray = upperCase.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(i%2!=0) {
			System.out.print(charArray[i]+ " ");
			}
		}
	}

}
