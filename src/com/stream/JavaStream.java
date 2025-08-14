package com.stream;

import java.util.Arrays;

public class JavaStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sum of arr
		int [] arr = {10,20,30,40};
		int sum = Arrays.stream(arr)
				        .sum();
		
		System.out.print("Sum " + sum);

	}

}
