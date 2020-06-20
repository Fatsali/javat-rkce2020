package day29polymorphismexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class Exception02 {
	
	// Checked Exception lar� (compile Time Exceptionlar�  handle etmek i�in iki yol var birincisi throws keybordunu kullnmak. bunun
	// kullan�rsan�z console de teknik mesajlar g�r�rs�n�z o y�zden tercih edilmez
	
	public static void main(String[] args) throws FileNotFoundException {
	
			FileInputStream file=new FileInputStream("C:/ogrenci.txt");
		

	}
}

	//ikincisi try-catch block kullanmakt�r. bunu kullan�rsan�z console de teknik mesajlar yerine kendi yazd���n�z mesajlar� g�rebilirsiniz. 
	// bu y�zden try-catch kullanmak tercih edilir. 
class ExceptionTryCatch{
	public static void main(String[]args) {
		try {
			FileInputStream file=new FileInputStream("C:/ogrenci.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Dosyan�n path'i yanl�� veya dosya silinmi� olabilir. ");
		}	
		
	}
}