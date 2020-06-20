package day26encapsulation;

public class Encapsulation01 {
	
	private String kimlikNo="34567890098";
	private int krediKartNo=123456789;
	private boolean soguk=true;

	public static void main(String[] args) {
		// Encapsulation data saklama data-hiding yöntemidir.
		//Encapsulation iki stepte yapýlýr.
		//1) data yý (veriable,method) private yapmalýsýnýz
		//2)public olan getter() ve setter() methodlar üretmeliyim
		// getter() deta yi sadece okkumamýza yarar. getter() methodu deta da deðiþiklik yapamaz
		//setter() deta yi deðiþtirmemize yarar. 
		
		
		

	}
	
	// getter üretmek için 1) Access Modifier public olmalý
						  //2)Return type variablenin return type i ile ayný olmalý
							//3) method ismi get+ variable ismi þeklinde olmalý
	
	
	
	public  String getKimlikNo() {
		return kimlikNo;
	}
	public  int getKrediKartNo() {
		return krediKartNo;
	}
	//return type boolean ise getter() method un ismi is ile baþlar. get kullanýlmaz
	public boolean isSoguk() {
		return soguk;
	}
	// setter üretmek için 1) Access modifier public olmalý
	//2) return type void olmalý
	//3) method ismi set + variable ismi olmalý
	//4) parametre kullanýlmalý
	//5) setter methodlarýn ismi booleanlar için de set ile baþlar. 
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
