package lib;

public class TaxFunction {


	
	public static double calculateTax(double monthlySalary, double otherMonthlyIncome, int monthWorkingInYear, double annualDeductible, boolean isMarried, int numberOfChildren) {
		double annualIncome = (monthlySalary + otherMonthlyIncome) * monthWorkingInYear;
		double taxableIncome = annualIncome - annualDeductible;
	
		if (taxableIncome <= 0) {
			return 0;
		}
	
		double taxAmount = 0;
		if (taxableIncome <= 50000000) {
			taxAmount = taxableIncome * 0.05;
		} else if (taxableIncome <= 250000000) {
			taxAmount = 2500000 + ((taxableIncome - 50000000) * 0.15);
		} else if (taxableIncome <= 500000000) {
			taxAmount = 32500000 + ((taxableIncome - 250000000) * 0.25);
		} else if (taxableIncome <= 1000000000) {
			taxAmount = 95000000 + ((taxableIncome - 500000000) * 0.3);
		} else {
			taxAmount = 345000000 + ((taxableIncome - 1000000000) * 0.35);
		}
	
		if (isMarried) {
			taxAmount -= 4500000;
		}
	
		taxAmount -= numberOfChildren * 2250000;
	
		if (taxAmount < 0) {
			return 0;
		}
	
		double monthlyTax = taxAmount / 12;
	
		return monthlyTax;
	}
	
}
