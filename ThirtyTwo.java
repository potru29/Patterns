public class ThirtyTwo {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (char ch = (char) ('A' + n - i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

}
