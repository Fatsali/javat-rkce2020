package day24varargsaccessmodifiers;

public class Varargs02 {

	public static void main(String[] args) {
		// Varargs �n yanl�� kullan�mlar�
		
		//Kural 1: Varargs her zaman son parametrede olmal�
		//��nk� ilk parametre yaparsan�z girdi�iniz her de�er varags�n i�ine d��er. siz 
		//asla ikinci parametreye de�er veremezsiniz
		
		valueChar("Character: ",'a');
		valueChar("Character: ",'a','b');
		
		pruduct(1,2,3,4);

	}
	public static void valueChar(String s,char...c) {
	for(char w:c) {
		System.out.print(s);
		System.out.println(w);
	}
}
	
	//Kural 2: parametre olarak birden fazla varargs kullanamazs�n�z. 
	public static void pruduct(int y,int...x) {
		int pruduct=1;
		for(int w:x) {
			pruduct=pruduct*w;
		}
		System.out.println(pruduct);
	}
}
