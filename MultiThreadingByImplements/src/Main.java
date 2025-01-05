//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
          MultiThreading multiThreading = new MultiThreading();
          Thread thread1 = new Thread(multiThreading);
          Thread thread2 = new Thread(multiThreading);
          thread1.start();
          thread2.start();
          System.out.println(Thread.currentThread().getName());

    }
}