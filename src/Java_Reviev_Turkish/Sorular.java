package Java_Reviev_Turkish;

import java.util.Scanner;

public class Sorular {

	public static void main(String[] args) {
		System.out.println("Fatih Akyazi");
		
		String isim="Fatih";
		String soyisim="Akyazi";
		String bosluk=" ";
		
		System.out.println(isim+bosluk+soyisim);
		int unlem='!';
		System.out.println("ünlem "+unlem);
		int yüzde='%';
		System.out.println("yüzde "+yüzde);
		int yildiz='*';
		System.out.println("yildiz "+yildiz);
		int dolar='$';
		System.out.println("dolar "+dolar);
		int et='@';
		System.out.println("et "+et);
		int ve='&';
		System.out.println("ve "+ve);
		
		System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        long maxValue=Long.MAX_VALUE;
        System.out.println(maxValue);
        long minValue=Long.MIN_VALUE;
        System.out.println(minValue);
        
        //Kullanicidan iki farkli kelime yazsin - (String) olarak
      //Program  bu kelimeleri beraberce ekrana yazdirsin ve sonuna unlem isareti eklesin.
      /* NOT ; ---> String'leri kullanicidan almak icin ya next() veya nextLine()
      kullaniriz. next() tek kelimelik String'ler icin kullanilir.
      Space gorunce String'i almayi birakir.
      nextLine() girilen tum String'i almak icin kullanilir.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String str1=scan.nextLine();
        System.out.println("Lütfen bir kelime daha giriniz");
        String str2=scan.nextLine();
       System.out.println(str1+" "+str2+"!");
        
        scan.close();
        
        /*
        Kullanici  iki sayi girsin 
        Program girilen sayilarin karesini ayri ayri ekrana yazdirsin //
        Ayri olarak; Program girilen sayilari ayri ayri 5 ile carpimini
        ve sonucunu ekrana yazdirsin. //
        Ayri olarak; Program girilen sayilara ayri ayri 12 eklesin //
        Ayri olarak; Program girilen sayilardan ayri ayri 5 cikarsin //
      */
        
      
        
	}

}
