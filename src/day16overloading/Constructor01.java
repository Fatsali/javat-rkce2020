package day16overloading;

public class Constructor01 {

	int price=20000;
	int year=2020;
	String make="Honda";
	String type="Civic";

	public static void main(String[] args) {
		// class olu�turdu�umuzda java classla beraber bir constructor olu�turur.biz onu 
		// herhangi bir kod yazmadan direk kullanabiliriz. bu constructor'a defoult constructor denir.
		//default constructorlarda parametre olmaz.
		//default constructor class olu�turuldu�u anda java taraf�ndan olu�tururlur.
		//biz kendimiz bir constructor olu�turdu�umuzda java default constructor i imha eder
		Constructor01 hondaAraba=new Constructor01();// bir tane obje �rettiniz.
		
		System.out.println("Price: "+hondaAraba.price);
		System.out.println("Year: "+hondaAraba.year);
		System.out.println("Make: "+hondaAraba.make);
		System.out.println("Type: "+hondaAraba.type);
	}

}
