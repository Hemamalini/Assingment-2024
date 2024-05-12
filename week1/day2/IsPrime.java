package week1.day2;

public class IsPrime {
	public static void main(String[] args) {
		//prime no is divisible by only 1 and itself
		int num = 45;
		boolean check = false;
		for(int i=2;i<=num/2;++i) {
			if(num%i==0) {
				System.out.println("The number "+num+" is not prime");
				check = true ;
				break ;
			}}if(!check) {
				System.out.println("The number "+num+" is prime");
			}
			
	}}
