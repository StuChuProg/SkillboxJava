import java.util.ArrayList;

public class Company implements Employee
{    private int income;
    private int salary;
    ArrayList<Employee> staff;
    private int count;

    public Company(int income) {
        this.income = income;
    }

    public Company() {
    }

    public int getIncome() {
        return income;
    }
    public void hire(Employee employee) {
        staff.add(employee);
    }
    public void hireAll(int count, Employee employee) {
        for (int i = 0; i < count; i++){
        staff.add(employee);}
    }
    public void fire(Employee employee){
        staff.remove(employee);
    }

//    public ArrayList<Employee> getTopSalaryStaff(int count) {
//        if ()
//            return null;
//    }
//
//    public ArrayList<Employee> getLowestSalaryStaff(int count) {
//        return null;
//    }

    public class Manager implements Employee
    {
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
    public class Operator implements Employee{
        private int salary;
        public Operator(int salary){
            this.salary = salary;
        }
        @Override
        public int getMonthSalary() {
            return salary;
        }
    }
    public class TopManager implements Employee{
        private int salary;

        public TopManager(int salary){
            this.salary = (getIncome() > 10000000) ? salary /100 * 150 + salary : salary;
        }

        @Override
        public int getMonthSalary() {
            return salary;
        }
    }
}
