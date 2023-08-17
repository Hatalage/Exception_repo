package com.classPrograms;

import java.util.Scanner;

class VehicleSpeedException extends RuntimeException {
	public VehicleSpeedException(String msg)
	{
		super(msg);
	}
}
class SpeedCkeck {
	public void ckeckSpeed(int speed)
	{
		if(speed>80)
		{
			throw new VehicleSpeedException("Please slow your vehicle speed");
		}
		else
		{
			System.out.println("Your speed is correct!! keep going on");
		}
	}
}
public class VehicleException {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your speed");
	int speed =sc.nextInt();
	SpeedCkeck s = new SpeedCkeck();
	try {
		s.ckeckSpeed(speed);
	}
	catch(VehicleSpeedException e)
	{
		System.out.println("Message: "+e.getMessage());
	}
	System.out.println("---Thanks----");
}
}
