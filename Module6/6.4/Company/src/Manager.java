public class Manager extends Company implements Employee{
    private int salary;

    @Override
    public void setIncome(int income) {
        super.setIncome(income);
    }

    @Override
    public int getIncome() {
        return super.getIncome();
    }

    public Manager(int salary)
    {
        System.out.println(super.getIncome());
        this.salary = (salary+(super.getIncome()/200));
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }
}
