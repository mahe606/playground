package main.java.jetblue;

import java.util.ArrayList;
import java.util.List;

public class EmpSalary {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        Employee a = new Employee("Mahesh", "100", 4000);
        Employee b = new Employee("Ram", "101", 2000);
        Employee c = new Employee("Ravi", "102", 7000);
        empList.add(a);
        empList.add(b);
        empList.add(c);
        System.out.println(getMaxSalary(empList).getEmpNameName());

    }


    public static Employee getMaxSalary(List<Employee> list){

        Employee emp = null;
        int maxSal = 0;
        for(Employee e:list){
            if(e.getSalary() > maxSal){
                maxSal = e.getSalary();
                emp = e;
            }
        }
        return emp;
    }
}
