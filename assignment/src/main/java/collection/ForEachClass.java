package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ForEachClass {

	public static void main(String[] args) {
		//generic list
		List<String> g =new ArrayList<String>();
		g.add("python");
		g.add("java");
		g.add("html");
		for(String d: g)
		{
			System.out.println(d);
		}
		//non generic set
        Set h =new HashSet();
        h.add("student");
        h.add(null);
        h.add(3);
        for(Object t:h)
        {
        	System.out.println(t);
        }
        
	}

}
