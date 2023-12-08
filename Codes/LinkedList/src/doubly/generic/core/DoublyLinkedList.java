package doubly.generic.core;

import linkedlist.core.List;

public class DoublyLinkedList<E> implements List<E> {

	Node<E> headNode;

	@Override
	public boolean isEmpty()
	{
		return headNode == null ? true : false;
	}

	@Override
	public void add(E value)
	{
		Node<E> newNode = new Node<>(value);

		if (isEmpty()) headNode = newNode;

		else
		{
			Node<E> tempNode = headNode;

			while (tempNode.next != null)
				tempNode = tempNode.next;

			newNode.prev = tempNode;
			tempNode.next = newNode;
		}

	}

	@Override
	public void add(int index, E value)
	{
		
	}

	@Override
	public void addFirst(E value)
	{
		Node<E> newNode = new Node<>(value);
		if(isEmpty())
			headNode = newNode;
		else {
			newNode.next = headNode;
			headNode.prev = newNode; 
			headNode = newNode;
		}
			
	}

	@Override
	public void addLast(E value)
	{
		Node<E> newNode = new Node<>(value);
		if(isEmpty())
			headNode = newNode;
		else {
			Node<E> tempNode = headNode;
			while(tempNode.next!=null)
				tempNode = tempNode.next;
			newNode.prev = tempNode;
			tempNode.next = newNode;
		}
		
	}

	@Override
	public void remove(int index)
	{
		if(isEmpty())
		{
			System.out.println("Linked List is Empty!");
			return;
		}
		if(index == 1)
		{
			headNode = headNode.next;
			return;
		}
			
		int count = 1;
		Node<E> tempNode = headNode;
		
		while(count!=index)
		{
			count++;
			tempNode = tempNode.next;
			if(tempNode==null)
			{
				System.out.println("No such index Exists!");
				return;
			}
		}
		if(tempNode.next!=null)
			tempNode.prev.next = tempNode.next;
		else 
			tempNode.prev.next = null;
			
	}

	@Override
	public void removeFirst()
	{
		if(isEmpty())
		{
			System.out.println("Linked List is Empty!");
			return;
		}
		headNode = headNode.next;
		headNode.prev = null;

	}

	@Override
	public void removeLast()
	{

		if(isEmpty())
		{
			System.out.println("Linked List is Empty!");
			return;
		}
		Node<E> tempNode = headNode;
		int count = 1;
		while(tempNode.next!=null)
		{
			count++;
			tempNode = tempNode.next;
		}
		remove(count);
		
	}

	@Override
	public E get(int index)
	{
		if(isEmpty())
			return null;
		
		int count = 1;
		Node<E> tempNode = headNode;
		while(count!=index)
		{
			count++;
			tempNode = tempNode.next;
			if(tempNode==null)
				return null;
		}
		return tempNode.data;
	}

	@Override
	public E getFirst()
	{
		if(isEmpty())
			return null;
		return headNode.data;
	}

	@Override
	public E getLast()
	{
		if(isEmpty())
			return null;
		
		Node<E> tempNode =  headNode;
		while(tempNode.next!=null)
			tempNode = tempNode.next;
		return tempNode.data;

	}

	@Override
	public String toString()
	{
		if (isEmpty())
		{
			System.out.println("The Linked List is Empty!");
			return null;
		}

		Node<E> tempNode = headNode;
		while (tempNode != null)
		{
			System.out.print(tempNode.data + " ");
			tempNode = tempNode.next;
		}
		return "";

	}
	
	

}
