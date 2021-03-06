package banking;

import java.util.Date;

public class accountCard extends bankAccount {
    public accountCard(int accountStatusNOW) {
        super(accountStatusNOW);
    }

    @Override
    public int getAccountStatusNOW() {
        return super.getAccountStatusNOW();
    }

    @Override
    public void setAccountStatusNOW(int accountStatusNOW) {
        super.setAccountStatusNOW(accountStatusNOW);
    }

    public void setDeposit(int cashDeposit){
        this.accountStatusNOW = accountStatusNOW + cashDeposit;
    }

    @Override
    public void setWithdrawal(int cashWithdrawal) {
       this.accountStatusNOW = accountStatusNOW - (cashWithdrawal + cashWithdrawal/100);
    }
}
