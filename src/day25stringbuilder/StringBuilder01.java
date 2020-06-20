package day25stringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		// StringBuilder class ý stringleri uretmeye ve uretilen stringleri manipule etmeye yarar
		// String class i kullanarak string ürettiðiniz yaptýðýnýz deðiþiklikler ilk ürettiðiniz
		//Stringi etkilemez. Ama illa ki ilk ürettiðim String deðiþsin isterseniz atama yapmak zorundasýnýz. 
		//str=str.substring(1);
		//String class i kullanarak  ürettiðiniz Stringler atamasýz deðiþtirilemediði için String Class ýna 
		//"immutable" denir.
		
		
		String str="Ali";
		str.substring(1);//==> value su li olan bir object oluþturulur. str hala Ali olarak kalýr. 
		System.out.println(str);
		
		// StringBuilder class i kullanarak string ürettiðiniz yaptýðýnýz deðiþiklikler ilk ürettiðiniz
		//Stringi etkiler. atama yapmaya gerek yoktur. 
		
		//1. Yol
		StringBuilder strBld1=new StringBuilder("Ayse");
		strBld1.append("Can");//append() methodu String'e yeni bir String eklemek için kullanýlýr.
							//concatenation yapar.
		System.out.println(strBld1);//==>
		
		//2.yok
		StringBuilder strBld2=new StringBuilder();// boþ bir String üretir ==>""
		strBld2.append("Ali Can");// boþ bir stringe "Ali Can " ekledim
		
		//3.yok
		StringBuilder strBld3=new StringBuilder(7);//Uzuluðu 7 character olan bir String urettim.
		
		//Oluþtuduðu String in uzunluðu belirledikten sonra o uzunluktan az veya çok Stringler 
		// ekleyebilirsiniz. StringBuilder problem çýkarmaz. 
		
		strBld3.append("Ali");
		strBld3.append("Kahraman");
		
	}

}
