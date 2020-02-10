import java.util.ArrayList;

public class Loader {
    public static void main(String[] args){
        ArrayList<Company> staff = new ArrayList();
        Company company = new Company();
       company.hire(new Operator(15000));

        System.out.println(staff.size());

    }


}
