package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratior {

	public static void main(String[] args) {
		// Elemanlarý A,B,C olan bir list oluþturunuz
		List<String>list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		//list iterator oluþturunuz. list itereterleri kullanýrken while loop kullanýlýr. neydi hasnext bir sonraki eleman varsa yazdýr
		//yoksa dur. 
		ListIterator<String> listIterator=list.listIterator();
		while( listIterator.hasNext()) {
			Object element=listIterator.next();
			System.out.print(element+" ");
		}
		//gerisinde eleman varmý
		System.out.println();
		
		//hasPrevious ve previous() methodlarýný kullanarak bir listin elemanlarýný tersten yazdýrmak isterseniz mutlaka önce
		//hasNext() ve Next() kullanmalýsýnýz.
		while(listIterator.hasPrevious()) {
			Object eleman=listIterator.previous();	
			System.out.print(eleman+" ");
		}

	}

}
