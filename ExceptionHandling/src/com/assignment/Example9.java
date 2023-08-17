package com.assignment;
//WAP to show 3 different scenario in which null pointer exceptions generated, and handle that 
//exception.
public class Example9 {
	public static void firstScenario() {
		try
		{
			// Checking if ptr.equals null or works fine.
			String ptr = null;
			// This line of code throws NullPointerException
			// because ptr is null
			if (ptr.equals("gfg"))
				System.out.print("Same");
			else
				System.out.print("Not Same");
		}
		catch(NullPointerException e)
		{
			System.out.print("NullPointerException Caught");
		}
	}
	public static void secondScenario() {
		try {
			String text = null;
			int length = text.length(); // This line may throw NullPointerException
			System.out.println("Length of text: " + length);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException caught: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("An unexpected error occurred: " + e.getMessage());
		}	
	}

	public static void thirdScenario() {
		Boolean value = null; // Simulate a null Boolean value

			
			if (value == null && value) {
				try {
			System.out.println("Exception");
			}
		 catch (NullPointerException e) {
			System.out.println("NullPointerException caught: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("An unexpected error occurred: " + e.getMessage());
		}
			}
			else {
				           System.out.println("Value is true");
	}
	}
	public static void main(String[] args) {


		System.out.println("First Scenario");
		firstScenario();
		System.out.println("\nSecond Scenario");
		secondScenario();
		System.out.println("Third Scenario");
		thirdScenario();
	}

}

