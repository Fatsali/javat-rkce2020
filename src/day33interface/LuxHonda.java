package day33interface;

public class LuxHonda extends Araba implements IcAraba,DisAraba {

	public static void main(String[] args) {
		LuxHonda LuxHonda=new LuxHonda();
		LuxHonda.benzin();
		LuxHonda.direksiyon();
		LuxHonda.kapý();
		LuxHonda.klima();
		LuxHonda.koltuk();
		LuxHonda.move();
		System.out.println("Ýç Araba interface'inden: "+IcAraba.price);
		System.out.println("Dýs Araba interface'inden: "+DisAraba.price);
		System.out.println(old);
		LuxHonda.doseme();
	}

	@Override
	public void move() {
		System.out.println("3 saniyede 100km lik hýza ulaþýr");
		
	}

	@Override
	public void kapý() {
		System.out.println("Parmak izli ayarlý kapi");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Gercek deri direksiyon");
		
	}

	@Override
	public void koltuk() {
		System.out.println("Isýtmalý deri koltuk");
		
	}

	@Override
	public void klima() {
		System.out.println("Digital klima");
		
	}

}
