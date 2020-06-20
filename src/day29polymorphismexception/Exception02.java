package day29polymorphismexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class Exception02 {
	
	// Checked Exception larý (compile Time Exceptionlarý  handle etmek için iki yol var birincisi throws keybordunu kullnmak. bunun
	// kullanýrsanýz console de teknik mesajlar görürsünüz o yüzden tercih edilmez
	
	public static void main(String[] args) throws FileNotFoundException {
	
			FileInputStream file=new FileInputStream("C:/ogrenci.txt");
		

	}
}

	//ikincisi try-catch block kullanmaktýr. bunu kullanýrsanýz console de teknik mesajlar yerine kendi yazdýðýnýz mesajlarý görebilirsiniz. 
	// bu yüzden try-catch kullanmak tercih edilir. 
class ExceptionTryCatch{
	public static void main(String[]args) {
		try {
			FileInputStream file=new FileInputStream("C:/ogrenci.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Dosyanýn path'i yanlýþ veya dosya silinmiþ olabilir. ");
		}	
		
	}
}