package day32abstraction;

public class KralOdasi extends Otel {

	public static void main(String[] args) {
		KralOdasi musteri3=new KralOdasi();
		musteri3.kahvaltý();
		System.out.println("Ýnternational Tv Ücreti: "+musteri3.tv("international", 12));
		System.out.println("Wifi Ucreti: "+musteri3.wifi(11));
	}

	@Override
	public void kahvaltý() {
		System.out.println("Kahvaltýnýz teras kat kral restaurantýdýr");
		
	}

	public int tv(String international,int saat) {
		if(international.equals("international")){
			return saat*5;	
	}else {
		return 0;
	}
	}
}
