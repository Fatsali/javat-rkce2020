package day32abstraction;

public class KralOdasi extends Otel {

	public static void main(String[] args) {
		KralOdasi musteri3=new KralOdasi();
		musteri3.kahvalt�();
		System.out.println("�nternational Tv �creti: "+musteri3.tv("international", 12));
		System.out.println("Wifi Ucreti: "+musteri3.wifi(11));
	}

	@Override
	public void kahvalt�() {
		System.out.println("Kahvalt�n�z teras kat kral restaurant�d�r");
		
	}

	public int tv(String international,int saat) {
		if(international.equals("international")){
			return saat*5;	
	}else {
		return 0;
	}
	}
}
