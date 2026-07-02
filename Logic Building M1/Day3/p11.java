public class p11 {
    public static int isOdd(int n) {
        if (n != 0 && n % 2 != 0) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int number = -7;
        System.out.println(isOdd(number));
    }
}