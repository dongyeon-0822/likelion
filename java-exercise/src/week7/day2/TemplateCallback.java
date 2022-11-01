package week7.day2;

public class TemplateCallback {
    boolean isPrime(int num, StatementStrategy stmt) {
        for (int i = 2; stmt.compare(i, num); i++) {
            System.out.println(i);
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallback tcp = new TemplateCallback();
        System.out.println(tcp.isPrime(13, (a, b)-> a < b));
        System.out.println(tcp.isPrime(17, (a, b)-> a < b/2));
        System.out.println(tcp.isPrime(19, (a, b)-> a * a < b));
    }
}
