package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetForEachClass {

	public static void main(String[] args) {
		Set <String> f = new HashSet <String>();  
        f.add("html");
        f.add("css");
        f.add("java");
        f.add("python");
        for(String d:f)//generic set foreach class
        {
        	System.out.println(d);
        }
	}

}
