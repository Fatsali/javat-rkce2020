package day31abstraction;

public abstract class Abstraction01 {

	public static void main(String[] args) {
		//Abstracact class lardan obje üretilemez. 
		//constractor larý yoktur.
		//Abstract classlar concrete(body li) ve abstract(bodysiz) methodlar içerir
		//==>Abstract class larýn hem concrete class hem de abstract class olan child larý olabilir. 
		//Abstract class ýn child i concrete class ise abstract classdaki abstract methodlarý mutlaka override etmeli ve onlara vody eklemelidir.
		//==> bunun faydasi þudur; child classlarda mecburen olmasý gereken methodlarý bu þekilde belirlemiþ oluruz. 
		//Abstract class ýn child i abstract class ise abstract class daki herhangi bir þeyi override etmek zorunda deðildir. 
		
		
		
		
		
		
		
	}
	
	
	public void concreteMethod() {
		System.out.println("Ben concrete'im");
	}

	public abstract void abstractMethod();
}
 