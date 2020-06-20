package day06ifstatement;

public class IfStatement03 {

	public static void main(String[] args) {
		//bir char variable oluþturun ve bir deðer atayýn
		//eger atanan deger haftanýn günlerinden herhangi birinin ilk harfi ise o günleri yazdýrýn
		//eger deðil ise böyle bir gün yok yazacak
		
		
		char gun='C';
		if(gun=='P') {
			System.out.println("Pazartesi Pazar ve Persembe");
		}
		if(gun=='S') {
			System.out.println("Salý");
		}
		
		if(gun=='C') {
			System.out.println("Carsamba,Cuma ve Cumartesi");
		}
		//"p" olmamak veya "C" olmamak
		
		if(gun!='P') {
			System.out.println("Böyle bir gün yok");
		}
		if(gun!='S') {
			System.out.println("Böyle bir gün yok");
		}
		if(gun!='C') {
			System.out.println("Böyle bir gün yok");
		}
		//ve iþleminden true sonucunu almak için tüm conditionlar true olmalýdýr
		//veya iþleminden true sonucu almak için bir tanesinin true olmasý yeterlidir.
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
			System.out.println("Böyle bir gün yok");
		}
		
		if (gun!='P'&&gun!='C'&&gun!='S') {
			System.out.println("Böyle bir gün yok");
		}
		
	}

}
