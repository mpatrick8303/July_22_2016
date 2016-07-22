package com.week1.day5.assignment1;

public class MethodsAndFlow
{
	
	private String[] stringArray;
	
	
	public MethodsAndFlow(String[] stringArray)
	{
		this.stringArray = stringArray;
	}

	
	public void outputSubset(int startPosition, int numberOfValues)
	{
		if(stringArray.length >= (startPosition + numberOfValues))
		{
			for(int i=startPosition; i<(startPosition+numberOfValues);i++)
			{
				System.out.println(stringArray[i]);
			}
			System.out.println();
		}
		else
		{
			System.out.println("You are outside of the array");
			System.out.println();
		}
	}
	
	public void outputAll()
	{
		for(int i=0;i<stringArray.length;i++)
		{
			System.out.println(stringArray[i]);
		}
	}
	
	
	
}
