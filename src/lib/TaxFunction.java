package lib;

public class TaxFunction {

	public static double calculateTax(double monthlySalary, double otherMonthlyIncome, int monthWorkingInYear, double annualDeductible, boolean isMarried, int numberOfChildren) {
		double annualIncome = calculateAnnualIncome(monthlySalary, otherMonthlyIncome, monthWorkingInYear);
		double taxableIncome = calculateTaxableIncome(annualIncome, annualDeductible);
		double taxAmount = calculateTaxAmount(taxableIncome);
	
		if (isMarried) {
			taxAmount = calculateMarriedTaxDeduction(taxAmount);
		}
	
		taxAmount = calculateChildTaxDeduction(taxAmount, numberOfChildren);
	
		double monthlyTax = calculateMonthlyTax(taxAmount);
	
		return monthlyTax;
	}
	
	private static double calculateAnnualIncome(double monthlySalary, double otherMonthlyIncome, int monthWorkingInYear) {
		return (monthlySalary + otherMonthlyIncome) * monthWorkingInYear;
	}
	
	private static double calculateTaxableIncome(double annualIncome, double annualDeductible) {
		double taxableIncome = annualIncome - annualDeductible;
		if (taxableIncome <= 0) {
			return 0;
		}
		return taxableIncome;
	}
	
	private static double calculateTaxAmount(double taxableIncome) {
		double taxAmount;
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
		if (taxAmount < 0) {
			return 0;
		}
		return taxAmount;
	}
	
	private static double calculateMarriedTaxDeduction(double taxAmount) {
		return taxAmount - 4500000;
	}
	
	private static double calculateChildTaxDeduction(double taxAmount, int numberOfChildren) {
		return taxAmount - (numberOfChildren * 2250000);
	}
	
	private static double calculateMonthlyTax(double taxAmount) {
		return taxAmount / 12;
	}
}