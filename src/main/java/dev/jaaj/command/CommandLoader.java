package dev.jaaj.command;

public class CommandLoader implements Runnable {

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("running...");
        }
        System.out.println("interrupted");

    }

}
