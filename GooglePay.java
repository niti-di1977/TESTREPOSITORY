package com.example.functionalexample;


//MAM -- Multiple Abstract Methods -- Normal Interface 
//SAM -- Single Abstract Methods -- functional Interface

@FunctionalInterface
public interface GooglePay {
	
	public int pay(int amount1 , int amount2);
	
     //Somebody wants to add some more functionality to this interface as per the requirement
	
	default void details1()
	{
		
		//implementation
	}
	
	default void details2()
	{
		
		//implementation
	}
	
	static void transaction1()
	{
		
		
	}

	static void transaction2()
	{
		
		// for transaction Purpose
	}

}

class Vendors
{
	public static void main(String[] args)
	{
	GooglePay gp = (a,b) -> // would not be able to create an object of interface  . we use lambda expression for that
	{
		
		return a+b;
	};
	
	System.out.println("Amazon Cost " + gp.pay(34,56));
	System.out.println("Swiggy Cost " + gp.pay(34,56));
	System.out.println("Recharge Cost " + gp.pay(34,56));

}
}
