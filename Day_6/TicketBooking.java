package Day_6;

class TicketBooking extends Thread {
    static int tickets = 5;

    public synchronized void bookTicket(String user) {
        if (tickets > 0) {
            System.out.println(user + " booked 1 ticket.");
            tickets--;
        } else {
            System.out.println("No tickets left for " + user);
        }
    }

    public void run() {
        bookTicket(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        TicketBooking tb1 = new TicketBooking();
        TicketBooking tb2 = new TicketBooking();
        tb1.setName("User1");
        tb2.setName("User2");
        tb1.start();
        tb2.start();
    }
}
