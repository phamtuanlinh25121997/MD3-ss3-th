package th2;

import java.util.Scanner;

public class TH2 {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interesRate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount:");
        money = scanner.nextDouble();
        System.out.println("Enter number of month");
        month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage");
        interesRate = scanner.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interesRate / 100) / 12 * month;
        }
        System.out.println("Total of interset: " + totalInterest);
    }
}
