package day11StringMethod;

public class ForLoop02 {

	public static void main(String[] args) {
		// 100 den k���k 3 �n kat� olan sayma say�lar�n� ekrana yan yana yazd�ran for loop olu�turunu
		for(int i=3;i<100;i=i+3) {
			System.out.print(i+" ");
		}
	System.out.println();
		//ilk 5 sayma say�n�n� toplam�n veran progma� for loop ile yaz�n�z
	//1,2,3,4,5
	//1+2=3==>3+3=6==>6+4=10==>10+5=15
	int sum=0;	
	for(int i=1;i<6;i++) {
		sum=sum+i;
		}
	System.out.println("Toplam: "+sum);// sadece en son ad�m� ekranda g�rmek isterseniz 
	//yazd�rma i�lemini o loop un d���nda yap�n�z.
	System.out.println();
	
	// 10 dan b�y�k ilk 3 sayma say�s�n�n toplam�n� veren vor loop yaz�n�z
	int sum2=0;
	for(int i=11;i<14;i++){
		sum2=sum2+i;
	}
	System.out.println("Toplam1: "+sum2);
	
	//20 den b�y�k ilk 5 sayma say�s�n�n toplam�
	int sum3=0;
	for(int i=21;i<26;i++) {
		sum3=sum3+i;
	}
	System.out.println("Toplam3: "+sum3);
	
	//ilk 50 sayma say�s�n�n toplam�n� veren for loop ol
	
	int sum4=0;
	for(int i=1;i<51;i++) {
		sum4=sum4+i;
	}
	System.out.println("Toplam4: "+sum4);
	
	//5 ile b�l�nebilen 100 den k���k sayma say�lar�n�n toplam�n�
	int sum5=0;
	for(int i=5;i<100;i+=5) {
		sum5=sum5+i;
	}
	System.out.println("Toplam4: "+sum5);
	
	}


}
