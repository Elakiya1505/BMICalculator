package day3;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your weight in pounds:");
		
		double weightInPounds = scanner.nextDouble();
		
		System.out.println("Enter your height in meters:");
		
		double height = scanner.nextDouble();
				
		//To convert kg into pounds
		
		double weightInKgs = weightInPounds*0.45359237;
		
		//BMI = Weight (kg)/Height (m^2)
		
		double bmi = weightInKgs / (height * height);
		
		System.out.println(bmi);
		
		if(bmi<18.5)
		{
			System.out.println("You are underweight!");
		}
		else if (bmi>=18.5 && bmi<=24.9)
		{
			System.out.println("You are normal!");
		}
		else if (bmi>=25 && bmi<29.9)
		{
			System.out.println("You are Overweight!");
		}
		else
		{
			System.out.println("You are Obese!");
		}
		
	}
				

}
