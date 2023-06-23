package com.project;

public class Assignment2Ap {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String initialInvestmentInput = CollectInput(scanner, " what is the initial investment amount?");
		String interstRateInput = CollectInput(scanner, "what is the interst Rate?");

		double newBalance = Double.parseDouble(initialInvestmentInput);
		double interstRate = Double.parseDouble(interstRateInput);
		
		for(int i = 0; i < 6; i++) {
			calculateAndOutput(newBalance, interstRate, i);	
		}
		scanner.close();
	}

	private static double calculateAndOutput(double newBalance, double interstRate, int index) {
		for (int i = 0; i < 5; i++) {
			newBalance = newBalance * ( interstRate + 1.0);
		}
		System.out.println("after " +((index *5) + 5 )+ " years you would have " + Math.round (newBalance));
		return newBalance;

	}

	private static String CollectInput(Scanner scanner, String messegeToDisplayinConsole) {
		System.out.println(messegeToDisplayinConsole);
		String userInput = scanner.nextLine();
		return userInput;
	}

}	


