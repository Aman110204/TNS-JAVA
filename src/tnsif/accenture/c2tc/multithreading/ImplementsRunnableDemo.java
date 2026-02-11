package tnsif.accenture.c2tc.multithreading;

class Eclipse1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(
                "Eclipse id " + Thread.currentThread().getId()
            );
        }
    }
}

public class ImplementsRunnableDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Eclipse1());
        Thread t2 = new Thread(new Eclipse1());

        t1.start();
        t2.start();
    }
}
