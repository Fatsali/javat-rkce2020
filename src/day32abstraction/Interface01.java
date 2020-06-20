package day32abstraction;

public interface Interface01 {
	
	//interface içine concrete method yazamazsýnýz yazarsanýz Comple Time Eror alýrsýnýz
	//interface de method oluþtururken kesinlikle body yazmayýn 
	//interface deki methodlar kesinlikle abstract olmalýdýr.
	//interfacedeki abstract methodlarý üretirken abstract keyword kullansanýz da olur kullanmasanýz da olur
	//çünkü ýnterface kendi içine yazýlan methodlarý otomatik olarak abstract kabul eder. 
	public void add();
	public abstract void subtract();
	
	//ýnterface de variable lar mutlaka public static final olmalý ve mutlaka deðer atanmalýdýr. 
	//variable oluþturulurken public static final keywordlarý kullanýlsada olur kullanýlmasada olur. 
	//çünkü ýnterface kendi içine yazýlan variableleri otomatik olarak public static final  kabul eder.
	
	public static final int a=12;
	int b=11;
	public int c=13;
	final int d=14;
	static int e=15;
	
}
