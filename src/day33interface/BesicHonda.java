package day33interface;

public class BesicHonda extends Araba implements IcAraba,DisAraba {

	public static void main(String[] args) {
		BesicHonda BesicHonda=new BesicHonda();
		BesicHonda.kap�();
		BesicHonda.direksiyon();
		BesicHonda.diesel();
		BesicHonda.klima();
		BesicHonda.move();
		BesicHonda.koltuk();
	}

	@Override
	public void kap�() {
		System.out.println("Manuel kap�");
	}

	@Override
	public void direksiyon() {
		System.out.println("Suni deri direksiyon");	
	}

	@Override
	public void koltuk() {
		System.out.println("Kuma� koltuk");
		
	}

	@Override
	public void klima() {
		System.out.println("Manuel klima");
		
	}

	@Override
	public void move() {
		System.out.println("10 saniyede 100 km'lik h�za ula��r");
		
	}

}
