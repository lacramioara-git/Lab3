package ro.mta.facc.slab;

public class MyThread extends Thread {
    public MyThread() {
    }

    @Override
    public void run() {

    System.out.println("Hello from: "+ Thread.currentThread().getName());

    }
}
