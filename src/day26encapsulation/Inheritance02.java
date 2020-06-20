package day26encapsulation;


// ýnheritance 01 inheritance02 nin parenti olacak
//"extends" den sonraki parent önceki child olur

public class Inheritance02 extends Inheritance01 {

	public static void main(String[] args) {
		// Child in birden fazla parenti olur mu?
		//cevap :olmaz java "multiple inheritance"i desteklemez. 
		//java "single inheritance i destekler"

		//parenten birden fazla childi olur mu
		//cevap: olur hiyerarþik inheritance denir. 
		
		//child [a,b]-->parent[c,d,e]--> grandParent[f,g]
		//child nelere sahib a,b,c,d,e,f,g
		//parent nelere sahib c,d,e,f,g
		//grandParent nelere sahib f,g
	}

}
