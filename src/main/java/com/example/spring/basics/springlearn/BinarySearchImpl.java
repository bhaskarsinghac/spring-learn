package com.example.spring.basics.springlearn;

// here we used interface to dynamically switch b/w the quick and bubblesort algorithm

public class BinarySearchImpl {
	private SortAlgorithm sortAlgorithm;
	
	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}



	public int binarySearch (int numbers[] , int numberToSearchFor) {
		
		
		//int  sortedNumbers[]=sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
	
	
	// Search the Array
		
	// Return the result
		return 3;

}}
