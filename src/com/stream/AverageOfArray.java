package com.stream;

import java.util.Arrays;

public class AverageOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,20,30,40};
		double avg = Arrays.stream(arr)
				  .average()
				  .getAsDouble();
		
		System.out.print("avg " + avg);

	}

}
