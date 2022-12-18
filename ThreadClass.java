
    class MyThread1 extends Thread{
        @Override
        public void run() {
            int i = 0;
            while (i < 100) {
                System.out.println("Cooking thread is running");
                i++;
            }
        }
    }
    class MyThread2 extends Thread{
        @Override
        public void run() {
            int i = 0;
            while (i < 100) {
                System.out.println("Chatting thread is running");
                i++;
            }
        }
    }
    public class ThreadClass {

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
