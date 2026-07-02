public class p10 {
    public static int isEven(int n) {
        if (n % 2 == 0) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int number = -6;
        System.out.println(isEven(number));
    }
}