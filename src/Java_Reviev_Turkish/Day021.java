package Java_Reviev_Turkish;

import java.util.Scanner;

public class Day021 {

	public static void main(String[] args) {
		 /* 
        scanner kullanarak a�a��daki sorulara cevaplar isteyiniz
        1.Ad�m: 3 adet String tan�mlay�n�z. ad, soyad, rapor
        2.Ad�m: 2 adet integer tan�mlay�n�z  do�um y�l�, �imdiki y�l
        3.Ad�m: Kullan�c�dan; "L�tfen ad�n�z� ve soy ad�n�z� giriniz:" isteyin
                 Harun
                 Ekinci
        4.Ad�m: Kullan�c�dan;"L�tfen do�um y�l�n�z� ve �imdiki y�l� giriniz:" isteyin
                 1983
                 2020        
        5.Ad�m Raporu a�a��daki gibi yazd�r�n�z      
                "Ad�n�z: Harun, Soy ad�n�z: Ekinci, Ya��n�z: 37"
        6. Ad�m: Ya��n�z,Ad�n�z�n ilk harfi, soyad�n�z�n ilk ve son harfi, isim ve soyisim karakter uzunluklar�n� i�eren bir �ifre olu�turunuz
           //�ifre= 37HEi56        
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("L�tfen ad�n�z� giriniz");
        String ad=scan.nextLine();
        ad=ad.toUpperCase();
        System.out.println("L�tfen soyad�n�z� giriniz");
        String soyad=scan.nextLine();
        soyad=soyad.toUpperCase();
        System.out.println("Do�um y�l�n�z� giriniz");
        int dogumyili=scan.nextInt();
        System.out.println("L�tfen �imdiki y�l� giriniz");
        int simdikiyil=scan.nextInt();
        int yas=simdikiyil-dogumyili;
        
        System.out.println(("Ad�n�z="+ad)+("Soyad�n�z="+soyad)+"Ya��n�z="+yas);
       

       String sifre=yas+ad.substring(0,1)+soyad.charAt(0)
        +soyad.charAt(soyad.length()-1)+ad.length()+soyad.length();
        System.out.println("�ifreniz: "+sifre);

        String str="Harun";
        System.out.println(str.substring(4));

        
        
        
        
        
        
        
        
        

	}

}
