package banking;

public class bankAccount {

    public int accountStatusNOW;
    public int cashWithdrawal;
    public int cashDeposit;

    public bankAccount(int accountStatusNOW) {
        this.accountStatusNOW = accountStatusNOW;
    }

    public int getAccountStatusNOW() {
        return accountStatusNOW;
    }

    public void setAccountStatusNOW(int accountStatusNOW) {
        this.accountStatusNOW = accountStatusNOW;
    }

    public void setDeposit(int cashDeposit) {
            this.accountStatusNOW = accountStatusNOW + cashDeposit;
    }

    public void setWithdrawal(int cashWithdrawal) {
        int x = 0;
        if(cashWithdrawal < accountStatusNOW){

       this.accountStatusNOW = accountStatusNOW - cashWithdrawal;
            }else {
            System.out.println("недостаточно средств на счете");
        }

    }
}
