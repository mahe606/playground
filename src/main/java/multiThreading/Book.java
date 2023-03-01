package multiThreading;

public class Book {

    public void updateDB(){
        Runnable thread1 = ()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Updating DB from book class");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        thread1.run();
    }

}
