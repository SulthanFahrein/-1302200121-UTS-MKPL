package lib;

import java.time.LocalDate;
import java.util.List;

public class salary extends Employee{
    private double monthlySalary;
    private double otherMonthlyIncome;
    private double annualDeductible;
    private int monthWorkingInYear;
    private LocalDate dateJoined;
    private String spouseIdNumber;
    private boolean isForeigner;
    private List<String> childIdNumbers;

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getOtherMonthlyIncome() {
        return otherMonthlyIncome;
    }

    public String getSpouseIdNumber() {
        return spouseIdNumber;
    }



    public void setMonthlySalary(int grade) {
        switch(grade) {
            case 1:
                monthlySalary = 3000000;
                if (isForeigner) {
                    monthlySalary *= 1.5;
                }
                break;
            case 2:
                monthlySalary = 5000000;
                if (isForeigner) {
                    monthlySalary *= 1.5;
                }
                break;
            case 3:
                monthlySalary = 7000000;
                if (isForeigner) {
                    monthlySalary *= 1.5;
                }
                break;
            default:
                System.out.println("Invalid grade input");
                break;
        }
    };

    public void setAnnualDeductible(double deductible) {
        this.annualDeductible = deductible;
    }

    public void setOtherMonthlyIncome(double income) {
        this.otherMonthlyIncome = income;
    }

    public double getAnnualIncomeTax() {

    
        LocalDate now = LocalDate.now();

        if (now.getYear() == dateJoined.getYear()) {
            monthWorkingInYear = now.getMonthValue() - dateJoined.getMonthValue();
        } else {
            monthWorkingInYear = 12;
        }

        return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible, spouseIdNumber == null || spouseIdNumber.isEmpty(), childIdNumbers.size());
    }

}
