package banking;

public class IndividualEntrepreneur extends Client {
    public IndividualEntrepreneur(int accountStatusNOW) {
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
    public void setWithdrawal(int cashWithdrawal) {
        super.setWithdrawal(cashWithdrawal - cashWithdrawal/100);
    }

    @Override
    public void setDeposit(int cashDeposit) {
        if (cashDeposit < 1000){
        super.setDeposit(cashDeposit-cashDeposit/100);}
        else {
            super.setDeposit(cashDeposit - cashDeposit/200);
        }
    }
}
