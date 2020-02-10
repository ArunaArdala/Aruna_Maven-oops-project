package simplecalculator;

public class CalculatorMethods {

		public int addition(int num1, int num2)
		{
			return num1+num2;
		}
		public int subraction(int num1,int num2)
		{
			return num1-num2;
		}
		public int multiplication(int num1,int num2)
		{
			return num1*num2;
		}
		public double division(int num1,int num2)
		{
			double num  = 0.0;
			try {
				 num =  num1/num2;
			}
			catch(ArithmeticException ae) {
				System.out.println("Division by zero is not possible");
			}
				return num;
		}
	  
	}
