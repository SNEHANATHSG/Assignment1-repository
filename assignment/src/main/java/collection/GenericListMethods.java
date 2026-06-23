package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) {
		List <String> D = new ArrayList <String>();
		D.add("apple");
		D.add("orange");
		D.add("banana");
		D.add("mango");
		D.add("apple");
		D.add(null);
		System.out.println(D);
		System.out.println(D.get(2));
		System.out.println(D.set(5, "kiwi"));
		System.out.println(D);
		System.out.println(D.indexOf("mango"));
		System.out.println(D.lastIndexOf("apple"));
		System.out.println(D.size());
		System.out.println(D.isEmpty());
		System.out.println(D.contains("cherry"));
		System.out.println(D.remove(3));
		System.out.println(D.remove("apple"));
		System.out.println(D);

	}

}
