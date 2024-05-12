package week1.day2;

public class FindOddNumbers {

	public static void main(String[] args) {
		int range= 10;//1 3 5 7 9
		System.out.println("The odd numbers inbetween 10 is : ");
		for (int i = 1; i <= range; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

}
