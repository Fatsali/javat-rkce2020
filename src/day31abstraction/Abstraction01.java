package day31abstraction;

public abstract class Abstraction01 {

	public static void main(String[] args) {
		//Abstracact class lardan obje �retilemez. 
		//constractor lar� yoktur.
		//Abstract classlar concrete(body li) ve abstract(bodysiz) methodlar i�erir
		//==>Abstract class lar�n hem concrete class hem de abstract class olan child lar� olabilir. 
		//Abstract class �n child i concrete class ise abstract classdaki abstract methodlar� mutlaka override etmeli ve onlara vody eklemelidir.
		//==> bunun faydasi �udur; child classlarda mecburen olmas� gereken methodlar� bu �ekilde belirlemi� oluruz. 
		//Abstract class �n child i abstract class ise abstract class daki herhangi bir �eyi override etmek zorunda de�ildir. 
		
		
		
		
		
		
		
	}
	
	
	public void concreteMethod() {
		System.out.println("Ben concrete'im");
	}

	public abstract void abstractMethod();
}
 