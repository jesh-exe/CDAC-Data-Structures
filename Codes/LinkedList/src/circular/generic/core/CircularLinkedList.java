package circular.generic.core;

import linkedlist.core.List;

public class CircularLinkedList<E> implements List<E> {

	private Node<E> headNode;

	public CircularLinkedList()
	{
		headNode = null;
	}

	@Override
	public boolean isEmpty()
	{
		return headNode == null ? true : false;
	}

	@Override
	public void add(E value)
	{
		Node<E> newNode = new Node<>(value);
		if (headNode == null) headNode = newNode;
		else
		{
			Node<E> tempNode = headNode;
			while (tempNode.next!=null || tempNode.next != headNode)
				tempNode = tempNode.next;
			newNode.next = headNode;
			tempNode.next = newNode;
		}
	}

	@Override
	public void add(int index, E value)
	{
		Node<E> newNode = new Node<>(value);
		if (headNode == null) headNode = newNode;
		else
		{
			Node<E> tempNode = headNode;
			int count = 1;
			while (count != index)
			{
				count++;
				tempNode = tempNode.next;
				if (tempNode == headNode)
				{
					System.out.println("No such Index Exists!");
					return;
				}
			}
			newNode.next = tempNode.next;
			tempNode.next = newNode;
		}

	}

	@Override
	public void addFirst(E value)
	{
		Node<E> newNode = new Node<>(value);
		if (headNode == null) headNode = newNode;
		else
		{
			newNode.next = headNode;
			headNode = newNode;
		}

	}

	@Override
	public void addLast(E value)
	{
		add(value);

	}

	@Override
	public void remove(int index)
	{
		if(isEmpty())
		{
			System.out.println("Empty!");
		}
		else 
		{
			int count=1;
			Node<E> tempNode = headNode;
			Node<E> prevNode = headNode;
			while(count!=index)
			{
				count++;
				prevNode = tempNode;
				tempNode = tempNode.next;
				if(tempNode==headNode)
				{
					System.out.println("No Such Index!");
					return;
				}
			}
			prevNode.next = tempNode.next;
		}
	}

	@Override
	public void removeFirst()
	{
		if (isEmpty())
		{
			System.out.println("Empty!");
		}
		else
		{
			headNode = headNode.next;
		}

	}

	@Override
	public void removeLast()
	{
		if (isEmpty())
		{
			System.out.println("Empty!");
		}
		else
		{
			Node<E> tempNode = headNode;
			Node<E> prevNode = headNode;
			while(tempNode.next!=headNode)
			{
				prevNode = tempNode;
				tempNode = tempNode.next;
			}
			prevNode.next = tempNode.next;
		}
	}

	@Override
	public E get(int index)
	{
		if(isEmpty())
			return null;
		Node<E>tempNode = headNode;
		int count=1;
		while(count!=index)
		{
			count++;
			tempNode = tempNode.next;
			if(tempNode == headNode)
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
		Node<E> tempNode = headNode;
		while(tempNode.next!=headNode)
			tempNode = tempNode.next;
		return tempNode.data;
	}
	
	@Override
	public String toString()
	{
		if(isEmpty())
		{
			System.out.println("Empty!");
			return "";			
		}
		
		Node<E> tempNode = headNode;
		while(tempNode!=headNode)
		{
			System.out.println(tempNode.data+" ");
			tempNode = tempNode.next;
		}
		return "";
	}

}
