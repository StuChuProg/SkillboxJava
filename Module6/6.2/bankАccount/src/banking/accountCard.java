package banking;

public class accountCard extends bankAccount {
    @Override
    public int getAccountStatusNOW() {
        return super.getAccountStatusNOW();
    }

    @Override
    public void setAccountStatusNOW(int accountStatusNOW) {
        super.setAccountStatusNOW(accountStatusNOW);
    }

    @Override
    public int getDeposit(int cashDeposit) {
        return super.getDeposit(cashDeposit);
    }

    @Override
    public int getWithdrawal(int cashWithdrawal) {
        return (int) (super.getWithdrawal(cashWithdrawal) - cashWithdrawal * 0.01);
    }
}
