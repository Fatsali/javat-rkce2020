package Java_Reviev_Turkish;

import java.util.Random;

public class Day02 {

	public static void main(String[] args) {
		// verilen iki say�n�n yerlerini de�i�tiriniz    
        int num1 = 11; // ==>33
        int num2 = 33;// ==>11
        
        System.out.println("---De�i�iklik �ncesi---");
        System.out.println("1. Say�= "+num1);
        System.out.println("2. Say�= "+ num2);
        
        //ilk �nce 1. say� de�erini temp(Ge�ici de�er) i�erisine at�yoruz
        int temp =num1;
        
        //2. say� de�erini 1. say�'ya at�yoruz
        num1= num2;
        
        // ve son olarak temp i�indeki de�eri 2. say�ya e�itliyoruz
        num2= temp;
        
        System.out.println("---De�i�iklik sonras�---");
        System.out.println("1. Say�= "+num1);
        System.out.println("2. Say�= "+num2);
        

		///*** interview question***
	       // Verilen iki de�eri ���nc� bir de�er kullanmadan yerlerini de�i�tiriniz
	      // int  x = 50; //=>10
	     //  int  y  = 10; //=>50	
		
		int x =50;
		int y=10;

        System.out.println("---De�i�iklik �ncesi---");
        System.out.println("1. Say�= "+x);
        System.out.println("2. Say�= "+ y);
		x=y+x;
		y=x-y;
		x=x-y;
		System.out.println("---De�i�iklik sonras�---");
        System.out.println("1. Say�= "+x);
        System.out.println("2. Say�= "+y);
		
		
        //0 ile 1000 aras�nda random bir say� olu�turarak 
        //bu say�n�n rakamlar� toplam�n� veren java
        //algoritma kodunu yaz�n�z ?	
        //random sayi= 185  toplamlar� = 14
        
        int randomSayi=(int)(Math.random()*1000);
        System.out.println("Random sayi="+randomSayi);
        // 0 ile 1000 aras� say�
       // int randomSayi=(int)(Math.random()*10)+10;//10 ile 20 aras� de�erler
      //  Random random=new Random();
      //  int randomSayi=random.nextInt(1000);
        
        int sonsayi=randomSayi%10;
        int ilksayi=randomSayi/100;
        int ortasayi=randomSayi/10%10;
        
        System.out.println("Toplamlar�="+(sonsayi+ilksayi+ortasayi));
	}

}
