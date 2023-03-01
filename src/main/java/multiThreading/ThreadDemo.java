package multiThreading;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable book = ()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Updating DB from book class");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1 = new Thread(book);
        t1.start();
        Thread note = new Note();
        note.start();
    }
}
