package day23date;

import java.util.ArrayList;
import java.util.List;

public class ListAllMethod {

	public static void main(String[] args) {
		// listAll methodu iki listi birle�tirmek i�in kullan�l�r
		// index kullanmadan addAll kullan�rsan�z ya ba� tarafa veya son tarafa ekleme yapars�n�z
		// fakat index kullanarak addAll kullan�rsan�z istedi�iniz index e ekleyebilirsiniz. 
		
		List<Integer> list1=new ArrayList<>();
		list1.add(11);
		list1.add(12);
		System.out.println(list1);//[11, 12]
		List<Integer> list2=new ArrayList<>();
		list2.add(0, 13);
		list2.add(1, 14);
		list2.add(2, 15);
		System.out.println(list2);//[13, 14, 15]
		
		
		list1.addAll(list2);
		
		System.out.println(list1);//[11, 12, 13, 14, 15]
		
		list2.addAll(list1);
		System.out.println(list2);//[13, 14, 15, 11, 12, 13, 14, 15]
		
		List<Integer> list3=new ArrayList<>();
		list3.add(1);
		System.out.println(list3);
		
		List<Integer> list4=new ArrayList<>();
		list4.add(2);
		list4.add(3);
		System.out.println(list4);
		
		list4.addAll(1,list3);
		System.out.println(list4);
		
		
	
		
	}

}
