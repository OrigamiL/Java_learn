public class ThreadTest implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + "---->" + i);
        }
    }

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        Thread thread = new Thread(new ThreadTest());
        thread.setName("t");
        thread.start();
        for (int i = 0; i < 50; i++) {
            System.out.println(t.getName()+"--->" + i);
        }
    }
}
