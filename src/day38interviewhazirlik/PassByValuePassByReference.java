package day38interviewhazirlik;

public class PassByValuePassByReference {

	public static void main(String[] args) {
		// bir methoda variable yolland���nda java o variable in kopyas�n� olu�turur ve methoda kopyay� yollar bu y�zden variablenin 
		//orijinal de�eri method cal��t�ktan sonra da ayn� kal�r. buna Pass By Value denir. 
		
		//Pass by Refernece da ise reference in kopyas� olusturulur ve methoda yollan�r. fakat reference in kopyas� da kendisi gibi ayn�
		//objecti g�sterdi�i i�in orijinal de�er ta��r. 
		int x=12; 
		System.out.println(increment(x));//13
		System.out.println(x);//12
		
	}
public static int increment(int a) {
	a=a+1;
	return a;
}
}
