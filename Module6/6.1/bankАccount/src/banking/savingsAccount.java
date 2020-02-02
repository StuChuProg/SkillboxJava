package banking;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class savingsAccount extends bankAccount {

    public savingsAccount(int accountStatusNOW) {
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
   Calendar calendar = Calendar.getInstance();
    Date dateDep;
    public void setDeposit(int cashDeposit){
        dateDep = new Date();
        this.accountStatusNOW = accountStatusNOW + cashDeposit;
    }
    public Date getNextDate(Date date){
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, 1);
        Date dateNext = calendar.getTime();
        return dateNext;
    }
    public void setWithdrawal(int cashWithdrawal){
        Date dateNow = new Date();
        if(dateNow.after(getNextDate(dateDep))){
            this.accountStatusNOW = accountStatusNOW - cashWithdrawal;
        }else {
            System.out.println("Срок выдачи денег не пришел!");
        }

    }


}
