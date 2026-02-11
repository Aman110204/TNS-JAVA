package tnsif.accenture.c2tc.multithreading;

class Eclipse extends Thread {
    public void run() {
        System.out.println("Eclipse running: " + Thread.currentThread().getId());
    }
}

class OneNote extends Thread {
    public void run() {
        System.out.println("OneNote running: " + Thread.currentThread().getId());
    }
}

class Chrome extends Thread {
    public void run() {
        System.out.println("Chrome running: " + Thread.currentThread().getId());
    }
}

public class ExtendingThreadsDemo {
    public static void main(String[] args) {
        new Eclipse().start();
        new OneNote().start();
        new Chrome().start();
    }
}
