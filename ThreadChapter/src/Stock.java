import java.awt.*;
import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class Stock {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Producer producer = new Producer(arrayList);
        Consumer consumer = new Consumer(arrayList);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();
    }

}

class Producer implements Runnable {
    private final ArrayList<Integer> arrayList;

    public Producer(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public void run() {
        while (true) {
            synchronized (arrayList) {
                if (arrayList.size() >= 10) {
                    try {
                        System.out.println("生产者等待");
                        arrayList.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                arrayList.add(1);
                System.out.println("生产一个产品");
                arrayList.notifyAll();
            }
        }
    }
}

class Consumer implements Runnable {

    private final ArrayList<Integer> arrayList;

    public Consumer(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public void run() {
        while (true) {
            synchronized (arrayList) {
                if (arrayList.size() < 10) {
                    try {
                        System.out.println("消费者等待");
                        arrayList.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //
                arrayList.remove(0);
                System.out.println("消费一个产品");
                arrayList.notifyAll();
            }
        }
    }
}
