package day26encapsulation;

public class Inheritance01 {

	public static void main(String[] args) {
		// Inheritance (miras): iki class aras�nda Parent-Child ili�kisi varsa Inheritance dan bahsedilebilir. 
		
		// �nheritance kurallar�
		// 1) inheritance public ve proteted datalar i�in problemsiz �al�s�r
		//2) �nheritance default datalar i�in child ile parant ayn� package de ise �al���r
		// 3// �nheritance private datalar i�in �al��maz
		
		// child ve parent ili�kisi nas�l kurulur?
		//class olustururken 
		
		Encapsulation01 obj1=new Encapsulation01();
		System.out.println(obj1.getKimlikNo());
	}

}
