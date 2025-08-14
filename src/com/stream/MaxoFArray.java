package com.stream;

import java.util.Arrays;

public class MaxoFArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,20,30,40};
		int max = Arrays.stream(arr)
				  .max()
				   .getAsInt();
		
		System.out.print("Max " + max);
		}

}
