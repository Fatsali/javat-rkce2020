package day17constructors;

public class Constructors04 {

	int num1=12;
	static int num2=22;
	
	public static void main(String[] args) {
		// static methodlarýn içinde sadece static elemanlar kullanýlabilir.
		//num1 static olmadýðýndan main method içinde kullanýlamaz.
		//num2 static olduðundan main methodun içinde kullanmamýz problm olmuyor
		//num1++;// num1++; nýn önündeki commenti kaldýrýrsanýn java num1++ nýn altýný kurmýzý çizer.
		num2++;
	}

}
