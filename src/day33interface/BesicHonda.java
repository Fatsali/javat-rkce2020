package day33interface;

public class BesicHonda extends Araba implements IcAraba,DisAraba {

	public static void main(String[] args) {
		BesicHonda BesicHonda=new BesicHonda();
		BesicHonda.kapý();
		BesicHonda.direksiyon();
		BesicHonda.diesel();
		BesicHonda.klima();
		BesicHonda.move();
		BesicHonda.koltuk();
	}

	@Override
	public void kapý() {
		System.out.println("Manuel kapý");
	}

	@Override
	public void direksiyon() {
		System.out.println("Suni deri direksiyon");	
	}

	@Override
	public void koltuk() {
		System.out.println("Kumaþ koltuk");
		
	}

	@Override
	public void klima() {
		System.out.println("Manuel klima");
		
	}

	@Override
	public void move() {
		System.out.println("10 saniyede 100 km'lik hýza ulaþýr");
		
	}

}
