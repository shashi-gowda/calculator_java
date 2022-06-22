package thistimereal;

import java.util.Scanner;

public class mini_calculator_project {
	
	public static void main(String[] args) {
		
		float num1, num2;
		
		System.out.println("please enter the first number: ");
		Scanner scan1 = new Scanner(System.in);
		num1=scan1.nextFloat();
		
		System.out.println("please enter the second number: ");
		Scanner scan2 = new Scanner(System.in);
		num2 = scan2.nextFloat();
		
		System.out.print("you have entered ");
		System.out.print(num1);
		System.out.print(" and ");
		System.out.println(num2);
		
		String prompt = "Enter 0 for addition, 1 for Subtraction, "
				+ "2 for multipliction, 3 for division";
		System.out.println(prompt);
		
		int input = scan1.nextInt();
		
		switch(input) {
			case 0:
				System.out.println("adding these 2 numbers: ");
				System.out.println(num1+num2);
				break;
			case 1:
				System.out.println("subtracting these 2 numbers: ");
				System.out.println(num1-num2);
				break;
			case 2:
				System.out.println("multiplying these 2 numbers: ");
				System.out.println(num1*num2);
				break;
			case 3:
				System.out.println("dividing these 2 numbers: ");
				System.out.println(num1/num2);
				break;
				
			default:
				System.out.println("invalid input! ");
				
		
		}
		
		
	}

}
