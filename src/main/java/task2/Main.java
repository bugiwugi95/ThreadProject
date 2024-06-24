package task2;


public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new MyThread2("MyThread" + " (" + i + ")"));
            thread.start();

        }

    }
}