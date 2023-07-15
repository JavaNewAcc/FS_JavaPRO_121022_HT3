package task.one;

public class Bank {

    private int creditAmount;
    private double interestRate;
    private String creditInstitution;
    private double result;

    public double interestAmountCalculator(){
        result=creditAmount*interestRate/100;
        return result;
    }

    @SuperAnnotation(creditAmount = 300000,creditInstitution = "Privatbank")
    public String infoPrinter(int creditAmount, double interestRate, String creditInstitution){
        return creditInstitution+" offers credit with limit "+creditAmount+"UAH, interest rate of "+interestRate+"% p.a. ("+(creditAmount*interestRate/100)+"UAH of interest each year)";
    }
}
