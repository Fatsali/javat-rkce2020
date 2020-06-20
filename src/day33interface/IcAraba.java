package day33interface;

public interface IcAraba {
	
	int price=2000;
	boolean old=true;
	
 public abstract void direksiyon();
 public void koltuk();
 abstract void klima();
 public default void doseme() {
	System.out.println("Interface'de default keyword ile döseme yaptým");
 }
 
 
}
