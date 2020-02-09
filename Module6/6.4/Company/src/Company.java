import java.util.ArrayList;

public class Company
{    private int income;
    private int salary;
    private static ArrayList<Employee> staff;

    private int count;

    public Company(int income) {
        this.income = income;
    }

    public Company() {
    }

    public int getIncome() {
        return income;
    }
    public static void hire(Employee employee) {
        staff.add(employee);
    }
    public static void hireAll(int count, Employee employee) {
        for (int i = 1; i < count; i++){
        staff.add(employee);}
    }
    public static void fire(Employee employee){
        staff.remove(employee);
    }
    public static void fire(int count, Employee employee){
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
