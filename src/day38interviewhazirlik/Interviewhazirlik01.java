package day38interviewhazirlik;

public class Interviewhazirlik01 {

	public static void main(String[] args) {
		// 1) java "Platform Independent" programlama dilidir. 
		//Yani; herhangi bir platformda yazýlan java kodu diðer platformlarda da çalýþýr. 
		
		//2) IDE ==> Integrated Development Environment demektir.Eclipse ve Intellij piyasada kullanýlan meþhur iki IDE dir. 
		//
		
		//3) Constructor==> Yeni bir obje üretilirken Constructor aktive olur ve objeyi üretir. 
		//return type yoktur. ismi class ismiyle ayný olmalýdýr. obje üretmek için Constructor üretmek zorunda deðiliz . çünkü java
		//her class için defult bir constructor üretmiþtir. Default Constructorlar parametresizdir. bir herhangi bir constructor 
		//ürettiðimizde default constructorlar yok olur. constructorlar overload edilebilirlr. 
		//Constructor'lar child classlardan çaðrýlabilirler ama override edilemezler. 
		
		//4)OOP Concept nedir? 
		//           OOP concept a)Inheritance b)Encapsulation c)Polymorhism d) Abstarction e) Interface içerir.
		
		
		//5)Inheritance nedir?
		//           ýnheritance parent(super class)-child(sub class) iliþkisidir. 
		//  		A class ý B class ýna extend ederse A child olur B parent olur. 
		//         A interface i B Ýnterface ine implements ederse A child olur B parent olur
		//		  A interface i B Ýnterface ine  extends ederse		A child olur B parent olur
		//			Child parent tadi kodlarýn public ve proteted olanlarýný kullanabilir. 
		//       Reusability (tekrar kullanabilme), sort coding(kodu kýsa yazma), maintenance(tamir) faydalarý vardýr.
		
		//6) Encapsulation nedir?
		//                    Data hiding (Data gizleme) demektir. Datalar private yapýlarak gizlenir. gizlenen datalar getter ile okunur
		//					setter() ile update edilir. 
		//					deðiþtirilmesini istemediðimiz kodlarý koruma altýna almak için kullanýlýr. maintenance faydasý da vardýr. 
		//					kodun hiç deðiþtirilmesini istemiyorsanýz sadece okunmasýný isteiyorsnýz o zaman setter oluþturmazsýnýz
		//                  kodun ne deðiþtirilmesini ne de okunmasýný istiyorsanýz o zaman ne getter ne de setter oluþturmazsýnýz. 
		
		//7) Polymorphis nedir?
		//                    Polymorphism (Çoklu yapý) overkoading ve overriding dir
		
		//8) Abstract Class nedir. 
		//						Abstract class üretmek için abstract keywort kullanmalýyýz
		//						abstract class lardan object üretilemez. (Ýnstantiante yapýlamaz)
		//						abstract class larda hem abstract hem de concrete methodlar bulunabilir. 
		//						Abstract method un olduðu class kesinlikle abstract olmalýdýr. 
		//						abstract methodlarýn (body'siz ) concrete child'lar tarafýndan override edilme zorunluluðu vardýr. 
		//						Concrete'ler override edimese de olur. 
		//	Mutlaka söyle===>	Abstract class i child class larý bazý görevleri yapmak zorunda býrakmak için oluþtururuz. 
		
		//9) Interface nedir. 
		//					java normalde multiple inheritance'a müsade etmez bu yüzden Abstract class kullandýðýnýzda multiple 
		//				inheritance yapamayýz. fakat bazý projelerde muttiple inheritance kullanmak zorunda kalýrýz.
		//            bunu java bize interface kullanma hakký vererek halletmiþtir. cünkü interfacelere mutiple implements //extends
		//           yapýlabilir. Detaylarý eclipsten bakýnýz
		
		
		
		//10) Overloading nedir. 
		//						Method ismi ayný tutularak parametrelerin sayýlarý yerleri veya data type leri deðiþtirilerek
		//						methodlar oluþturmadýr. Overloading Compile time dir. yani overloading de yaptýðýmýz hata code yazarken
		//						belli olur. ayný isme sahip methodlarla farklý iþlemler yapabilmek için. mesela substring(4,7)
		//						methodlarýnýn fonksiyonlarý esesýnda aynýdýr. . ikisi de bir stringin belli bir bölümünü almaya
		//						yarar. fakat bazý durumlarda bitiþ endexini söylemek gerekir bazý durumlarda gerekmez. 
		//						bunun için parametreleri faklýlaþtýrýrýz. bu da overloading i doðururu. 
		
		
		//11)  Overriding nedir?
		//              Method Signature'a(Method ismi + Parametreler) dokunmuyoruz, sadece body'i
		//              degistiriyoruz. Overriding inheritance olunca olur.
		//              Ayni method'un farkli kullanimlari icin overriding gereklidir.
		//              Animal da ses(){Ses cikarir} ==> Dog(){Havlama} ==> Kedi(){Miyavlama}
		//              Overriding Run Time Error verir.

		
		//12 Array ile ArrayList arasýnda farklar nelerdir. 
		//			Array oluþturulurken uzunluðu belli edilmek zorundadýr. ve daha sonra uzunluk deðistirilemez fakat Arraylist lerde 
		//          baþlangýzta uzunluðu belirte zorunluluðumuz yok eleman ekledikçe uzunluk artar. eleman sildikçe uzunluk azalýr. 
		//			
		
		
		//13) String ile StringBuilder arasýndaki fark nedir. 
		//							Stringler immutable dir stringBuilder ise mutable dir.
		// 							stringBuilde class daha fazla kkullanýþlý methodlara sahiptir
		// 						mesela tersten yazdýrmak için kullanýlan reverse() methodu gibi.
		
		//14) 
		
		
		
		
	}

}
