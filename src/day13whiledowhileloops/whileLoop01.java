package day13whiledowhileloops;

public class whileLoop01 {

	public static void main(String[] args) {
		// while loop kullanarak ilk 5 sayma say�s�n�n toplam�n� ekrana yazd�ran 
		//program� yaz�n�z
		int num=1;
		int sum=0;
		while(num<6) {
			
		sum=sum+num;
		num++;
	System.out.println(sum);
		}
		System.out.println(" "+sum);
		//en son toplam� g�rmek i�in System.out.println(); ifadesini loop d�s�na yaz�n
		//her ad�mdaki toplam� g�rmek i�in System.out.println(); ifadesini loop un i�ine yaz�n�z
		
	}

}
