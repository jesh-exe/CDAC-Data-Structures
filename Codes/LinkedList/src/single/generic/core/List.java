package single.generic.core;

public interface List<E> {

	void add(E value);
	void add(int index, E value);
	void addFirst(E value);
	void addLast(E value);
	
	void remove(int index);
	void removeFirst();
	void removeLast();

	E get(int index);
	E getFirst();
	E getLast();
	
	boolean isEmpty();
	
}
