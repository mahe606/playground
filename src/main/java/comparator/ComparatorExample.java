package comparator;


import java.util.Comparator;
import java.util.TreeSet;

/*write a program to insert integer objects into tree set where
* the sorting order is descending order */
public class ComparatorExample {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>(new MyComparator());
        tree.add(10);
        tree.add(0);
        tree.add(15);
        tree.add(5);
        tree.add(20);
        tree.add(20);

        System.out.println(tree);

    }
}

class MyComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        if(i1 < i2)
            return 1;
        else if (i1 > i2)
            return -1;
        return 0;
    }
}
