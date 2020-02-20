package com.epam.house_construction_cost;
import java.util.Scanner;
public class Main extends HouseCostCalculation{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   HouseCostCalculation costObj = new HouseCostCalculation();
		
		Scanner input = new Scanner(System.in);
		String choice = "Y";
		while(choice.equals("Y") || choice.equals("y"))
		{
			int materialType;
			float totalArea;
			String automateData;
			double totalCost;
			
			System.out.println("Enter the type of material");
			System.out.println("1.Standard material\t2.Above standard material\n3.High standard"); 
			System.out.println("Enter your choice : ");
			materialType = input.nextInt();
			if(materialType == 3)
			{
				System.out.println("do you want Automated house or not? Y/N");
				automateData = input.next();
			}
			else
				automateData = "N";
			
			
			System.out.println("Enter total area of house ");
			totalArea = input.nextFloat();
			
			totalCost = costObj.calculateTotalHouseCost(totalArea,materialType,automateData);
			
			System.out.println("Cost of constructed house is : "+totalCost);
			System.out.println("Do you wnat to repeat? Y/N");
			choice = input.next();
	  }
		System.out.println("Thank you..");
		input.close();
	}

}
