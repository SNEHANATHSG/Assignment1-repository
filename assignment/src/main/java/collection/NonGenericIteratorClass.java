package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NonGenericIteratorClass {

	public static void main(String[] args) {
		Set g =new HashSet();
        g.add("train");
        g.add("car");
        g.add("bus");
        System.out.println(g);
        Iterator i = g.iterator();
        while(i.hasNext())
        {
        	System.out.println(i.next());
        }
        i.remove();
        System.out.println(g);
	}

}
