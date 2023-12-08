package com.sorting.core;

import java.util.Collections;
import java.util.List;

public class Sorting {

	/*	To make a method Generic in Non Generic class, we need to write the <E>
	 * 	in the method signature after access specifier of the method.
	 *	We write E extends Comparable<E> because we want to use compareTo method of Comparable
	 *	interface, also E is a interface type, hence we use extends keyword to inherit
	 */
	
	

	/* 									Working of Selection Sort.
	 * 
	 * 	1. Firstly we select one element
	 * 	2. We traverse the list forward from the element
	 * 	3. We check the minimum value of the whole forward list compared to our current element.
	 * 	4. If minimum element is found, we set a variable minIndex to the minimum element's index
	 * 	5. After iterating whole list, we just swap the current element with the midIndex element
	 * 	6. We will always initialize midIndex to current element index
	 * 	7. If we don't get the minimum element after traversing, we will just swap midIndex, which is already the current elements
	 * 		index.
	 * 	8. We will require two for loops.
	 * 
	 */
	
	public <E extends Comparable<E>> void selectionSort(List<E> list)		
	{
		for (int i = 0; i < list.size(); i++)
		{
			int midIndex = i;
			for (int j = i; j < list.size(); j++)
			{
				if (list.get(midIndex).compareTo(list.get(j)) >= 1) 
					midIndex = j;
			}
			Collections.swap(list, i, midIndex);
		}
	}
	
	
	/*
	 * 									Working of Bubble Sort
	 * 	1. First we compare adjacent element of current element
	 * 	2. If the current element is greater than the adjacent element
	 * 	3. We swap the element 
	 * 	4. We do this till the end of the list 
	 * 	5. If adjacent greater than the current, we skip the adjacent element
	 * 	6. And check till the list ends
	 * 
	 */
	
	public <E extends Comparable<E>> void bubbleSort(List<E> list)
	{
		for (int i = 0; i < list.size(); i++)
		{
			for (int j = 0; j < list.size() - (i + 1); j++)
			{
				if (list.get(j).compareTo(list.get(j + 1)) >= 1) 
					Collections.swap(list, j, j + 1);
			}
		}
	}
	
	
	/*
	 * 									Working of Insertion Sort
	 * 	1. In this sorting, we start from the second element of the list.
	 * 	2. Current element is stored in the Key variable
	 * 	3. We check the previous list of the key element.
	 * 	4. If the previous element is greater, then we set the current element to the previous element
	 * 	5. If the previous list element is smaller than the key, we just replace the next element of the 
	 * 	   previous element in the list to the key value.
	 * 
	 */

	public <E extends Comparable<E>> void insertionSort(List<E> list)
	{
		for (int i = 1; i < list.size(); i++)
		{
			E key = list.get(i);
			int j = i - 1;
			while (j > -1 && list.get(j).compareTo(key) >= 1)
			{
				list.set(j + 1, list.get(j));
				j--;
			}
			list.set(j + 1, key);
		}
	}

}
