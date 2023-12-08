package single.generic.core;

import linkedlist.core.List;

public class LinkedList<E> implements List<E> {

	private Node<E> headNode;

	public LinkedList()
	{
		headNode = null;
	}

	@Override
	public boolean isEmpty()
	{
		if (headNode == null) return true;
		else return false;
	}

	@Override
	public void add(E value)
	{
		Node<E> newNode = new Node<E>();
		newNode.data = value;
		newNode.next = null;

		if (headNode == null)
		{
			headNode = newNode;
			return;
		}

		Node<E> temp = headNode;
		while (temp.next != null)
			temp = temp.next;
		temp.next = newNode;

	}

	@Override
	public void add(int index, E value)
	{
		if (isEmpty())
		{
			System.out.println("The Linked List is Empty!");
			return;
		}
		Node<E> tempNode = new Node<E>();
		tempNode.data = value;

		if (index == 1)
		{
			tempNode.next = headNode;
			headNode = tempNode;
			return;
		}
		int count = 1;
		Node<E> itrNode = headNode;
		Node<E> prevItrNode = null;
		while (count != index)
		{
			count++;
			if (itrNode == null)
			{
				System.out.println("No such index exists!");
				return;
			}
			prevItrNode = itrNode;
			itrNode = itrNode.next;
		}
		tempNode.next = itrNode;
		prevItrNode.next = tempNode;
	}

	@Override
	public void addFirst(E value)
	{
		Node<E> newNode = new Node<E>();
		newNode.data = value;
		if (headNode == null)
		{
			newNode.next = null;
			headNode = newNode;
			return;
		}
		newNode.next = headNode;
		headNode = newNode;
	}

	@Override
	public void addLast(E value)
	{

		Node<E> newNode = new Node<E>();
		newNode.data = value;
		newNode.next = null;

		if (headNode == null)
		{
			headNode = newNode;
			return;
		}

		Node<E> temp = headNode;
		while (temp.next != null)
			temp = temp.next;
		temp.next = newNode;

	}

	@Override
	public void remove(int index)
	{
		if (isEmpty())
		{
			System.out.println("Linked List is Empty!");
			return;
		}
		Node<E> tempNode = headNode;
		if (index == 1) headNode = tempNode.next;
		else
		{
			Node<E> tempPrevNode = null;
			int count = 1;
			while (count <= index)
			{
				count++;
				if (tempNode == null)
				{
					System.out.println("No such Index Exists!");
					return;
				}
				tempPrevNode = tempNode;
				tempNode = tempNode.next;
			}
			tempPrevNode.next = tempNode.next;
		}

	}

	@Override
	public void removeFirst()
	{
		if (isEmpty())
		{
			System.out.println("Linked List is Empty!");
			return;
		}
		headNode = headNode.next;
	}

	@Override
	public void removeLast()
	{
		if (isEmpty())
		{
			System.out.println("Linked List is Empty!");
			return;
		}
		if (headNode.next == null)
		{
			headNode = null;
			return;
		}
		Node<E> tempNode = headNode;
		Node<E> prevNode = null;
		while (tempNode.next != null)
		{
			prevNode = tempNode;
			tempNode = tempNode.next;
		}
		prevNode.next = null;
	}

	@Override
	public E get(int index)
	{
		if (isEmpty())
		{
			System.out.println("Linked List is Empty");
			return null;
		}

		if (index == 1) return headNode.data;

		int count = 1;
		Node<E> tempNode = headNode;
		while (count++ != index)
		{
			if (tempNode == null)
			{
				System.out.println("No such Index Exists!");
				return null;
			}
			tempNode = tempNode.next;
		}
		return tempNode.data;
	}

	@Override
	public E getFirst()
	{
		if (isEmpty())
		{
			System.out.println("Linked List is Empty!");
			return null;
		}
		return headNode.data;
	}

	@Override
	public E getLast()
	{
		if (isEmpty())
		{
			System.out.println("Linked List is Empty!");
			return null;
		}
		Node<E> tempNode = headNode;
		while (tempNode.next != null)
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
