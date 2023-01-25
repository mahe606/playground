package interfaces;

public class ABCEmployee implements EmployeeRules, FamilyRules {


    @Override
    public void maintainHours() {
        System.out.println("");
    }

    @Override
    public void relocate() {
        System.out.println("relocate");
    }

    @Override
    public void report() {
        System.out.println("report");
    }

    @Override
    public void dress() {
        System.out.println("dress");
    }

    @Override
    public void helpFamily() {
        System.out.println("Help family");
    }

    @Override
    public void spendTimeWithFamily() {
        System.out.println("Spent time with family");
    }
}
