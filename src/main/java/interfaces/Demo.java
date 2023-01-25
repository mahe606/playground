package interfaces;

public class Demo {
    public static void main(String[] args) {
        ABCEmployee abcEmployee = new ABCEmployee();
        abcEmployee.relocate();
        System.out.println(ABCEmployee.salary);
        System.out.println(EmployeeRules.leaves);
        abcEmployee.spendTimeWithFamily();
        abcEmployee.dress();


        // Dynamic Binding
        FamilyRules father = new ABCEmployee();
        father.spendTimeWithFamily();


    }
}
