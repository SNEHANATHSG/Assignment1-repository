package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorClass {

	public static void main(String[] args) {
		Set <String> d = new HashSet <String>();
        d.add("appu");
        d.add("arnav");
        d.add("car");
        d.add("key");
        System.out.println(d);
        Iterator i =d.iterator();
        while(i.hasNext())//checks whether the next element present
        {
        	System.out.println(i.next());//is used to return the next element based on iteration order
        }
        i.remove();//last value based on iteration order will be removed
        System.out.println(d);
        
	}

}
