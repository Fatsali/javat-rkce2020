package day11StringMethod;

public class ForLoop03 {

	public static void main(String[] args) {
		//ilk 4 sayma say�s�n�n �arp�m�n� veren for loop olu�turunuz
		int product=1;
		for(int i=1;i<5;i++) {
		product=product*i;
		}
		System.out.println(product);
		
		//ilk 6 �ift say�n�n �arp�m�
		int product2=1;
		for(int i=2;i<13;i=i+2) {
		product2=product2*i;
		}
		System.out.println(product2);
		
		//9! hesaplayan for loop kuull
		int product3=1;
		for(int i=1;i<10;i=i+1) {
		product3=product3*i;
		}
		System.out.println(product3);
		
	}

}
