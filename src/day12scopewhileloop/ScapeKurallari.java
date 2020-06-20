package day12scopewhileloop;

public class ScapeKurallari {
	int num;//Class variable veya Instance variable
	public static void main(String[] args) {
		// Scope kapsam denir. oluþturduðunuz bir variable'i nerelerde kullanabileceðiniz 
		//gösterir. 
	}
	public void toplama() {
		int num1=12;
		System.out.println("Toplama");
	}
	public void carpma() {
		System.out.println("Çarpma");
	}
}

//1.Kural:Class ýn içinde methodlarýn dýþýnda olan variable leri bütün methodlar istedikleri zaman
//istedikleri kadar kullanabilirler.
//bu variable lere Class Variable veya Instance Variable denir.
//Clas variable lere deðer atamasý yapmazsak java onlara defualt deðerler verir(java kafasýna göre deðerler verir)
//java tüm sayýlar için default olarak 0 deðerini verir.

//2.Kural:bir methodun bady si içinde oluþturulan variable ler sadece o methodun içinde kullanýlabilir 
//O Methodun dýþýndaki methodlar o variable yi kullanamazlar.
//methodun içinde oluþturulan bu variablelere "Local Variable" denir. body içinde oluþturulan 
//variablelere deðer atamak zorundayýz.java onlara derault value vermez.

//3.Kural: methodlarýn parantezleri içinde oluþturulan variableler local variableler gibi sadece o methodlarýn 
//bodyleri içinde kullanýlabilir. bu variablelere de local variable denir.parantez içinde oluþturulan
//Variablelere ise deðer atamasý yapmayýnýz

//4.Kural:Bir variableyi kullanmaya baþlamadan önce tanýmlamalýyýz. 
//once num=num+2 sonra int num=12; diyemeyiz.
//önce int num=12; sonra num=num+2


