public class Manager extends Company implements Employee{
    private int salary;
    private Company company;


    public Manager(int salary, Company company)
    { this.company = company;

        this.salary = (salary+(company.getIncome()/200));
        System.out.println("Manager " + this.salary);
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }
}
