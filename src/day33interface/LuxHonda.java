package day33interface;

public class LuxHonda extends Araba implements IcAraba,DisAraba {

	public static void main(String[] args) {
		LuxHonda LuxHonda=new LuxHonda();
		LuxHonda.benzin();
		LuxHonda.direksiyon();
		LuxHonda.kap�();
		LuxHonda.klima();
		LuxHonda.koltuk();
		LuxHonda.move();
		System.out.println("�� Araba interface'inden: "+IcAraba.price);
		System.out.println("D�s Araba interface'inden: "+DisAraba.price);
		System.out.println(old);
		LuxHonda.doseme();
	}

	@Override
	public void move() {
		System.out.println("3 saniyede 100km lik h�za ula��r");
		
	}

	@Override
	public void kap�() {
		System.out.println("Parmak izli ayarl� kapi");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Gercek deri direksiyon");
		
	}

	@Override
	public void koltuk() {
		System.out.println("Is�tmal� deri koltuk");
		
	}

	@Override
	public void klima() {
		System.out.println("Digital klima");
		
	}

}
