package banking;

public class NaturalPerson extends Client {
    public NaturalPerson(int accountStatusNOW) {
        super(accountStatusNOW);
    }
public void setAccountSatusNow(int accountSatusNow){
        super.setAccountStatusNOW(accountSatusNow);
}
    @Override
    public int getAccountStatusNOW() {
        return super.getAccountStatusNOW();
    }

    @Override
    public void setDeposit(int cashDeposit) {
        super.setDeposit(cashDeposit);
    }

    @Override
    public void setWithdrawal(int cashWithdrawal) {
        super.setWithdrawal(cashWithdrawal);
    }
}
