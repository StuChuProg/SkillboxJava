package banking;

public class bankAccount {

    int accountStatusNOW;
    int cashWithdrawal;
    int cashDeposit;

    public int getAccountStatusNOW() {
        return accountStatusNOW;
    }

    public void setAccountStatusNOW(int accountStatusNOW) {
        this.accountStatusNOW = accountStatusNOW;
    }

    public int getDeposit() {
        return accountStatusNOW + cashDeposit;
    }

    public int getWithdrawal() {
        return accountStatusNOW - cashWithdrawal;
    }
}
