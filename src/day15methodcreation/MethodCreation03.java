package day15methodcreation;

import java.util.Scanner;

public class MethodCreation03 {

	public static void main(String[] args) {
		// basit hesap makinesi 
		// kullanýcýdan yapacaðý iþlemi iþlem sembolü ile seçmesini saðlayalým
		//kullanýcýdan iki sayý girmesini isteyin
		//girilen iki sayý ve seçilen iþleme göre doðru sonucu ekrana yazdýralým
		
		Scanner scan=new Scanner(System.in);
		System.out.println("+;-,x,: iþlemlerinden birini seciniz");
		char islem=scan.next().charAt(0);
		System.out.println("Islem yapmak için ik sayý giriniz");
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
			System.out.println("+;-,x,: dýsýnda bir iþlem secmeyiniz");
		}
		
		
	}
	


}
