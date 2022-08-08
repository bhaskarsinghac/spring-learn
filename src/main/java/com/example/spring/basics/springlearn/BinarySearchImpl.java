package com.example.spring.basics.springlearn;

// here we have a BinarySearchAlgorithm which uses bubble sort to sort the array and find the number.
// Tight coupling is present.BubbleSortAlgorithm class is directly being instantiated by the the BinartSearchImpl class.
// BubbleSortAlgorithm is a dependency of BinarySearchImpl

public class BinarySearchImpl {
	
	public int binarySearch (int numbers[] , int numberToSearchFor) {
		
		BubbleSortAlgorithm bsa=new BubbleSortAlgorithm();
		int [] sortedNumbers=bsa.sort(numbers);
		
	
	// Sorting the Array
	// Search the Array
		
	// Return the result
		return 3;

}}
