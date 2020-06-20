package day29polymorphismexception;

public class Exception01 {

	public static void main(String[] args) {
		// Exception istisnai hata denir
		//temelde ka� t�r exception var
		//temelde iki t�r except�on var. 1) compile time exception (checked)
		//2) run time exception 
		//compile time exception a �rnek verebilir misiniz.
		//tabi ki 1) FileNotFoundException==>Dosya bulunmad��� zaman ortaya ��kar
		//2) IOException(input output Exception) input veya output yap�l�rken olu�an problemlerdir. 
		//not: fileNotFoundException , IOException �n child idir
		//not: compile time exception lar mutlaka handle edilmelidir. halledilmelidir. 
		
		
		//Checked exceptionlar nas�l handle edilir?**********
				// iki t�rl� yap�yoruz:
				// 1*) throws yazmak: javaya: "problem varsa yard�m iste demektir."
				// 2-)try-catch blocks. try: dene, catch= yakala demketir.
				// 3-) dene- hata c�karsa -yakala-yapamazsan-bana mesaj at. readable d�r.
				//aradaki fark: try catch �nce dener. olmazsa mesaj atar.
				//ama throw da haz�r mesajlar� ekrana atar problem hakk�nda.
				//try da ayr�nt� ve hatan�n yerini �zetleyen bir mesaj yazabilirz. bu y�zden readable dir.
		
	}

}
