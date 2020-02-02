import banking.bankAccount;

public class Loader {
    public static void main (String[] args){
        bankAccount ch1 = new bankAccount();
        ch1.setAccountStatusNOW(10000);
        ch1.getDeposit(100);
        ch1.getWithdrawal(300);
        System.out.println(ch1.getAccountStatusNOW());

    }
}
