package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview01 {

	public static void main(String[] args) {
		// kullan�c�dan bir String al�n ve ekrana tersten yazd�r�n
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir c�mle veya kelime yaz�n�z");
		String str=scan.nextLine();
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));//naC ilA
		}
		
		
		

	}

}
