package day18statickeyword;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

  public class ThisKeyword {
	
		  public static void main(String[] args) {
			  long binary1, binary2;
			  int i = 0, remainder = 0;
			  int[] sum = new int[20];
			  Scanner in = new Scanner(System.in);
			  binary1 = in.nextLong();
			  binary2 = in.nextLong();
			  
			
			
			long a=binary1+binary2;
	
			while(a>0){
				System.out.print(a%2);
				a=a/2;
				
			}
			
				}
			 
		  }
 
  

