package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

class Basic {
	int id;
	int age;
	String name;
	String email;

	public Basic(int id, int age, String name, String email) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.email = email;
	}
}

public class LInkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList LL = new LinkedList();
		//ArrayList LL = new ArrayList();
		Vector LL = new Vector();
		Basic b = new Basic(101, 12, "Chetan", "Chetan@gmail.com");
		Basic b1 = new Basic(102, 13, "Amit","  Amit@gmail.com");
		Basic b2 = new Basic(103, 14, "nayan", "Nayan@gmail.com");
		Basic b3 = new Basic(104, 15, "Vishal","Vishal@gmail.com");
		Basic b4 = new Basic(105, 16, "pranav","pranav@gmail.com");

		LL.add(b);
		LL.add(b1);
		LL.add(b2);
		LL.add(b3);
		LL.add(b4);

		Iterator i = LL.iterator();
		while (i.hasNext()) {
			Basic B = (Basic) i.next();
			System.out.println(B.id + "  " + B.age + "  " + B.name + "  " + B.email);

		}
	}
}