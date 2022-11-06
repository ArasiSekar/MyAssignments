package week2.day4.polymorphism;

public class AxisBank extends BankInfo{
	/*
	 * Method Overriding Concept
	 * Class     :AxisBank
     Methods :deposit()

Description:
You have to override the method deposit in AxisBank.
	 */
	
	public void deposit()
	{
		System.out.println("Derived Class : AxisBank");
		System.out.println("Deposit rat of Axis: 9%");
	}

	public static void main(String[] args) {
		
		 AxisBank axisObj=new AxisBank();
		 axisObj.deposit();

	}

}
