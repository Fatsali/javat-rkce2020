package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratior {

	public static void main(String[] args) {
		// Elemanlar� A,B,C olan bir list olu�turunuz
		List<String>list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		//list iterator olu�turunuz. list itereterleri kullan�rken while loop kullan�l�r. neydi hasnext bir sonraki eleman varsa yazd�r
		//yoksa dur. 
		ListIterator<String> listIterator=list.listIterator();
		while( listIterator.hasNext()) {
			Object element=listIterator.next();
			System.out.print(element+" ");
		}
		//gerisinde eleman varm�
		System.out.println();
		
		//hasPrevious ve previous() methodlar�n� kullanarak bir listin elemanlar�n� tersten yazd�rmak isterseniz mutlaka �nce
		//hasNext() ve Next() kullanmal�s�n�z.
		while(listIterator.hasPrevious()) {
			Object eleman=listIterator.previous();	
			System.out.print(eleman+" ");
		}

	}

}
