package day29polymorphismexception;

public class Polymorphism01 {

	public static void main(String[] args) {
		// Polymorphism ==>çoklu yapý
		//Oveerloading ve Overriding ile bir method polymorphism haline gelir
		// Polymorphism i Overloadin ile yaparsanýz "Compile time Polymorphism "denir
		//diger adý static polymorphism dir. 
		//Polymorphism i overriding ile yaparsanýz "Run Time Polymorphism" denir . diðer adý dinamic polymorphism dir
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
			System.out.println("Lütfen ye!");
		}
	}
}
