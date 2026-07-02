public class p12 {
    public static int lastDigit(int n) {
        return Math.abs(n % 10);
    }

    public static void main(String[] args) {
        int number = -197;
        System.out.println(lastDigit(number));
    }
}