package multiThreading;

public class Note extends Thread{
    public void run()  {
        for (int i = 0; i < 5; i++) {
            System.out.println("Updating DB from Note class");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
