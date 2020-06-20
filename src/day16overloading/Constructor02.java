package day16overloading;

public class Constructor02 {
	//1) baþka bir class dan ürettigimiz objecet ürettiðimiz class da kullnabiliriz
	//2)object in özelliklerini deðiþtirebiliriz. bu deðiþim sadece o object ile sýnýrlý kalýr
	//yeni üretilecek objectler bu deðiþimden etkilenmez
	//3)eðer üretilecek objenin deðiþim ugramýþ olmasýný istiyorsanýz classýn özelliklerini deðiþtirmelisiniz
	
	
 public static void main(String[]args) {
	 
	 Constructor01 hondaAraba01=new Constructor01();
	 System.out.println("Zamlý fiyat: "+(hondaAraba01.price+1000));
	 System.out.println("Year: "+(hondaAraba01.year-1));
	 System.out.println("Make: "+hondaAraba01.make.replace("Honda","Toyota"));
	 System.out.println("Type: "+hondaAraba01.type.replace("Civic"," Camry"));
	 
	 Constructor01 hondaAraba02=new Constructor01();
	 System.out.println("Zamli Fiyat: "+(hondaAraba02.price));
	}

}
