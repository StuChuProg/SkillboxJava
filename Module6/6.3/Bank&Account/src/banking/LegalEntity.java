package banking;

public class LegalEntity extends Client {
    public LegalEntity(int accountStatusNOW) {
        super(accountStatusNOW);
    }

    @Override
    public void setAccountStatusNOW(int accountStatusNOW) {
        super.setAccountStatusNOW(accountStatusNOW);
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
        super.setWithdrawal(cashWithdrawal - cashWithdrawal/100);
    }
}
