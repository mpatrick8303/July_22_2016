package com.week1.day5.assignment1;

public class TestMethodsAndFlow
{
	
	
	
	public static void main(String[] args)
	{
		
		
		MethodsAndFlow data = new MethodsAndFlow(args);
		
		data.outputSubset(2,1);
		data.outputSubset(3, 4);
		data.outputSubset(0, 3);
		data.outputSubset(9, 10);
		
		
		System.out.println(data.outputAll());
	}
}
