#Edgar Barrera / Github: https://github.com/EdgarCastillo101/EdgarCastillo101
# This was made for EDUCATIONAL PURPOSES ONLY

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte months_in_year = 12;
        final byte percent = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int Principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / percent / months_in_year;

        System.out.print("Period(Years): ");
        byte years = scanner.nextByte();
        int numberofPayments = years * months_in_year;

        double mortgage = Principal
                    * (monthlyInterest * Math.pow(1 + monthlyInterest, numberofPayments));
                    / (Math.pow(1 + monthlyInterest, numberofPayments) - 1);
        String mortgageFormatted = NumberFormat.getCompactNumberInstance().format(number);
        System.out.println("mortgage: " + mortgageFormatted);




    }
}
