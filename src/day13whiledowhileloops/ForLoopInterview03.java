package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview03 {

	public static void main(String[] args) {
		// kullan�c�dan bir say� al�n bu say�n�n tersini ekrana yazd�r�n�z
		//bu say�n�n tersinin iki fazlas�n� yazd�r�n�z
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir say� giriniz");
		String num=scan.nextLine();
		 
		String ters="";
		for(int i=num.length()-1;i>=0;i--) {
			ters=ters+num.charAt(i)+"";//char � Stringe �evirmek i�in sonuna +"" ekleyebilirsiniz.
		}//System.out.println(ters);
		
		int tersInt=Integer.valueOf(ters);
		tersInt=tersInt+2;
		
		System.out.println(tersInt);
		
		}
		
	}


