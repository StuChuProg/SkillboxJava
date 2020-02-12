public class TopManager extends Company implements Employee {
    private int salary;
    @Override
    public void setIncome(int income) {
        super.setIncome(income);
    }

    @Override
    public int getIncome() {
        return super.getIncome();
    }

    public TopManager(int salary){
        if (getIncome() > 10000000){
        this.salary = salary + salary /100 * 150 ;
    }else
    this.salary = salary;}


    @Override
    public int getMonthSalary() {
        return salary;
    }
}
