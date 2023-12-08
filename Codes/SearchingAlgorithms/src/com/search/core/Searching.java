package com.search.core;


public class Searching {

	
	public boolean linearSearch(int[] arr,int target)
	{
		for(int i: arr)
			if(i==target)
				return true;
		return false;
	}
	
	
	public int binarySearch(int[] arr, int target)
	{
		return binary(arr, 0, arr.length-1, target);
	}
	
	private int binary(int[] arr, int start, int end, int target)
	{
		if(start>end)
			return -1;
		
		int mid = (start+end)/2;
		
		if(arr[mid] == target)
			return mid;
		
		else if(target<arr[mid])
			return binary(arr, start, mid-1, target);
		
		else if(target>arr[mid])
			return binary(arr, mid+1, end, target);
		
		return -1;
	}
	
	
}
