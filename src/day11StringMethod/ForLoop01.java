package day11StringMethod;

public class ForLoop01 {

	public static void main(String[] args) {
		// 
		
		//for(ba�lang�� de�eri;bitirme �art�, artt�rma veya azaltma){
		//6,5,4,3 ve 2 yi ekrana yazd�ran bir for loop olu�turun
		for(int i=6;i>-2;i--) {	
		System.out.println(i);
		}
		
		//3,4,5,6,7 say�lar�n� olu�turan bir  for loop olu�turunuz.
		for(int i=3;i<8;i++) {
			System.out.println(i);
		}
		//ilk 100 sayma say�s�n� 1 den 100 kadar yazd�r�n
		for(int i=1;i<101;i++) {
			System.out.print(" "+i);
		}
			//ilk 100 sayma say�s�n� 100 den 1 kadar yazd�r�n
			for(int i=1;i>0;i--) {
				System.out.print(" "+i);
			}
		System.out.println();
		//ilk 50 �ift sayma say�s�n� ekrana yazd�ran for loop olu�turunuz
			for(int i=2;i<100;i=i+2) {
				System.out.print(i+" ");	
				}
		System.out.println();
		// ilk 50 tek sayma say�s�n�
		for(int i=1;i<100;i=i+2) {
			System.out.print(i+" ");	
			}
		
	}
	
}
