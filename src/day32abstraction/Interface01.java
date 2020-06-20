package day32abstraction;

public interface Interface01 {
	
	//interface i�ine concrete method yazamazs�n�z yazarsan�z Comple Time Eror al�rs�n�z
	//interface de method olu�tururken kesinlikle body yazmay�n 
	//interface deki methodlar kesinlikle abstract olmal�d�r.
	//interfacedeki abstract methodlar� �retirken abstract keyword kullansan�z da olur kullanmasan�z da olur
	//��nk� �nterface kendi i�ine yaz�lan methodlar� otomatik olarak abstract kabul eder. 
	public void add();
	public abstract void subtract();
	
	//�nterface de variable lar mutlaka public static final olmal� ve mutlaka de�er atanmal�d�r. 
	//variable olu�turulurken public static final keywordlar� kullan�lsada olur kullan�lmasada olur. 
	//��nk� �nterface kendi i�ine yaz�lan variableleri otomatik olarak public static final  kabul eder.
	
	public static final int a=12;
	int b=11;
	public int c=13;
	final int d=14;
	static int e=15;
	
}
