package banking;

import java.util.Date;

public class bankAccount {

   protected int accountStatusNOW;
   protected int cashWithdrawal;
   protected int cashDeposit;
   protected Date dateThis;

    public int getAccountStatusNOW() {
        return accountStatusNOW;
    }

    public void setAccountStatusNOW(int accountStatusNOW) {
        this.accountStatusNOW = accountStatusNOW;
    }

    public int getDeposit(int cashDeposit) {
        setDateThis();
        return accountStatusNOW + cashDeposit;
    }

    public int getWithdrawal(int cashWithdrawal) {
        return accountStatusNOW - cashWithdrawal;
    }
    protected void setDateThis(){
        dateThis = new Date();
    }
    public Date getDateThis(){
        return dateThis;
    }
}
