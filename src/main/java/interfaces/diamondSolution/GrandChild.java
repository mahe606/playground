package interfaces.diamondSolution;

public class GrandChild implements Parent1, Parent2{
    @Override
    public void fun() {
        Parent1.super.fun();
        Parent2.super.fun();
        System.out.println("Grand Child");
    }
}
