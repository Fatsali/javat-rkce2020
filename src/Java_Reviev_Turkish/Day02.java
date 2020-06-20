package Java_Reviev_Turkish;

import java.util.Random;

public class Day02 {

	public static void main(String[] args) {
		// verilen iki sayýnýn yerlerini deðiþtiriniz    
        int num1 = 11; // ==>33
        int num2 = 33;// ==>11
        
        System.out.println("---Deðiþiklik öncesi---");
        System.out.println("1. Sayý= "+num1);
        System.out.println("2. Sayý= "+ num2);
        
        //ilk önce 1. sayý deðerini temp(Geçici deðer) içerisine atýyoruz
        int temp =num1;
        
        //2. sayý deðerini 1. sayý'ya atýyoruz
        num1= num2;
        
        // ve son olarak temp içindeki deðeri 2. sayýya eþitliyoruz
        num2= temp;
        
        System.out.println("---Deðiþiklik sonrasý---");
        System.out.println("1. Sayý= "+num1);
        System.out.println("2. Sayý= "+num2);
        

		///*** interview question***
	       // Verilen iki deðeri üçüncü bir deðer kullanmadan yerlerini deðiþtiriniz
	      // int  x = 50; //=>10
	     //  int  y  = 10; //=>50	
		
		int x =50;
		int y=10;

        System.out.println("---Deðiþiklik öncesi---");
        System.out.println("1. Sayý= "+x);
        System.out.println("2. Sayý= "+ y);
		x=y+x;
		y=x-y;
		x=x-y;
		System.out.println("---Deðiþiklik sonrasý---");
        System.out.println("1. Sayý= "+x);
        System.out.println("2. Sayý= "+y);
		
		
        //0 ile 1000 arasýnda random bir sayý oluþturarak 
        //bu sayýnýn rakamlarý toplamýný veren java
        //algoritma kodunu yazýnýz ?	
        //random sayi= 185  toplamlarý = 14
        
        int randomSayi=(int)(Math.random()*1000);
        System.out.println("Random sayi="+randomSayi);
        // 0 ile 1000 arasý sayý
       // int randomSayi=(int)(Math.random()*10)+10;//10 ile 20 arasý deðerler
      //  Random random=new Random();
      //  int randomSayi=random.nextInt(1000);
        
        int sonsayi=randomSayi%10;
        int ilksayi=randomSayi/100;
        int ortasayi=randomSayi/10%10;
        
        System.out.println("Toplamlarý="+(sonsayi+ilksayi+ortasayi));
	}

}
