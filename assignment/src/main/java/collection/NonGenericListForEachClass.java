package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListForEachClass {

	public static void main(String[] args) {
		List s = new ArrayList();//non generic list
		s.add("python");
		s.add(7);
		s.add(2.3f);
		for(Object g:s)
		{
			System.out.println(g);
		}
		

	}

}
