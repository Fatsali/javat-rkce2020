package day32abstraction;

public class TekKisilikOda extends Otel {

	public static void main(String[] args) {
		TekKisilikOda musteri1=new TekKisilikOda();
		musteri1.kahvalt�();
		System.out.println("Tv Ucreti: "+musteri1.tv(5));
		System.out.println("Wifi Ucreti: "+musteri1.wifi(1));
	}

	@Override
	public void kahvalt�() {
		System.out.println("Kahvalt�n�z sandvictir");
		
	}
	public int tv(int saat) {
		return saat*2;
	}
}
