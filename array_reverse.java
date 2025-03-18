package day1;

import java.util.Arrays;
import java.util.Scanner;

public class array_reverse {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array");
		int size=sc.nextInt();
		int num[]=new int[size];
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
			
		}
		 System.out.println(Arrays.toString(num));
		 int left = 0;
	        int right = num.length - 1;

	        while (left < right) {
	            int temp = num[left];
	            num[left] = num[right];
	            num[right] = temp;
	            left++;
	            right--;
	        }
	        System.out.println(Arrays.toString(num));
	    }
		
		}
		

