package day25stringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		// StringBuilder class � stringleri uretmeye ve uretilen stringleri manipule etmeye yarar
		// String class i kullanarak string �retti�iniz yapt���n�z de�i�iklikler ilk �retti�iniz
		//Stringi etkilemez. Ama illa ki ilk �retti�im String de�i�sin isterseniz atama yapmak zorundas�n�z. 
		//str=str.substring(1);
		//String class i kullanarak  �retti�iniz Stringler atamas�z de�i�tirilemedi�i i�in String Class �na 
		//"immutable" denir.
		
		
		String str="Ali";
		str.substring(1);//==> value su li olan bir object olu�turulur. str hala Ali olarak kal�r. 
		System.out.println(str);
		
		// StringBuilder class i kullanarak string �retti�iniz yapt���n�z de�i�iklikler ilk �retti�iniz
		//Stringi etkiler. atama yapmaya gerek yoktur. 
		
		//1. Yol
		StringBuilder strBld1=new StringBuilder("Ayse");
		strBld1.append("Can");//append() methodu String'e yeni bir String eklemek i�in kullan�l�r.
							//concatenation yapar.
		System.out.println(strBld1);//==>
		
		//2.yok
		StringBuilder strBld2=new StringBuilder();// bo� bir String �retir ==>""
		strBld2.append("Ali Can");// bo� bir stringe "Ali Can " ekledim
		
		//3.yok
		StringBuilder strBld3=new StringBuilder(7);//Uzulu�u 7 character olan bir String urettim.
		
		//Olu�tudu�u String in uzunlu�u belirledikten sonra o uzunluktan az veya �ok Stringler 
		// ekleyebilirsiniz. StringBuilder problem ��karmaz. 
		
		strBld3.append("Ali");
		strBld3.append("Kahraman");
		
	}

}
