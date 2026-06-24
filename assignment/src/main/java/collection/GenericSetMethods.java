package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		Set <String> f = new HashSet <String>();//generic set creation
		f.add(null);
		f.add("sneha");
		f.add("athul");
		f.add("sakshi");
		f.add("appu");
		System.out.println(f);//unordered
		Set <String> g = new HashSet <String>();
        g.add("pen");
        g.add("paper");
        f.addAll(g);
        System.out.println(f);//addAll
        System.out.println(f.contains("ram"));
        System.out.println(f.containsAll(g));
        System.out.println(f.size());
        System.out.println(f.isEmpty());
        //f.clear();
        //System.out.println(f);
        System.out.println(f.remove("pen"));//in remove we cannot add index since unordered
        System.out.println(f);
        f.removeAll(g);
        System.out.println(f);
	}

}
