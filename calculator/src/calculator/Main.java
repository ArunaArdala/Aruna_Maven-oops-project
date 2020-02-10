package calculator;

import java.util.Scanner;

import simplecalculator.CalculatorMethods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1,number2;
	     CalculatorMethods calObj = new CalculatorMethods();
	     Scanner sc = new Scanner(System.in);
	     char choice = 'Y';
	     while(choice == 'Y')
	     {
	    	System.out.println("Enter any two numbers : ");
	        number1 = sc.nextInt();
	        number2 = sc.nextInt();
	        System.out.println("1.Addition\n2.Subraction\n3.Division\n4.Multiplicaton");
	        System.out.println("Enter your choice : ");
	        int ch = sc.nextInt();
	        switch(ch)
	        {
	        case 1:  System.out.println(number1+" + "+number2+" = "+calObj.addition(number1, number2));
	        		 break;
	        case 2:  System.out.println(number1+" - "+number2+" = "+calObj.subraction(number1, number2));
	        		 break;
	        case 3:  System.out.println(number1+" / "+number2+" = "+calObj.division(number1, number2));
	        		  break;
	        case 4:  System.out.println(number1+" * "+number2+" = "+calObj.multiplication(number1,number2));
	        		 break;
	        default:
	        		System.out.println("oops!!.. you pressed wrong button");
	        		return;
	        }
	        System.out.println("Do you want to continue : Y/N ");
	        choice = sc.next().charAt(0);
	        if(choice == 'N')
	        	System.out.println("Thank you ");
	     }
	     sc.close();
	}

}
