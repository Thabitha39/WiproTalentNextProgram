public class p13 {
    public static int secondLastDigit(int n) {
        int absN = Math.abs(n);
        if (absN < 10) {
            return -1;
        }
        return (absN / 10) % 10;
    }

    public static void main(String[] args) {
        int number = -197;
        System.out.println(secondLastDigit(number));
    }
}