public class Variables {
    public static void main(String[] args) {
        int passengers = 5; 
        System.out.println(passengers);

        int busTickers = passengers;
        System.out.println(busTickers);

        // Se passar do maximo da compile erro
        // int maxValue = 3000000000;
        // System.out.println(maxValue);
        // Variables.java:11: error: integer number too large
    }
}