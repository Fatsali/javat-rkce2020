package day38interviewhazirlik;

public class Interviewhazirlik01 {

	public static void main(String[] args) {
		// 1) java "Platform Independent" programlama dilidir. 
		//Yani; herhangi bir platformda yaz�lan java kodu di�er platformlarda da �al���r. 
		
		//2) IDE ==> Integrated Development Environment demektir.Eclipse ve Intellij piyasada kullan�lan me�hur iki IDE dir. 
		//
		
		//3) Constructor==> Yeni bir obje �retilirken Constructor aktive olur ve objeyi �retir. 
		//return type yoktur. ismi class ismiyle ayn� olmal�d�r. obje �retmek i�in Constructor �retmek zorunda de�iliz . ��nk� java
		//her class i�in defult bir constructor �retmi�tir. Default Constructorlar parametresizdir. bir herhangi bir constructor 
		//�retti�imizde default constructorlar yok olur. constructorlar overload edilebilirlr. 
		//Constructor'lar child classlardan �a�r�labilirler ama override edilemezler. 
		
		//4)OOP Concept nedir? 
		//           OOP concept a)Inheritance b)Encapsulation c)Polymorhism d) Abstarction e) Interface i�erir.
		
		
		//5)Inheritance nedir?
		//           �nheritance parent(super class)-child(sub class) ili�kisidir. 
		//  		A class � B class �na extend ederse A child olur B parent olur. 
		//         A interface i B �nterface ine implements ederse A child olur B parent olur
		//		  A interface i B �nterface ine  extends ederse		A child olur B parent olur
		//			Child parent tadi kodlar�n public ve proteted olanlar�n� kullanabilir. 
		//       Reusability (tekrar kullanabilme), sort coding(kodu k�sa yazma), maintenance(tamir) faydalar� vard�r.
		
		//6) Encapsulation nedir?
		//                    Data hiding (Data gizleme) demektir. Datalar private yap�larak gizlenir. gizlenen datalar getter ile okunur
		//					setter() ile update edilir. 
		//					de�i�tirilmesini istemedi�imiz kodlar� koruma alt�na almak i�in kullan�l�r. maintenance faydas� da vard�r. 
		//					kodun hi� de�i�tirilmesini istemiyorsan�z sadece okunmas�n� isteiyorsn�z o zaman setter olu�turmazs�n�z
		//                  kodun ne de�i�tirilmesini ne de okunmas�n� istiyorsan�z o zaman ne getter ne de setter olu�turmazs�n�z. 
		
		//7) Polymorphis nedir?
		//                    Polymorphism (�oklu yap�) overkoading ve overriding dir
		
		//8) Abstract Class nedir. 
		//						Abstract class �retmek i�in abstract keywort kullanmal�y�z
		//						abstract class lardan object �retilemez. (�nstantiante yap�lamaz)
		//						abstract class larda hem abstract hem de concrete methodlar bulunabilir. 
		//						Abstract method un oldu�u class kesinlikle abstract olmal�d�r. 
		//						abstract methodlar�n (body'siz ) concrete child'lar taraf�ndan override edilme zorunlulu�u vard�r. 
		//						Concrete'ler override edimese de olur. 
		//	Mutlaka s�yle===>	Abstract class i child class lar� baz� g�revleri yapmak zorunda b�rakmak i�in olu�tururuz. 
		
		//9) Interface nedir. 
		//					java normalde multiple inheritance'a m�sade etmez bu y�zden Abstract class kulland���n�zda multiple 
		//				inheritance yapamay�z. fakat baz� projelerde muttiple inheritance kullanmak zorunda kal�r�z.
		//            bunu java bize interface kullanma hakk� vererek halletmi�tir. c�nk� interfacelere mutiple implements //extends
		//           yap�labilir. Detaylar� eclipsten bak�n�z
		
		
		
		//10) Overloading nedir. 
		//						Method ismi ayn� tutularak parametrelerin say�lar� yerleri veya data type leri de�i�tirilerek
		//						methodlar olu�turmad�r. Overloading Compile time dir. yani overloading de yapt���m�z hata code yazarken
		//						belli olur. ayn� isme sahip methodlarla farkl� i�lemler yapabilmek i�in. mesela substring(4,7)
		//						methodlar�n�n fonksiyonlar� eses�nda ayn�d�r. . ikisi de bir stringin belli bir b�l�m�n� almaya
		//						yarar. fakat baz� durumlarda biti� endexini s�ylemek gerekir baz� durumlarda gerekmez. 
		//						bunun i�in parametreleri fakl�la�t�r�r�z. bu da overloading i do�ururu. 
		
		
		//11)  Overriding nedir?
		//              Method Signature'a(Method ismi + Parametreler) dokunmuyoruz, sadece body'i
		//              degistiriyoruz. Overriding inheritance olunca olur.
		//              Ayni method'un farkli kullanimlari icin overriding gereklidir.
		//              Animal da ses(){Ses cikarir} ==> Dog(){Havlama} ==> Kedi(){Miyavlama}
		//              Overriding Run Time Error verir.

		
		//12 Array ile ArrayList aras�nda farklar nelerdir. 
		//			Array olu�turulurken uzunlu�u belli edilmek zorundad�r. ve daha sonra uzunluk de�istirilemez fakat Arraylist lerde 
		//          ba�lang�zta uzunlu�u belirte zorunlulu�umuz yok eleman ekledik�e uzunluk artar. eleman sildik�e uzunluk azal�r. 
		//			
		
		
		//13) String ile StringBuilder aras�ndaki fark nedir. 
		//							Stringler immutable dir stringBuilder ise mutable dir.
		// 							stringBuilde class daha fazla kkullan��l� methodlara sahiptir
		// 						mesela tersten yazd�rmak i�in kullan�lan reverse() methodu gibi.
		
		//14) 
		
		
		
		
	}

}
