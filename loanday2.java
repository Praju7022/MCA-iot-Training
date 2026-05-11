class Loan {
    int loanId;
    String userName;
    double loanAmount;
    int totalEmis;
    double emiAmount;
    int paidEmis;

    
    Loan(int loanId, String userName, double loanAmount, int totalEmis) {
        this.loanId = loanId;
        this.userName = userName;
        this.loanAmount = loanAmount;
        this.totalEmis = totalEmis;
        this.paidEmis = 0;

        this.emiAmount = loanAmount / totalEmis;
    }

    
    void viewLoanDetails() {
        System.out.println("Loan ID: " + loanId);
        System.out.println("User Name: " + userName);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("EMI Amount: " + emiAmount);
        System.out.println("Total EMIs: " + totalEmis);
        System.out.println("Paid EMIs: " + paidEmis);
        System.out.println("Remaining EMIs: " + checkBalanceEmis());
    }

    
    void payEmi() {
        if (paidEmis < totalEmis) {
            paidEmis++;
            System.out.println("EMI Paid Successfully");
        } else {
            System.out.println("All EMIs already paid");
        }
    }

    
    int checkBalanceEmis() {
        return totalEmis - paidEmis;
    }
}


public class loanday2 {
    public static void main(String[] args) {

        Loan loan1 = new Loan(101, "Prajwal", 60000, 6);

        loan1.viewLoanDetails();

        System.out.println("\n--- Paying EMI ---");
        loan1.payEmi();
        loan1.payEmi();

        System.out.println("\n--- Updated Details ---");
        loan1.viewLoanDetails();    
    }
}