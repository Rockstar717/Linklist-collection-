package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList LL =new LinkedList();
		LL.add("123");
		LL.add("ABC");
		LL.add("@#$");
		LL.add('r');
		//LL.clear();
		LL.isEmpty();
		System.out.println(LL);
		
		Iterator i = LL.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		

	}

}
