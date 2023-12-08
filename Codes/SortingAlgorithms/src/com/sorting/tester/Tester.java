package com.sorting.tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.sorting.core.Sorting;

public class Tester {

	public static void main(String[] args)
	{
		Sorting sort = new Sorting();
		
		List<Integer> intList = new ArrayList<>(Arrays.asList(5,2,38,3,1));
		List<Character> charList = new ArrayList<>(Arrays.asList('c','u','a','e','t','d'));
		List<Double> doubleList = new ArrayList<>(Arrays.asList(34.56,68.90,23.54,12.34,1.20,32.76));
		
		System.out.print("\nBefore Sort: "+intList);
		sort.selectionSort(intList);
		System.out.print("\nSelection Sort: "+intList);
		
		System.out.println();
		
		System.out.print("\nBefore Sort: "+charList);
		sort.bubbleSort(charList);
		System.out.print("\nBubble Sort: "+charList);
		
		Collections.shuffle(charList);
		System.out.println();
		
		System.out.print("\nBefore Sort: "+doubleList);
		sort.insertionSort(doubleList);
		System.out.print("\nInsertion Sort: "+doubleList);
		
	}
	
}
