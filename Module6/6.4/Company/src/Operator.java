public class Operator extends Company implements Employee{
    private int salary;
    public Operator(int salary){
        this.salary = salary;
    }
    @Override
    public int getMonthSalary() {
        return salary;
    }
}
