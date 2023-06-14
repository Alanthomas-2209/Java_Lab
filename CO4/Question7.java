package java_lab.CO4;

class Services {
    int count;
    boolean valueState = false;
    public synchronized void putValue( int count) {
        while(valueState){
            try{ wait(); } catch(Exception e) {}
        }
        System.out.println("Produce :" + count);
        this.count = count;
        valueState = true;
        notify();
    }

    public synchronized  void getValue() {
        while(!valueState){
            try{ wait(); } catch (Exception e ){}
        }
        System.out.println("Consume :" + this.count);
        valueState = false;
        notify();
    }
}

class Producer implements Runnable {
    Services services;

    Producer(Services s) {
        this.services = s;
        Thread t = new Thread(this, "Produce");
        t.start();
    }

    public void run() {
        int i = 0;
        while (true) {
            services.putValue(i++);
            try{ Thread.sleep(2000);}catch (Exception e){}
        }
    }
}

class Consumer implements Runnable {
    Services services;
    Consumer (Services s) {
        this.services = s;
        Thread t = new Thread(this,"Consumer");
        t.start();
    }
    public void run(){
        while(true){
            services.getValue();
            try {Thread.sleep(2000);} catch (Exception e){}
        }
    }
}
public class Question7 {
    public static void main(String[] Args) {
        Services s = new Services();
        new Producer(s);
        new Consumer(s);
    }
}
