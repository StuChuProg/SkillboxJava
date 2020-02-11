import java.util.ArrayList;

public class Company
{
    private int income;
    private  ArrayList<Employee> staff = new ArrayList<>();

    private int count;
    private int place;

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
    public void fire(int place){
        staff.remove(place);
    }
    public  void fire(int count, int place){
        for (int i = 1; i < count; i++){
        staff.remove(place);}
    }
    public int getSize(){
        return staff.size();
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
