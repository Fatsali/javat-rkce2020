package day28overriding;

public class Mammel extends Animal {
	
	public boolean birth=true;
	public String name="Kedi";
	
	public static void main(String[] args) {
		Mammel mammel=new Mammel();
		
	}

	public void feed() {
		System.out.println("Yavrularýný besler");
	
	}
	
	public Mammel() {
		//this icinde bulundugunuz class'daki variable ve methodlara ulasmanizi saglar
				System.out.println(this.birth);//true
				this.feed();//Yavrularini besler
				
				//Child-Parent iliskisi varsa this kullanarak parent/grandparent class'daki 
				//variable ve method'lara da ulasabilirsiniz.
				//Ama parent class'lardaki variable ve methodlara ulasmak icin this kullanmayin
				//cunku child ve parent'daki ayni isimli variable ve methodlarda problem yasayabilirsiniz.
				//Genel kullanimda this class icindekiler icin, super parent'dakiler icin kullanilir,
				//farklilik yapip insanlari sasirtmayin.
				System.out.println(this.age);//4
				System.out.println(this.name);//Karabas
				this.move();//Hayvanlar hareket eder
				System.out.println(this.name);//Kedi
				
				//Parantezsiz super parent/grandparent'lardaki variable ve methodlara ulasmanizi saglar
				//Parent'dakilere super kullanarak ulasmak daha guvenlidir.
				System.out.println(super.age);//4
				System.out.println(super.name);//Karabas
				super.move();//Hayvanlar hareket eder

	}
}
	

