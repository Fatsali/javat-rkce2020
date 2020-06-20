package Java_Reviev_Turkish;

import java.util.Scanner;

public class Day021 {

	public static void main(String[] args) {
		 /* 
        scanner kullanarak aþaðýdaki sorulara cevaplar isteyiniz
        1.Adým: 3 adet String tanýmlayýnýz. ad, soyad, rapor
        2.Adým: 2 adet integer tanýmlayýnýz  doðum yýlý, þimdiki yýl
        3.Adým: Kullanýcýdan; "Lütfen adýnýzý ve soy adýnýzý giriniz:" isteyin
                 Harun
                 Ekinci
        4.Adým: Kullanýcýdan;"Lütfen doðum yýlýnýzý ve þimdiki yýlý giriniz:" isteyin
                 1983
                 2020        
        5.Adým Raporu aþaðýdaki gibi yazdýrýnýz      
                "Adýnýz: Harun, Soy adýnýz: Ekinci, Yaþýnýz: 37"
        6. Adým: Yaþýnýz,Adýnýzýn ilk harfi, soyadýnýzýn ilk ve son harfi, isim ve soyisim karakter uzunluklarýný içeren bir þifre oluþturunuz
           //Þifre= 37HEi56        
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen adýnýzý giriniz");
        String ad=scan.nextLine();
        ad=ad.toUpperCase();
        System.out.println("Lütfen soyadýnýzý giriniz");
        String soyad=scan.nextLine();
        soyad=soyad.toUpperCase();
        System.out.println("Doðum yýlýnýzý giriniz");
        int dogumyili=scan.nextInt();
        System.out.println("Lütfen þimdiki yýlý giriniz");
        int simdikiyil=scan.nextInt();
        int yas=simdikiyil-dogumyili;
        
        System.out.println(("Adýnýz="+ad)+("Soyadýnýz="+soyad)+"Yaþýnýz="+yas);
       

       String sifre=yas+ad.substring(0,1)+soyad.charAt(0)
        +soyad.charAt(soyad.length()-1)+ad.length()+soyad.length();
        System.out.println("Þifreniz: "+sifre);

        String str="Harun";
        System.out.println(str.substring(4));

        
        
        
        
        
        
        
        
        

	}

}
