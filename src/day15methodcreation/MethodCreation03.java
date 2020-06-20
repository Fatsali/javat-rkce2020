package day15methodcreation;

import java.util.Scanner;

public class MethodCreation03 {

	public static void main(String[] args) {
		// basit hesap makinesi 
		// kullan�c�dan yapaca�� i�lemi i�lem sembol� ile se�mesini sa�layal�m
		//kullan�c�dan iki say� girmesini isteyin
		//girilen iki say� ve se�ilen i�leme g�re do�ru sonucu ekrana yazd�ral�m
		
		Scanner scan=new Scanner(System.in);
		System.out.println("+;-,x,: i�lemlerinden birini seciniz");
		char islem=scan.next().charAt(0);
		System.out.println("Islem yapmak i�in ik say� giriniz");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		
		hesapMakinasi(islem,num1,num2);
		
		scan.close();
		
	}
	public static void hesapMakinasi(char islem,double num1,double num2) {
		switch(islem) {
		case '+':
			System.out.println(num1+"+"+num2+"="+(num1+num2));
			break;
		case '-':
			System.out.println(num1+"-"+num2+"="+(num1-num2));
			break;
		case 'x':
			System.out.println(num1+"x"+num2+"="+(num1*num2));
			break;
		case ':':
			System.out.println(num1+":"+num2+"="+(num1/num2));
			break;
		default:
			System.out.println("+;-,x,: d�s�nda bir i�lem secmeyiniz");
		}
		
		
	}
	


}
