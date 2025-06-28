package Day_6;

class DemoThread extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread finished");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        DemoThread t = new DemoThread();
        t.start();
        t.join();
        System.out.println("Main thread resumes");
    }
}
