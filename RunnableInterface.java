// concurrency - multiple task start, stop, execute in overlapping time interval
// resource efficient
// creating threads using the runnable interface in java

class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Shooting with rifle!");
            i++;
        }
    }
}
class MyRunnable2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Throwing Grenade!");
            i++;
        }
    }
}
class MyRunnable3 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Taking Cover!");
            i++;
        }
    }
}
public class RunnableInterface {
    public static void main(String[] args) {
    MyRunnable1 r1 = new MyRunnable1();
    Thread rifle = new Thread(r1);
    MyRunnable2 r2 = new MyRunnable2();
    Thread grenade = new Thread(r2);
    MyRunnable3 r3 = new MyRunnable3();
    Thread cover = new Thread(r3);

    rifle.start();
    grenade.start();
    cover.start();
    }
}
