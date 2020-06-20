package day38interviewhazirlik;

public class PassByValuePassByReference {

	public static void main(String[] args) {
		// bir methoda variable yollandýðýnda java o variable in kopyasýný oluþturur ve methoda kopyayý yollar bu yüzden variablenin 
		//orijinal deðeri method calýþtýktan sonra da ayný kalýr. buna Pass By Value denir. 
		
		//Pass by Refernece da ise reference in kopyasý olusturulur ve methoda yollanýr. fakat reference in kopyasý da kendisi gibi ayný
		//objecti gösterdiði için orijinal deðer taþýr. 
		int x=12; 
		System.out.println(increment(x));//13
		System.out.println(x);//12
		
	}
public static int increment(int a) {
	a=a+1;
	return a;
}
}
