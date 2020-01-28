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
    public int getDeposit() {
        return super.getDeposit();
    }

    @Override
    public int getWithdrawal() {
        return (int) (super.getWithdrawal() - cashWithdrawal * 0.01);
    }
}
