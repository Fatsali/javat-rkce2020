package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		String str="Ali Can okula basladi, nasıl oldu? İyi oldu ama zor.";
		
	//split Methodu kullandığınızda mutlaka bir array oluşturmalısınız	
	String kelime[]=str.split(" ");
	
		
		
	System.out.println(Arrays.toString(kelime));
	System.out.println("Kelime sayisi: "+kelime.length);
	
	String str2="Kahramanmaraslılar iyi mi?";
	String harf[]=str2.split("");
	
	System.out.println(Arrays.toString(harf));
	System.out.println("Harf sayisi: "+harf.length);
	
	
	
	
	
	
	}

}
