package com.epam.interestcalculation.interest_calculation;
import java.util.Scanner;
public class Main extends InterestCalculation{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterestCalculation calObj = new InterestCalculation();
		Scanner input = new Scanner(System.in);
		String choice = "Y";
		while(choice.equals("Y"))
		{
			System.out.println("Do you want to calculate 1.Simple Interest or 2.Compound Interest\n");
			int ch;
			ch = input.nextInt();
			 float principleAmount;
			   int term,rate;
			System.out.println("Enter the Principle amount : ");
			   principleAmount = input.nextFloat();
			   System.out.println("Enter the term of the loan : ");
			   term = input.nextInt();
			   System.out.println("Enter the rate of the interest : ");
			   rate = input.nextInt();
			switch(ch)
			{
			case 1:
				   
				   System.out.println("Simple Interest is : "+calObj.simpleInterestCalculation(principleAmount,term,rate));
				   break;
				   
			case 2:
				   int n;
				   System.out.println("Enter the number of time interest is compunded in a year : ");
				   n = input.nextInt();
				   System.out.println("Compound Interest is :"+calObj.compoundInterestCalculation(principleAmount,n,rate,term));
				   break;
		   default : System.out.println("oops!.. You pressed wrong button");
		   			 return;
				   
			}
			System.out.println("Do you want to conntinue? Y/N");
			choice = input.next();
		}
		System.out.println("Thank you...");
		 input.close();
	}

}
