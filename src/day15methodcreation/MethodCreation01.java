package day15methodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		System.out.println(toplama(11,15.2));
		System.out.println(carpma(13,5));
	}
	// bir methodu main methodun i�inden �a��rmak i�in static ifadesini kullanmal�s�n�z.
	//method parantezinin i�inde olu�turulan variablelere parametre denir. 
	//Methodu �a��r�rken method parantezinin i�ine yaz�lan de�erlere de "Argument" denir
	//parametrenin data type ile Argumentin data type 1'e 1  e�le�meli
	public static double toplama(int num1,double num2) {
			return num1+num2;
	}
	
	public static int carpma(int num1,int num2) {
		return num1*num2;
	}
}
