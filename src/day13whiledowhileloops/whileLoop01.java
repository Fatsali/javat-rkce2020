package day13whiledowhileloops;

public class whileLoop01 {

	public static void main(String[] args) {
		// while loop kullanarak ilk 5 sayma sayýsýnýn toplamýný ekrana yazdýran 
		//programý yazýnýz
		int num=1;
		int sum=0;
		while(num<6) {
			
		sum=sum+num;
		num++;
	System.out.println(sum);
		}
		System.out.println(" "+sum);
		//en son toplamý görmek için System.out.println(); ifadesini loop dýsýna yazýn
		//her adýmdaki toplamý görmek için System.out.println(); ifadesini loop un içine yazýnýz
		
	}

}
