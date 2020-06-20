package day06ifstatement;

public class IfStatement03 {

	public static void main(String[] args) {
		//bir char variable olu�turun ve bir de�er atay�n
		//eger atanan deger haftan�n g�nlerinden herhangi birinin ilk harfi ise o g�nleri yazd�r�n
		//eger de�il ise b�yle bir g�n yok yazacak
		
		
		char gun='C';
		if(gun=='P') {
			System.out.println("Pazartesi Pazar ve Persembe");
		}
		if(gun=='S') {
			System.out.println("Sal�");
		}
		
		if(gun=='C') {
			System.out.println("Carsamba,Cuma ve Cumartesi");
		}
		//"p" olmamak veya "C" olmamak
		
		if(gun!='P') {
			System.out.println("B�yle bir g�n yok");
		}
		if(gun!='S') {
			System.out.println("B�yle bir g�n yok");
		}
		if(gun!='C') {
			System.out.println("B�yle bir g�n yok");
		}
		//ve i�leminden true sonucunu almak i�in t�m conditionlar true olmal�d�r
		//veya i�leminden true sonucu almak i�in bir tanesinin true olmas� yeterlidir.
		//true||true=true, true||false=true, false||false=false
		 // "P" olmamak VEYA "C" olmamak VEYA "S" olmamak ==> VEYA islemi icin || ==> | -> Pipe denir
        // VEYA isleminden True sonucu alabilmek bir tanesinin True olmasi yeterlidir
        // True||True = True <-> True||False = True <-> False||False = False
        // True=1, False=0 ==> VEYA islemi toplamaya benzer
        
        
        // "P" olmamak VE "C" olmamak VE "S" olmamak ==> VE islemi icin &&
        // VE isleminden True sonucu alabilmek icin tum condition'lar true olamalidir
        // True && True = True <-> True && False = False <-> False && False = False
        // True=1, False=0 ==> VE islemi carpmaya benzer

		
		
		 if(gun!='P'||gun!='C'||gun!='S') {
			System.out.println("B�yle bir g�n yok");
		}
		
		if (gun!='P'&&gun!='C'&&gun!='S') {
			System.out.println("B�yle bir g�n yok");
		}
		
	}

}
