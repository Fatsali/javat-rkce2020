package day29polymorphismexception;

public class Polymorphism01 {

	public static void main(String[] args) {
		// Polymorphism ==>�oklu yap�
		//Oveerloading ve Overriding ile bir method polymorphism haline gelir
		// Polymorphism i Overloadin ile yaparsan�z "Compile time Polymorphism "denir
		//diger ad� static polymorphism dir. 
		//Polymorphism i overriding ile yaparsan�z "Run Time Polymorphism" denir . di�er ad� dinamic polymorphism dir
	}

	public void eat() {
		System.out.println("Ye!");
	}
	//Overloading ile polymorphism
	public void eat(String name) {
		System.out.println(name+"Ye!");
	}
	class Yeni{
		//Overloading ile polymorphism
		public void eat() {
			System.out.println("L�tfen ye!");
		}
	}
}
