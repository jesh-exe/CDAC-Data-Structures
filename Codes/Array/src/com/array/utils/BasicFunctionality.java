package com.array.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class BasicFunctionality {

	public static int[] reverseArray(int[] arr)
	{
		int j = arr.length-1;
		for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
		}
		return arr;
	}
	
}
