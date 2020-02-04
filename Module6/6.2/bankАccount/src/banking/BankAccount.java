package banking;

import java.util.Date;

public class BankAccount {

    public int accountStatusNOW;
    private int cashWithdrawal;
    private int cashDeposit;
    private Date dateThis;

    public BankAccount(int accountStatusNOW) {
        this.accountStatusNOW = accountStatusNOW;
    }

    public int getAccountStatusNOW() {
        return accountStatusNOW;
    }

    public void setAccountStatusNOW(int accountStatusNOW) {
        this.accountStatusNOW = accountStatusNOW;
    }

    public void setDeposit(int cashDeposit)
    {        setDateThis();
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
    public void setDateThis(){
        this.dateThis = new Date();
    }
    public Date getDateThis(){
        return dateThis;
    }
}
