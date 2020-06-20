package day26encapsulation;

public class Inheritance01 {

	public static void main(String[] args) {
		// Inheritance (miras): iki class arasýnda Parent-Child iliþkisi varsa Inheritance dan bahsedilebilir. 
		
		// ýnheritance kurallarý
		// 1) inheritance public ve proteted datalar için problemsiz çalýsýr
		//2) ýnheritance default datalar için child ile parant ayný package de ise çalýþýr
		// 3// ýnheritance private datalar için çalýþmaz
		
		// child ve parent iliþkisi nasýl kurulur?
		//class olustururken 
		
		Encapsulation01 obj1=new Encapsulation01();
		System.out.println(obj1.getKimlikNo());
	}

}
