package day15methodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		System.out.println(toplama(11,15.2));
		System.out.println(carpma(13,5));
	}
	// bir methodu main methodun içinden çaðýrmak için static ifadesini kullanmalýsýnýz.
	//method parantezinin içinde oluþturulan variablelere parametre denir. 
	//Methodu çaðýrýrken method parantezinin içine yazýlan deðerlere de "Argument" denir
	//parametrenin data type ile Argumentin data type 1'e 1  eþleþmeli
	public static double toplama(int num1,double num2) {
			return num1+num2;
	}
	
	public static int carpma(int num1,int num2) {
		return num1*num2;
	}
}
