package day35collections;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratior02 {

	public static void main(String[] args) {
		// elemanlar� A,B,C olan bir list olu�turunuz 
		//list iterator kullanark  AW BW ve CW d�n��t
		
		List<String>list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		ListIterator<String> listIterator=list.listIterator();
		while( listIterator.hasNext()) {
			Object element=listIterator.next();
			System.out.print(element+"W ");
		}
	}

}
