# BMICalculator
BMI Calculator app in Java

A simple console application that calculates Body Mass Index (BMI) from a user's weight in pounds and height in meters. It converts the weight to kilograms, calculates BMI, and prints a category message using conditional statements.

Features:
- Reads user input using java.util.Scanner.
- Converts pounds to kilograms.
- Calculates and displays BMI using double values.
- Prints a category message based on the calculated value.
  
Requirements:
- A Java Development Kit (JDK) installed.
- The java and javac commands available in your terminal.
- No external libraries are required.
  
Setup and Run:
1. Save the supplied Java code as day3/BMICalculator.java inside your project folder. The day3 directory matches the package day3; declaration.
2. Open a terminal in the project folder, which contains the day3 directory.
3. Compile the program:
   javac day3/BMICalculator.java
4. Run it from the same folder:
   java -cp . day3.BMICalculator
   
How It Works:
1. Enter your weight in pounds.
2. Enter your height in meters.
3. The program converts the weight and calculates BMI:
   Weight in kilograms = Weight in pounds × 0.45359237
   BMI = Weight in kilograms / (Height in meters × Height in meters)
4. It prints the numeric BMI, followed by a category message.
   
Example:
Enter 150 for weight and 1.75 for height. The calculated BMI is approximately 22.22, followed by:
You are normal!
The program prints the raw double value, so the numeric output contains more decimal places than this example.
Category Logic in the Current Code
Condition	Printed message
bmi < 18.5	You are underweight!
bmi >= 18.5 && bmi <= 24.9	You are normal!
bmi >= 25 && bmi < 29.9	You are Overweight!
Any value not matched above	You are Obese!


This table documents the program's behavior. The current conditions leave a gap between 24.9 and 25, and the overweight branch excludes 29.9. For example, both 24.95 and 29.9 reach the final else branch and print You are Obese!.

Current Limitations:
- Performs one calculation per run.
- Does not validate that weight and height are positive, finite numbers.
- A zero height can produce Infinity or NaN rather than a useful result.
- Non-numeric input is not handled and can terminate the program with an InputMismatchException.
- Does not round or format the displayed BMI.
  
Possible Improvements:
- Correct the category boundaries so the ranges are continuous.
- Validate input and allow the user to retry invalid entries.
- Format BMI to two decimal places.
- Add a loop for repeated calculations.
- Correct the conversion comment to // Convert pounds to kilograms.
  
Concepts Practiced:
- Console input and output.
- Variables and the double data type.
- Arithmetic and unit conversion.
- Comparison and logical operators.
- if, else if, and else statements.
