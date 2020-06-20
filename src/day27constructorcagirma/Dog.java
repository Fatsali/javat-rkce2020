package day27constructorcagirma;

public class Dog extends Mammel {
	
	public boolean sadýk=true;

	public static void main(String[] args) {
		
		Dog dog=new Dog();

	}

	public void bark() {
		System.out.println("Köpekler havlar");
	}
	
	Dog(){
		super();// isteðe baðlý koysanýz da olur koymasanýz da
		// this() ayný class daki 12
		
		System.out.println("Dog parametresiz constructor");
	}
	
	
	
}
