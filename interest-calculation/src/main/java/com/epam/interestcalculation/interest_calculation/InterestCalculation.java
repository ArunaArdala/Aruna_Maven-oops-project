package com.epam.interestcalculation.interest_calculation;

public class InterestCalculation {
		public float simpleInterestCalculation(float P,float T,float R)
		{
			return P*R*T/100;
		}

		public double compoundInterestCalculation(float P,float n,float r,float t)
		{
			return (P*Math.pow((1+r/n),r*n));
		}
		
	}