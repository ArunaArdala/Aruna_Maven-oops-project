package com.epam.house_construction_cost;

public class HouseCostCalculation {
	public int calculateCostPerSqrt(int materialType,String automateData)
		  {
			  if(materialType == 1)
				  return 1200;
			  else if(materialType == 2)
				  return 1500;
			  else if(materialType == 3)
			  {
				  if(automateData.equals("N"))
					  return 1800;
				  else
					  return 2500;
			  }
			  else if(materialType == 4)
				  return 2500;
			  else
			  {
				  return 0;
			  }
		  }
		  
		  public double calculateTotalHouseCost(float totalArea,int materialType,String automateData)
		  {
			 return totalArea*(calculateCostPerSqrt(materialType,automateData));
		  }
	}
