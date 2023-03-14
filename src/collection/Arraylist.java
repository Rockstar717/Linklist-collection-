package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(true);
		al.add("ABC");
		al.add('c');
		al.add("123");
		al.add("@");
		al.add("456.85");
		//al.remove(4);
		//al.removeAll(al);
		//al.add(3);
		//al.addAll(al);
		
		System.out.println(al);
		
			Iterator i = al.iterator();
			while(i.hasNext()) {
		
		System.out.println(i.next());
		
	}

}
}