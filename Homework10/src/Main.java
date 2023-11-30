class LongProcessWorker implements Runnable{
    private long delay;
    public LongProcessWorker(long delay){
        this.delay = delay;
    }

    @Override
    public void run() {
        System.out.println("worker started. delay: " + delay + "mili");
        long startTime = System.currentTimeMillis();

        long sum = 0;
                while (System.currentTimeMillis() - startTime < delay) {
                    sum+= System.currentTimeMillis() % 1000;
                }
    }
}

public class Main {
    public static void main(String[] args) {


    LongProcessWorker worker1 = new LongProcessWorker(2000);
    LongProcessWorker worker2 = new LongProcessWorker(3000);
    LongProcessWorker worker3 = new LongProcessWorker(4000);

    Thread thread1 = new Thread(worker1);
    Thread thread2 = new Thread(worker2);
    Thread thread3 = new Thread(worker3);

    thread1.start();
    thread2.start();
    thread3.start();
    }
}