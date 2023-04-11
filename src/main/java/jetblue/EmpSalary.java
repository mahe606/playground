package jetblue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmpSalary {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        Employee a = new Employee("Mahesh", "100", 4000);
        Employee b = new Employee("Ram", "101", 2000);
        Employee c = new Employee("Ravi", "102", 7000);
        empList.add(a);
        empList.add(b);
        empList.add(c);
        System.out.println(getMaxSalary(empList).getEmpName());
        System.out.println(getMaxSalaryStream(empList).getEmpName());
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

    public static Employee getMaxSalaryStream(List<Employee> list){
        Optional<Employee> salary = list.stream().max(Comparator.comparingInt(Employee::getSalary));
        return salary.get();
    }


}
