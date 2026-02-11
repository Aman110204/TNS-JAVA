package tnsif.accenture.c2tc.multithreading;

class Eclipse2 extends Thread {
    public void run() {
        System.out.println(
            "Eclipse id " + " " + Thread.currentThread().getId()
        );
    }
}

class OneNote2 extends Thread {
    public void run() {
        System.out.println(
            "OneNote id " + " " + Thread.currentThread().getId()
        );
    }
}

class Chrome2 extends Thread {
    public void run() {
        System.out.println(
            "Chrome id " + " " + Thread.currentThread().getId()
        );
    }
}

public class ThreadPriorityDemo {

    public static void main(String[] args) {

        Eclipse2 obj = new Eclipse2();
        obj.setPriority(Thread.MAX_PRIORITY);
        obj.start();

        OneNote2 obj1 = new OneNote2();
        obj1.setPriority(Thread.MIN_PRIORITY);
        obj1.start();

        Chrome2 obj2 = new Chrome2();
        obj2.setPriority(Thread.NORM_PRIORITY);
        obj2.start();

        System.out.println(
            "Main method " + " " + Thread.currentThread().getId()
        );
    }
}
