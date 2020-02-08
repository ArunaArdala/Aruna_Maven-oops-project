package com.project.maven_demo;

import java.util.ArrayList;
import java.util.Collections;
import  java.util.Scanner;

public class New_yeargift implements Sweets,Chocolates,Candies
{
	static int totalWeight = 0;
	static int weightRange = 0;
	//From chocolate class 
	public int calculateChocolateWeight(int sweetsCount, int weight)
	{
		if(weight<=weightRange)
			return sweetsCount*weight;
		else
			return 0;
		
	}
	public ArrayList<Integer> chocolateSort(ArrayList<Integer> ar)
	{
		Collections.sort(ar);
		return ar;
	}
	//From Sweet class
	public int calculateSweetWeight(int chocolatesCount, int weight)
	{
		if(weight <= weightRange)
			return chocolatesCount*weight;
		else
			return 0;
	}
	//From Candies class
	public int calculateCandiesWeight(int candiesCount, int weight)
	{
		if( weight <= weightRange)
			return candiesCount*weight;
		else
			return 0;
	}
	public static void main(String args[])
	{
	
		Scanner input = new Scanner(System.in);
	
		int no_of_chocolates,no_of_sweets,no_of_candies ;
		
		System.out.println("Enter the no of chocolates : \n");
		no_of_chocolates = input.nextInt();
				
		System.out.println("Enter the no of sweets :\n ");
		no_of_sweets = input.nextInt();
		
		System.out.println("Enter the no of candies : \n");
		no_of_candies = input.nextInt();
		
		Chocolates chocoObj = new New_yeargift();
		Sweets     sweetsObj[] = new New_yeargift[no_of_sweets];
		Candies    candyObj = new New_yeargift();
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		for(int i=0; i<no_of_chocolates; i++)
		{
			int weight,count;
			
			System.out.println("Enter your choice :\n");
			System.out.println("1.Milky Bar 2.Dariy Milk 3. Five Star\n");
			int ch = input.nextInt();
			if(ch == 1)
		    	weightRange = 30;
		    else if(ch == 2)
		    	weightRange = 20;
		    else
		    	weightRange = 20;
			System.out.println("Enter its count and its weight\n");
			weight = input.nextInt();
			count = input.nextInt();
			
			ar.add(chocoObj.calculateChocolateWeight(count,weight));	
			totalWeight += chocoObj.calculateChocolateWeight(count, weight);
		}
		ArrayList<Integer> sortedArray = chocoObj.chocolateSort(ar);
		System.out.println("The Chocolates are sorted according to their weights : ");
		for(int ele : sortedArray)
		{
			System.out.print(ele+" ");
		}
		System.out.println();
		for (int i=0; i<no_of_sweets; i++)
		{
			int count,weight;
			
			sweetsObj[i] = new New_yeargift();
			System.out.print("Enter your choice : \n");
			System.out.println("1.Laddu 2.Halwa 3.GulabJam\n");
			int ch = input.nextInt();
			if(ch == 1)
		    	weightRange = 50;
		    else if(ch == 2)
		    	weightRange = 30;
		    else
		    	weightRange = 50;
			
			System.out.println("Enter its count and its weight\n");
			
			count = input.nextInt();
			weight = input.nextInt();
			
			totalWeight += sweetsObj[i].calculateSweetWeight(count,weight);
		}
		
		for(int i=0; i<no_of_candies; i++)
		{
			int count,weight;
			
			System.out.println("Enter your choice : \n");
			System.out.println("1.MangoBit 2.Jolly Ranchers 3.Milk Duds\n");
		    int ch = input.nextInt();
		    if(ch == 1)
		    	weightRange = 30;
		    else if(ch == 2)
		    	weightRange = 30;
		    else
		    	weightRange = 20;
		    
			System.out.println("Enter its count and its weight\n");
			
			count = input.nextInt();
			weight = input.nextInt();
			
			totalWeight += candyObj.calculateCandiesWeight(count,weight);
		}
		System.out.println("Total weight is : "+totalWeight);
		
		input.close();
	}
}
