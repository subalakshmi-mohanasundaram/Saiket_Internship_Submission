package Task1_Loan_EMI_Calculator;
import java.util.Scanner;

public class LoanEMICalculator{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount (P): ");
        double principal = sc.nextDouble();

        System.out.print("Enter Annual Interest Rate (%): ");
        double annualRate = sc.nextDouble();

        System.out.print("Enter Loan Tenure (in months): ");
        int months = sc.nextInt();

        // Convert annual interest rate to monthly rate
        double monthlyRate = annualRate / (12 * 100);

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                   / (Math.pow(1 + monthlyRate, months) - 1);

        
        System.out.printf("\nMonthly EMI Amount: %.2f\n", emi);

        sc.close();
    }
}
