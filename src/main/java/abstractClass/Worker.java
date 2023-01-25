package abstractClass;

import java.util.ArrayList;
import java.util.List;

public abstract class Worker {

    public abstract void work();

    public void gatLeaves(){

        System.out.println("12 days of leave");
    }


    List<String> str = new ArrayList<>();
}
