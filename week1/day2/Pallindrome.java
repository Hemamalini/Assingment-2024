package week1.day2;

public class Pallindrome {

	public static void main(String[] args) {
		int num =121;
		int rem,temp,sum=0;
		
		  temp=num;    
		  while(num >0){    
		   rem=num%10;  //getting remainder  
		   sum=(sum*10)+rem;    
		   num=num/10;    
		  }
		  if (temp==sum) {
			System.out.println("The given number is palindrome");
		}else {
			System.out.println("The given number is not palindrome");
		}
	}

}
