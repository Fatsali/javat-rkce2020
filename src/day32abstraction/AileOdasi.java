package day32abstraction;

public class AileOdasi extends Otel {

	public static void main(String[] args) {
		AileOdasi musteri2=new AileOdasi();	
		musteri2.kahvalt�();
		System.out.println("Wifi Ucreti: "+musteri2.wifi(6));
	}

	@Override
	public void kahvalt�() {
		System.out.println("Kahvalt�n�z kafeteryada olacakt�r");	
	}

}
