package day16overloading;

public class Constructor02 {
	//1) ba�ka bir class dan �rettigimiz objecet �retti�imiz class da kullnabiliriz
	//2)object in �zelliklerini de�i�tirebiliriz. bu de�i�im sadece o object ile s�n�rl� kal�r
	//yeni �retilecek objectler bu de�i�imden etkilenmez
	//3)e�er �retilecek objenin de�i�im ugram�� olmas�n� istiyorsan�z class�n �zelliklerini de�i�tirmelisiniz
	
	
 public static void main(String[]args) {
	 
	 Constructor01 hondaAraba01=new Constructor01();
	 System.out.println("Zaml� fiyat: "+(hondaAraba01.price+1000));
	 System.out.println("Year: "+(hondaAraba01.year-1));
	 System.out.println("Make: "+hondaAraba01.make.replace("Honda","Toyota"));
	 System.out.println("Type: "+hondaAraba01.type.replace("Civic"," Camry"));
	 
	 Constructor01 hondaAraba02=new Constructor01();
	 System.out.println("Zamli Fiyat: "+(hondaAraba02.price));
	}

}
