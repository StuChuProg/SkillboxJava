public class TopManager extends Company implements Employee {
    private int salary;

    public TopManager(int salary){
        this.salary = (getIncome() > 10000000) ? ((salary /100 * 150) + salary) : salary;
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }
}
