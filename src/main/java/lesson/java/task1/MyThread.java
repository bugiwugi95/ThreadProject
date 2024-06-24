package lesson.java.task1;

public class MyThread extends Thread {
    public char ch;

    public int count = 100;

    MyThread(char ch) {
        this.ch = ch;

    }

    MyThread(char ch, int count) {
        this.ch = ch;
        this.count = count;

    }

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 1; i <= count; i++) {
                Thread.sleep(200);
                System.out.println(ch + "-" + i);

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
