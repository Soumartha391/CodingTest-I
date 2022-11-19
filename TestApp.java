package pone;


import java.util.*;

class Employee implements Comparable<Employee> {
    private String empName;
    private int empId;
    private double empSalary;
    private List<EmpAddress> empAdd;

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                ", empSalary=" + empSalary +
                ", empAdd=" + empAdd +
                '}';
    }

    public String getEmpName() {

        return empName;
    }

    public Employee() {

        super();
    }

    public Employee(String empName, int empId, double empSalary, List<EmpAddress> empAdd) {
        super();
        this.empName = empName;
        this.empId = empId;
        this.empSalary = empSalary;
        this.empAdd = empAdd;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {

        this.empId = empId;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public List<EmpAddress> getEmpAdd() {
        return empAdd;
    }

    public void setEmpAdd(List<EmpAddress> empAdd) {
        this.empAdd = empAdd;
    }

    @Override
    public int compareTo(Employee o) {
        return (int) (this.getEmpSalary() - o.getEmpSalary());
    }
}
class EmpNameSort implements Comparator<Employee>
{

    @Override
    public int compare(Employee o1, Employee o2) {

        return o1.getEmpName().compareTo(o2.getEmpName());
    }
}

class EmpIdSort implements Comparator<Employee>
{

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getEmpId() < o2.getEmpId()) {
            return -1;
        } else if (o1.getEmpId() > o2.getEmpId()) {
            return 1;
        } else {
            return 0;
        }
    }

}
public class TestApp {
    public static void main(String[] args) {
        ArrayList<Employee> e = new ArrayList<>();
        e.add(new Employee("Ramesh", 11, 50000, Arrays.asList(new EmpAddress(101, "Park Street", "kolkata", "WestBengal", 700058))));
        e.add(new Employee("Sandeep", 12, 40000, Arrays.asList(new EmpAddress(102, "Marine Arena", "Mumbai", "Maharashtra", 400089))));
        e.add(new Employee("Mehek", 13, 60000, Arrays.asList(new EmpAddress(103, "Rohini", "Noida", "Delhi", 200075))));
        e.add(new Employee("Aishik", 14, 80000, Arrays.asList(new EmpAddress(104, "Singroli Area", "Bhopal", "Madhya Pradesh", 500002))));

        System.out.println("Collection of Employee object before applying sorting algo: ");
        for (Employee temp : e) {
            System.out.println(temp.getEmpName() + " " + temp.getEmpId() + " " + temp.getEmpSalary() + " " + temp.getEmpAdd());
        }
        System.out.println("*****\n\n******");
        System.out.println("Collection of Employee object after applying Sorting using comparable on SALARY");
        Collections.sort(e);
        for (Employee temp : e) {
            System.out.println(temp.getEmpName() + " " + temp.getEmpId() + " " + temp.getEmpSalary() + " " + temp.getEmpAdd());
        }
        System.out.println("*****\n\n******");
        System.out.println("Collection of Employee object after applying Sorting using comparable on NAME");
        EmpNameSort nameSort = new EmpNameSort();
        Collections.sort(e, nameSort);
        for (Employee temp : e) {
            System.out.println(temp.getEmpName() + " " + temp.getEmpId() + " " + temp.getEmpSalary() + " " + temp.getEmpAdd());
        }
        System.out.println("*****\n\n******");
        System.out.println("Collection of Employee object after applying Sorting using comparable on EMPLOYEE ID");
        EmpIdSort idSort = new EmpIdSort();
        Collections.sort(e, idSort);
        for (Employee temp : e) {
            System.out.println(temp.getEmpName() + " " + temp.getEmpId() + " " + temp.getEmpSalary() + " " + temp.getEmpAdd());
        }
    }
}





