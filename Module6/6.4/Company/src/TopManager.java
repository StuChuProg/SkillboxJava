public class TopManager extends Company implements Employee {
    private int salary;
    private Company company;

    public TopManager(int salary, Company company){

        this.company = company;
        if (company.getIncome() > 10_000_000){

            this.salary = salary + salary /100 * 150 ;
            System.out.println("top " + this.salary);
        }else

        this.salary = salary;
        System.out.println("top " + this.salary); }


    @Override
    public int getMonthSalary() {
        return salary;
    }
}
