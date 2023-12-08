package single.generic.tester;

import single.generic.core.LinkedList;
import linkedlist.core.List;

public class Tester {

	public static void main(String[] args)
	{
		List<String> list = new LinkedList<String>();
		
		list.add("Jayesh");
		list.add("Ayushi");
		list.add("Pushkar");
		list.add("Aditya");
		list.add("Tushar");
		list.add(6,"abc");
		
		System.out.println("Elements Before Insert at First & Last Index");
		System.out.println(list);
		System.out.println();
		
		list.addFirst("Mandeep");
		list.addLast("Akshay");
		
		System.out.println("Elements After Insert at First & Last Index");
		System.out.println(list);
		System.out.println();
		System.out.println("At First Index: "+list.getFirst());
		System.out.println("At Last Index: "+list.getLast());
		System.out.println("At 3rd Index: "+list.get(3));
//		list.remove(5);
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);
	}
}
