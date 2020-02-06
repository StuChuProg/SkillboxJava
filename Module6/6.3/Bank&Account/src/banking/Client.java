package banking;

import java.util.Date;

public abstract class Client {
    private int accountStatusNOW;
    private int cashWithdrawal;
    private int cashDeposit;


    public Client(int accountStatusNOW) {
        this.accountStatusNOW = accountStatusNOW;
    }

    public  int getAccountStatusNOW(){
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
        if (cashWithdrawal < accountStatusNOW) {
            this.accountStatusNOW = accountStatusNOW - cashWithdrawal;
        } else {
            System.out.println("недостаточно средств на счете");
        }
    }
}
