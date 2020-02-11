import java.util.ArrayList;

public class Loader {
    public static void main(String[] args) {

        Company company = new Company(680000000);
        System.out.println(company.getIncome());
        company.hireAll(180, new Operator(20000));
        company.hireAll(80, new Manager(20000));
        company.hireAll(10, new TopManager(150000));
        System.out.println(company.getSize());
        company.fire(100, 80);
        System.out.println(company.getSize());

    }


}
