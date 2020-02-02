import banking.accountCard;
import banking.bankAccount;
import banking.savingsAccount;

public class Loader {
    public static void main (String[] args){
        savingsAccount ch1 = new savingsAccount(5200);

        ch1.setDeposit(100);
        ch1.setWithdrawal(300);

        System.out.println(ch1.getAccountStatusNOW());

        accountCard bill = new accountCard(365);
        bill.setDeposit(300);
        bill.setWithdrawal(100);
        System.out.println(bill.getAccountStatusNOW());

    }
}
