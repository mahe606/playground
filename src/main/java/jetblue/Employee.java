package jetblue;

public class Employee {
    private String empName;
    private String id;
    private int salary;

    public Employee(String empName, String id, int salary) {
        this.empName = empName;
        this.id = id;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String name) {
        this.empName = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
