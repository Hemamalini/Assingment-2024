package week1.day2;

public class Fibonacci {
public static void main(String[] args) {
	int range =8;
	int num1=0;
	int num2=1;
	int temp;
	
	// Fn = Fn-1+Fn-2
	// 0, 1, 1, 2, 3, 5, 8, and 13.
	System.out.println(num1);
	System.out.println(num2);
	for (int i = 3; i <= range; i++) {
		 temp = num1+num2;
		 System.out.println(temp);
		 num1=num2;
		 num2=temp;
		
		
	}
	}
}
