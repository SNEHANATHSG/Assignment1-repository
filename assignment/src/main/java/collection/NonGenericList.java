package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericList {

	public static void main(String[] args) {
		List D = new ArrayList();
		D.add("ram");
		D.add("seetha");
		D.add("athul");
		D.add("sneha");
		D.add("athul");
		D.add("null");
		D.add(12.4);
		D.add(2);
		System.out.println(D);
		System.out.println(D.get(3));
		System.out.println(D.set(5, "sakshi"));
		System.out.println(D.isEmpty());
		System.out.println(D.contains("sneha"));
		System.out.println(D.size());
		System.out.println(D.indexOf("seetha"));
		System.out.println(D.lastIndexOf("athul"));
		System.out.println(D.remove(0));
		System.out.println(D.remove("ram"));
		System.out.println(D);

	}

}
