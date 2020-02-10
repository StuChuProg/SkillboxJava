import java.util.ArrayList;

public class Company
{
    private int income;
    private int salary;
    private  ArrayList<Employee> staff = new ArrayList<>();

    private int count;

    public Company(int income) {
        this.income = income;
    }

    public void setCount(int count) {
        this.count = count;
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
        for (int i = 1; i < count; i++){
        staff.add(employee);}
    }
    public void fire(Employee employee){
        staff.remove(employee);
    }
    public  void fire(int count, Employee employee){
        for (int i = 1; i < count; i++){
        staff.remove(employee);}
    }

//    public ArrayList<Employee> getTopSalaryStaff(int count) {
//        if ()
//            return null;
//    }


//
//    public ArrayList<Employee> getLowestSalaryStaff(int count) {
//        return null;
//    }





}
