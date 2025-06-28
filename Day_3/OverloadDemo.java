package Day_3;

class OverloadDemo {
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();
        System.out.println(obj.sum(5, 10));
        System.out.println(obj.sum(3.5, 6.7));
    }
}
