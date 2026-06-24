package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGenericSetMethods {

	public static void main(String[] args) {
		Set f = new HashSet();
		f.add("neha");
		f.add("appu");
		f.add("arun");
		System.out.println(f);
		Set g = new HashSet();
		g.add("pen");
		g.add("car");
		g.addAll(f);
		System.out.println(g);
        System.out.println(f.contains("neha"));
        System.out.println(f.containsAll(g));
        System.out.println(g.size());
        System.out.println(g.isEmpty());
        System.out.println(g.remove("pen"));
        System.out.println(g.removeAll(f));
        System.out.println(g);
        g.clear();
        System.out.println(g);
	}  

}
