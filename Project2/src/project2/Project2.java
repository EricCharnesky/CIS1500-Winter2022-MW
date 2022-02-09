
package project2;


public class Project2 {

    public static void main(String[] args) {
        int totalIncome = askUserToEnterIncomes();
        int totalDeductions = askUserToEnterTotalDeductions();
        totalDeductions = pickLargerOfDeductionsOrStandardDeduction(totalDeductions);
        
        int adjustedGrossIncome = totalIncome - totalDeductions;
        
        int taxesOwedAt10Percent = calculatedTaxesForBracket(.1, 0, 9950, adjustedGrossIncome);
        //...//
        
        // TODO
    }
    
    public static int calculatedTaxesForBracket(double taxRate, 
            int startOfBracket, int endOfBracket, int incomeToTax){
        // TODO
        // either none, all, or some
        return 0;
    }
    
    public static int askUserToEnterIncomes(){
        // TODO
        return 0;
    }
    
    public static int askUserToEnterTotalDeductions(){
        // TODO
        return 0;
    }
    
    public static int pickLargerOfDeductionsOrStandardDeduction(int totalDeductions){
        // TODO
        return 0;
    }
    
}
