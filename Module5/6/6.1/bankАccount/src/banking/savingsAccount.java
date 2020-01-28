package banking;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class savingsAccount extends bankAccount{
    @Override
    public int getAccountStatusNOW() {
        return super.getAccountStatusNOW();
    }

    @Override
    public void setAccountStatusNOW(int accountStatusNOW) {
        super.setAccountStatusNOW(accountStatusNOW);
    }

    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
   Date dateDep = null;



    public int getDeposit() {
        return accountStatusNOW + cashDeposit;
    dateDep = new Date();
    }

    Date dateNOW = new Date();
          if((dateNOW - dateDep)>(24 * 60 * 60 * 1000*30)){

    public int getWithdrawal()
    {
        return super.getWithdrawal();
    }}
    else{
        System.out.println("Срок выдачи денег не пришел! Вы не можете снять средства!");   }
}
