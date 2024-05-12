package week1.day3;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayMissingelement {
	public static void main(String[] args) {
		int numArray[]= {1, 4,3,2,8,6,7};
		int flag = 0;
		Arrays.sort(numArray);//1 2 3 4 6 7 8
		for (int i = 0; i <numArray.length-1; i++) {	
			if((i+1)!=numArray[i]) {
				flag=i+1;
				System.out.println("The missing Element is : "+flag);
				break;
			}

		}
	}                                                                            }


