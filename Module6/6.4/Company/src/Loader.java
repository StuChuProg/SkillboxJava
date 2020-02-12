import java.util.ArrayList;

public class Loader {
    public static void main(String[] args) {

        Company company = new Company();
        company.setIncome(68000000);
       // System.out.println(company.getIncome());
       company.hireAll(3, new Operator(20000));
       company.hireAll(3, new TopManager(150000));
       company.hireAll(4, new Manager(10000));
      //  company.fire(10, 8);

company.getTopSalaryStaff(5);
        System.out.println();
company.getLowestSalaryStaff(5);
    }


}
