public class Deadlock {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        A a = new A(o1, o2);
        B b = new B(o1, o2);
        a.start();
        b.start();
    }
}

class A extends Thread {
    Object o1;
    Object o2;

    public A(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o1) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("A ready");
            synchronized (o2) {
                System.out.println("A start");
            }
        }
    }
}

class B extends Thread {
    Object o1;
    Object o2;

    public B(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o2) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B ready");
            synchronized (o1) {
                System.out.println("B start");
            }
        }
    }
}