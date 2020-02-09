import java.util.ArrayList;

public class Loader {
    public static void main(String[] args){
        ArrayList<Company> staff = new ArrayList();
        Company.hire(new Manager(35000));
        Company.hireAll(32, new Operator(10000));

        System.out.println(staff.size());

    }

}
