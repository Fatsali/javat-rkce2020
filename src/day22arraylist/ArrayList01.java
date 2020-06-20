package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		//eguals() methodu iki listin birbirine eþit olup olmadýðýn kontrol eder
		// listler eþit ise true deðilse false return eder
		//eguals() methodu ayný index te ayný elemaný olup olmadýðýn kontrol eder. 
		//eguals() methodu true alabilmek için listler birbirinin fotokopisi gibi olmalýdýr. 
		//eguals() methodu objelerin reference lerine bakmaz.
		
		List<String> list1=new ArrayList<>();
		List<String> list2=new ArrayList<>();
		
		System.out.println(list1.equals(list2));
		
		list1.add("A");
		list1.add("B");
		System.out.println(list1.equals(list2));
		list2.add("B");
		list2.add("A");
		System.out.println(list1.equals(list2));
		
		
		
		
		
		
		
		
	}

}
