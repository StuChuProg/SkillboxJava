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


    @Override
    public int getDeposit(int cashDeposit) {
        Date dateDep = ; //здесь хотелось бы дату которая присваивается в основном классе присвоить dateDep, но не понимаю как
        return super.getDeposit(cashDeposit);
    }


    public Date getNextDate(Date date) {
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, 1);
        Date dateNext = calendar.getTime();
        return dateNext;
    }

    public int getWithdrawal() {
        Date dateNow = new Date();
        int x = 0;
        if (dateNow.after(getNextDate(dateDep))) {
            x = accountStatusNOW - cashWithdrawal;
        } else {
            System.out.println("Срок выдачи денег не пришел!");
        }
        return x;
    }


}
