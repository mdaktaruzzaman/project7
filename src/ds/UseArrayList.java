package ds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(11);
		
		Iterator it = list.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
