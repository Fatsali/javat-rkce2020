package day26encapsulation;

public class Cat extends Mammel{
	
	public boolean clean=true;

	public static void main(String[] args) {
		Cat cat=new Cat();
		
		System.out.println("Animal Class'dan geldi: " +cat.ege);
		System.out.println("Animal Class'dan geldi: " +cat.name);
		cat.eat();
		cat.move();
		
		System.out.println(cat.doðum);
		cat.feed();
		System.out.println(cat.clean);
		cat.meow();

	}
public void meow() {
	System.out.println("Kediler miyavlar");
}
}
