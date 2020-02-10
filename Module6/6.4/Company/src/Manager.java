public class Manager extends Company implements Employee{

    private int salary;

    public Manager(int salary)
    {
        this.salary = salary + (getIncome()/200);
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }
}
