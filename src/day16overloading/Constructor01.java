package day16overloading;

public class Constructor01 {

	int price=20000;
	int year=2020;
	String make="Honda";
	String type="Civic";

	public static void main(String[] args) {
		// class oluþturduðumuzda java classla beraber bir constructor oluþturur.biz onu 
		// herhangi bir kod yazmadan direk kullanabiliriz. bu constructor'a defoult constructor denir.
		//default constructorlarda parametre olmaz.
		//default constructor class oluþturulduðu anda java tarafýndan oluþtururlur.
		//biz kendimiz bir constructor oluþturduðumuzda java default constructor i imha eder
		Constructor01 hondaAraba=new Constructor01();// bir tane obje ürettiniz.
		
		System.out.println("Price: "+hondaAraba.price);
		System.out.println("Year: "+hondaAraba.year);
		System.out.println("Make: "+hondaAraba.make);
		System.out.println("Type: "+hondaAraba.type);
	}

}
