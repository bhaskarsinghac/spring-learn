package com.example.spring.basics.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) {
		BinarySearchImpl bs=new BinarySearchImpl(new QuickSortAlgorithm());
		int res=bs.binarySearch(new int[] {2,4,5,6}, 5);
		System.out.println(res);
		
		
	}

}
