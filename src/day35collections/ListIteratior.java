package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratior {

	public static void main(String[] args) {
		// Elemanları A,B,C olan bir list oluşturunuz
		List<String>list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		//list iterator oluşturunuz. list itereterleri kullanırken while loop kullanılır. neydi hasnext bir sonraki eleman varsa yazdır
		//yoksa dur. 
		ListIterator<String> listIterator=list.listIterator();
		while( listIterator.hasNext()) {
			Object element=listIterator.next();
			System.out.print(element+" ");
		}
		//gerisinde eleman varmı
		System.out.println();
		
		//hasPrevious ve previous() methodlarını kullanarak bir listin elemanlarını tersten yazdırmak isterseniz mutlaka önce
		//hasNext() ve Next() kullanmalısınız.
		while(listIterator.hasPrevious()) {
			Object eleman=listIterator.previous();	
			System.out.print(eleman+" ");
		}

	}

}
