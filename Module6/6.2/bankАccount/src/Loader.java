import banking.AccountCard;
import banking.SavingsAccount;


public class Loader {
    public static void main (String[] args){
        SavingsAccount ch1 = new SavingsAccount(5200);

        ch1.setDeposit(100);
        ch1.setWithdrawal(300);

        System.out.println(ch1.getAccountStatusNOW());

        AccountCard bill = new AccountCard(365);
        bill.setDeposit(300);
        bill.setWithdrawal(100);
        System.out.println(bill.getAccountStatusNOW());

    }
}
