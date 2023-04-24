package java_lab.CO4;
import java.util.LinkedList;

class ProducerConsumer {
    private final LinkedList<Integer> buffer = new LinkedList<>();
    private final int Capacity = 5;
    
    public void produce() throws InteruptedException {
        int value = 0;
        while(true) {
            synchronized (this) {
                while( buffer.size() == Capacity){
                    wait();
                }
                System.out.println("Producer produced-" + value);
                buffer.add(value++);
                notify();
                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException {
        while(true) {
            synchronized (this) {
                while (buffer.isEmpty()) {
                    wait();
                }
                int val = buffer.removeFirst();
                System.out.println("Consumer consumed-" + val);
                notify();
                Thread.sleep(1000);
            }
        }
    }
}

public class Question7 {

    public static void main(String[] Args) {
        ProducerConsumer pc = new ProducerConsumer();
        Thread producerThread = new Thread(() -> {
            try {
                pc.produce();
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
           try {
               pc.consume();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
        });
        producerThread.start();
        consumerThread.start();
    }

}
