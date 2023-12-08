package circular.generic.tester;

import circular.generic.core.CircularLinkedList;
import linkedlist.core.List;

public class Tester {

	public static void main(String[] args)
	{
		List<Integer> list = new CircularLinkedList<Integer>();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(4);
		list.addFirst(5);
		System.out.println(list);
	}
	
}
