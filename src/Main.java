import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEARS = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How much is the principle?");
        double principle = scanner.nextDouble();

        System.out.println("How much is the annual interest rate?");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / MONTHS_IN_YEARS /PERCENT;

        System.out.println("How much is the period? (year) ");
        double years = scanner.nextDouble();
        double numberOfPayments = years * MONTHS_IN_YEARS;

        //System.out.println(principle+rate+months);
        //double mortgage = principle (rate(Math.pow(1+rate, months))/ (math.pow(1+rate,months)-1));
        double mortgage = principle
                * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments)
                / Math.pow(1+monthlyInterest, numberOfPayments)-1 );

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format();
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}