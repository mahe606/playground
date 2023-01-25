package interfaces;

public interface EmployeeRules {

     // All the variables are static final by default
     public int salary = 25000;
     public int leaves = 10;

     // All the methods are abstract by default
     void maintainHours();
     void relocate();
     void report();
     void dress();
}
