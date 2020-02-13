import java.util.ArrayList;

public class Loader {
    public static void main(String[] args) {

        Company company = new Company();
        company.setIncome(68_000_000);
       // System.out.println(company.getIncome());
       company.hireAll(180, new Operator(35000));
       company.hireAll(10, new TopManager(200000, company));
       company.hireAll(80, new Manager(6000, company));
        System.out.println("количество сотрудников " + (company.getSize() + 3));
        company.getTopSalaryStaff(15);
        System.out.println();
        company.fire(130, 50);
        System.out.println("количество сотрудников " + (company.getSize() + 3));
company.getTopSalaryStaff(15);
        System.out.println();
company.getLowestSalaryStaff(30);
    }


}
