package day12scopewhileloop;

public class ScapeKurallari {
	int num;//Class variable veya Instance variable
	public static void main(String[] args) {
		// Scope kapsam denir. olu�turdu�unuz bir variable'i nerelerde kullanabilece�iniz 
		//g�sterir. 
	}
	public void toplama() {
		int num1=12;
		System.out.println("Toplama");
	}
	public void carpma() {
		System.out.println("�arpma");
	}
}

//1.Kural:Class �n i�inde methodlar�n d���nda olan variable leri b�t�n methodlar istedikleri zaman
//istedikleri kadar kullanabilirler.
//bu variable lere Class Variable veya Instance Variable denir.
//Clas variable lere de�er atamas� yapmazsak java onlara defualt de�erler verir(java kafas�na g�re de�erler verir)
//java t�m say�lar i�in default olarak 0 de�erini verir.

//2.Kural:bir methodun bady si i�inde olu�turulan variable ler sadece o methodun i�inde kullan�labilir 
//O Methodun d���ndaki methodlar o variable yi kullanamazlar.
//methodun i�inde olu�turulan bu variablelere "Local Variable" denir. body i�inde olu�turulan 
//variablelere de�er atamak zorunday�z.java onlara derault value vermez.

//3.Kural: methodlar�n parantezleri i�inde olu�turulan variableler local variableler gibi sadece o methodlar�n 
//bodyleri i�inde kullan�labilir. bu variablelere de local variable denir.parantez i�inde olu�turulan
//Variablelere ise de�er atamas� yapmay�n�z

//4.Kural:Bir variableyi kullanmaya ba�lamadan �nce tan�mlamal�y�z. 
//once num=num+2 sonra int num=12; diyemeyiz.
//�nce int num=12; sonra num=num+2


