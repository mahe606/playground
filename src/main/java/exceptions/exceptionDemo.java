package exceptions;

public class exceptionDemo {

    public static void main(String args[]) {
        exceptionDemo m1 = new exceptionDemo();

        try {
            int a[] = new int[5];
            a[1] = 10;
            a[2] = 30 / 10;
            a[3] = a[2] / (a[1] - 10);
            System.out.println("a[3] = " + a[3]);
            System.out.println("a[5] = " + a[5]);
        } catch (ArithmeticException e) {
            System.out.println("task1 is completed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("task 2 completed");
        }catch (Exception e) {
            System.out.println("common task completed " + e);
        }
        System.out.println("rest of the code...");
    }
}