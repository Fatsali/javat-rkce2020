package day29polymorphismexception;

public class Exception01 {

	public static void main(String[] args) {
		// Exception istisnai hata denir
		//temelde kaç tür exception var
		//temelde iki tür exceptýon var. 1) compile time exception (checked)
		//2) run time exception 
		//compile time exception a örnek verebilir misiniz.
		//tabi ki 1) FileNotFoundException==>Dosya bulunmadýðý zaman ortaya çýkar
		//2) IOException(input output Exception) input veya output yapýlýrken oluþan problemlerdir. 
		//not: fileNotFoundException , IOException ýn child idir
		//not: compile time exception lar mutlaka handle edilmelidir. halledilmelidir. 
		
		
		//Checked exceptionlar nasýl handle edilir?**********
				// iki türlü yapýyoruz:
				// 1*) throws yazmak: javaya: "problem varsa yardým iste demektir."
				// 2-)try-catch blocks. try: dene, catch= yakala demketir.
				// 3-) dene- hata cýkarsa -yakala-yapamazsan-bana mesaj at. readable dýr.
				//aradaki fark: try catch önce dener. olmazsa mesaj atar.
				//ama throw da hazýr mesajlarý ekrana atar problem hakkýnda.
				//try da ayrýntý ve hatanýn yerini özetleyen bir mesaj yazabilirz. bu yüzden readable dir.
		
	}

}
