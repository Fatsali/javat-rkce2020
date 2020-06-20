package day26encapsulation;

public class Encapsulation02 {

	private char ilkHarf='F';
	private double para=23.75;
	private boolean emekli=false;
	
	//veriableye atanan de�erin de�i�tirilmesini istemiyorsan�z o veriable ile alakal� setter olu�turmamal�s�n�z. 
	// variable atanan de�erin okunmas�n� istemiyorsan�z o variable ile alakal� getter olu�turmazs�n�z
	// sadece getter kullan�l�r ve hi� setter kullanmazsan�z variable de�erleri ge�i�tirilmez demektir. 
	//sadece setter kullan�l�r ve hi� getter kullanmazsan�z variable de�erleri ge�i�tirilmez demektir. 
	public static void main(String[] args) {
		Encapsulation01 obj=new Encapsulation01();
		System.out.println(obj.getKimlikNo());
		obj.setKimlikNo("10000000000");
		System.out.println(obj.getKimlikNo());
	}



	public char getIlkHarf() {
		return ilkHarf;
	}



	public void setIlkHarf(char ilkHarf) {
		this.ilkHarf = ilkHarf;
	}
	public double getPara() {
		return para;
	}



	public void setPara(double para) {
		this.para = para;
	}



	public boolean isEmekli() {
		return emekli;
	}



	public void setEmekli(boolean emekli) {
		this.emekli = emekli;
	}
	
	

}
