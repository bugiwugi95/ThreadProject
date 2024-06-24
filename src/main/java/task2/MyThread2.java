package task2;

public class MyThread2 implements Runnable {
    String name;

    MyThread2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 100; i++) {
                if (i % 10 == 0) {
                    Thread.sleep(300);
                    System.out.println(name + "-" + i);
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
