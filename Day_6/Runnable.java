package Day_6;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Message from Runnable");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}

