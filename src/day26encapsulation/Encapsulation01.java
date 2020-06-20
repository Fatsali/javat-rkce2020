package day26encapsulation;

public class Encapsulation01 {
	
	private String kimlikNo="34567890098";
	private int krediKartNo=123456789;
	private boolean soguk=true;

	public static void main(String[] args) {
		// Encapsulation data saklama data-hiding y�ntemidir.
		//Encapsulation iki stepte yap�l�r.
		//1) data y� (veriable,method) private yapmal�s�n�z
		//2)public olan getter() ve setter() methodlar �retmeliyim
		// getter() deta yi sadece okkumam�za yarar. getter() methodu deta da de�i�iklik yapamaz
		//setter() deta yi de�i�tirmemize yarar. 
		
		
		

	}
	
	// getter �retmek i�in 1) Access Modifier public olmal�
						  //2)Return type variablenin return type i ile ayn� olmal�
							//3) method ismi get+ variable ismi �eklinde olmal�
	
	
	
	public  String getKimlikNo() {
		return kimlikNo;
	}
	public  int getKrediKartNo() {
		return krediKartNo;
	}
	//return type boolean ise getter() method un ismi is ile ba�lar. get kullan�lmaz
	public boolean isSoguk() {
		return soguk;
	}
	// setter �retmek i�in 1) Access modifier public olmal�
	//2) return type void olmal�
	//3) method ismi set + variable ismi olmal�
	//4) parametre kullan�lmal�
	//5) setter methodlar�n ismi booleanlar i�in de set ile ba�lar. 
	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo=kimlikNo;
		
	}
	public void setKrediKartNo(int krediKartNo) {
		this.krediKartNo=krediKartNo;
	}
	
	
	public void setSoguk(boolean soguk){
		this.soguk=soguk;
	}
	
}
