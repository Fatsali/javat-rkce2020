package day27constructorcagirma;

public class Mammel extends Animal {
	 
	public boolean do�um=true;
	
	public static void main(String[] args) {
		//Mammel mammel=new Mammel();
		Mammel mammel01=new Mammel(15);
	}
	public void feed() {
		System.out.println("�ocuklar�n� besler");
	}
	
	Mammel(){
		this(11);// parent daki parametresiz constructor i �a��r
		// super() keyword kullanmasan�z da olur ama baz�lar� kullan�r �a��rmay�n
		// super() kullan�lacaksa mutlaka ilk sat�rda olmal�
		// super() ve this() ayn� constructor in i�inde ayn� anda kullan�lmaz
		System.out.println("Mammel parametresiz constructor");
	}
	 Mammel(int age) {
		super();
		System.out.println("Mammel parametreli constructor");
	}
	

}
