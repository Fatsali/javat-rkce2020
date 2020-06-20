package day27constructorcagirma;

public class Mammel extends Animal {
	 
	public boolean doðum=true;
	
	public static void main(String[] args) {
		//Mammel mammel=new Mammel();
		Mammel mammel01=new Mammel(15);
	}
	public void feed() {
		System.out.println("Çocuklarýný besler");
	}
	
	Mammel(){
		this(11);// parent daki parametresiz constructor i çaðýr
		// super() keyword kullanmasanýz da olur ama bazýlarý kullanýr þaþýrmayýn
		// super() kullanýlacaksa mutlaka ilk satýrda olmalý
		// super() ve this() ayný constructor in içinde ayný anda kullanýlmaz
		System.out.println("Mammel parametresiz constructor");
	}
	 Mammel(int age) {
		super();
		System.out.println("Mammel parametreli constructor");
	}
	

}
