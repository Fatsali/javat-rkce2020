package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		String str="Ali Can okula basladi, nas�l oldu? �yi oldu ama zor.";
		
	//split Methodu kulland���n�zda mutlaka bir array olu�turmal�s�n�z	
	String kelime[]=str.split(" ");
	
		
		
	System.out.println(Arrays.toString(kelime));
	System.out.println("Kelime sayisi: "+kelime.length);
	
	String str2="Kahramanmarasl�lar iyi mi?";
	String harf[]=str2.split("");
	
	System.out.println(Arrays.toString(harf));
	System.out.println("Harf sayisi: "+harf.length);
	
	
	
	
	
	
	}

}
