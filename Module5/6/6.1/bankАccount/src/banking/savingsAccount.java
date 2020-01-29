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
 

Calendar calendar = Calendar.getInstance();
    Date dateDep;

    public Date getNextDate() {
        calendar.setTime(dateDep);
        calendar.add(Calendar.MONTH, 1);
        Date dateNext = calendar.getTime();
        return dateNext;
    }

    public int getDeposit() {
        return accountStatusNOW + cashDeposit;
//        dateDep = calendar.getTime();
        dateDep = new Date();
    }

    Date dateNow = new Date();

    if (dateNow.after(getNextDate(dateDep)) == true)    {
        public int getWithdrawal() {
            return accountStatusNOW - cashWithdrawal;
        }
    }
    else
    {
        System.out.println("Срок выдачи денег не пришел! Вы не можете снять средства!");
    }
}
