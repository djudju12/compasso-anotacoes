public class Main {

    static final double TARGET = 0.5;
    static final double PRECISION = 0.000000001;

    static double result = 0;
    public static void main(String[] args) {

        Runnable runnable = () -> result = generateNumber();
        Thread thread2 = new Thread(runnable);
        thread2.start();
        double precision = difference(result);
        try {
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("The computer returned a value of: " + result);
        System.out.println("The value was generated to a precision of : " + precision);
    }

    public static double generateNumber() {
         double number = Math.random();

         double diff = difference(number);
         while (diff > PRECISION) {
             number = Math.random();
             diff = difference(number);
         }

         return number;
    }

    public static double difference(double number) {
        return Math.abs(TARGET - number);
    }
}
