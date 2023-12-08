package com.search.tester;

import com.search.core.Searching;

public class Tester {

	public static void main(String[] args)
	{
		Searching obj = new Searching();
		int[] arr = {-1,0,3,5,9,12};
		
		System.out.println(obj.binarySearch(arr, 9));
		
	}
	
}
