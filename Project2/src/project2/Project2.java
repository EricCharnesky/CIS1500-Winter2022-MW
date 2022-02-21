package project2;

import java.util.Scanner;

public class Project2 {

    public static final int STANDARD_DEDUCTION = 25_100;
    public static final int START_OF_10_PERCENT_BRACKET = 0;
    public static final int START_OF_12_PERCENT_BRACKET = 19_900;
    public static final int START_OF_22_PERCENT_BRACKET = 81_050;
    public static final int START_OF_24_PERCENT_BRACKET = 172_750;
    public static final int START_OF_32_PERCENT_BRACKET = 329_850;
    public static final int START_OF_35_PERCENT_BRACKET = 418_850;
    public static final int START_OF_37_PERCENT_BRACKET = 628_300;

    public static void main(String[] args) {
        int totalIncome = askUserToEnterIncomes();
        int totalDeductions = askUserToEnterTotalDeductions();
        totalDeductions = pickLargerOfDeductionsOrStandardDeduction(totalDeductions);

        int adjustedGrossIncome = totalIncome - totalDeductions;

        double taxesOwedAt10Percent = calculatedTaxesForBracket(.1, START_OF_10_PERCENT_BRACKET, START_OF_12_PERCENT_BRACKET, adjustedGrossIncome);
        double taxesOwedAt12Percent = calculatedTaxesForBracket(.12, START_OF_12_PERCENT_BRACKET, START_OF_22_PERCENT_BRACKET, adjustedGrossIncome);
        double taxesOwedAt22Percent = calculatedTaxesForBracket(.22, START_OF_22_PERCENT_BRACKET, START_OF_24_PERCENT_BRACKET, adjustedGrossIncome);
        double taxesOwedAt24Percent = calculatedTaxesForBracket(.24, START_OF_24_PERCENT_BRACKET, START_OF_32_PERCENT_BRACKET, adjustedGrossIncome);
        double taxesOwedAt32Percent = calculatedTaxesForBracket(.32, START_OF_32_PERCENT_BRACKET, START_OF_35_PERCENT_BRACKET, adjustedGrossIncome);
        double taxesOwedAt35Percent = calculatedTaxesForBracket(.35, START_OF_35_PERCENT_BRACKET, START_OF_37_PERCENT_BRACKET, adjustedGrossIncome);
        double taxesOwedAt37Percent = calculatedTaxesForBracket(.37, START_OF_37_PERCENT_BRACKET, Integer.MAX_VALUE, adjustedGrossIncome);

        double totalTaxesOwed = taxesOwedAt10Percent + taxesOwedAt12Percent + taxesOwedAt22Percent
                + taxesOwedAt24Percent + taxesOwedAt32Percent + taxesOwedAt35Percent + taxesOwedAt37Percent;

        double taxesOwedAsPercentageOfGrossIncome = totalTaxesOwed / totalIncome;
        double taxesOwedAsPercentageOfAdjustedGrossIncome = totalTaxesOwed / adjustedGrossIncome;

        System.out.println("Taxes owed at 10%: " + taxesOwedAt10Percent);
        System.out.println("Taxes owed at 12%: " + taxesOwedAt12Percent);
        System.out.println("Taxes owed at 22%: " + taxesOwedAt22Percent);
        System.out.println("Taxes owed at 24%: " + taxesOwedAt24Percent);
        System.out.println("Taxes owed at 32%: " + taxesOwedAt32Percent);
        System.out.println("Taxes owed at 35%: " + taxesOwedAt35Percent);
        System.out.println("Taxes owed at 37%: " + taxesOwedAt37Percent);

        System.out.println("Total taxes owed: " + totalTaxesOwed);
        System.out.println("Taxes as % of gross income: " + taxesOwedAsPercentageOfGrossIncome * 100);
        System.out.println("Taxes as % of adjusted gross income: " + taxesOwedAsPercentageOfAdjustedGrossIncome * 100);

    }

    public static double calculatedTaxesForBracket(double taxRate,
            int startOfBracket, int endOfBracket, int incomeToTax) {

        if (incomeToTax < startOfBracket) {
            return 0;
        } else if (incomeToTax > endOfBracket) {
            return (endOfBracket - startOfBracket) * taxRate;
        }
        return (incomeToTax - startOfBracket) * taxRate;
    }

    public static int askUserToEnterIncomes() {
        int totalIncome = 0;

        int income = 1;

        while (income != 0) {
            income = askForAnInt("Enter an income to add to the total or 0 to be done");
            totalIncome += income;
        }

        return totalIncome;
    }

    public static int askUserToEnterTotalDeductions() {
        int totalDeductions = 0;

        int deduction = 1;

        while (deduction != 0) {
            deduction = askForAnInt("Enter a deduction to add to the total or 0 to be done");
            totalDeductions += deduction;
        }

        return totalDeductions;
    }

    public static int pickLargerOfDeductionsOrStandardDeduction(int totalDeductions) {
        if (totalDeductions > STANDARD_DEDUCTION) {
            return totalDeductions;
        }
        return STANDARD_DEDUCTION;
    }

    //https://github.com/EricCharnesky/CIS1500-Winter2022-MW/blob/main/Lab6/src/lab6/Lab6.java#L60
    public static int askForAnInt(String prompt) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(prompt);
        int value = Integer.parseInt(keyboard.nextLine());
        return value;
    }

}
