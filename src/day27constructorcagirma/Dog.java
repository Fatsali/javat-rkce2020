package day27constructorcagirma;

public class Dog extends Mammel {
	
	public boolean sad�k=true;

	public static void main(String[] args) {
		
		Dog dog=new Dog();

	}

	public void bark() {
		System.out.println("K�pekler havlar");
	}
	
	Dog(){
		super();// iste�e ba�l� koysan�z da olur koymasan�z da
		// this() ayn� class daki 12
		
		System.out.println("Dog parametresiz constructor");
	}
	
	
	
}
