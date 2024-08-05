public class TwentyNine {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int i = 1; i < 2 * n; i++) {
            int star = i < n ? i : 2 * n - i;
            for (int j = 1; j <= star; j++) {
                System.out.print("*");

            }
            int space = i < n ? 2 * (n - i) : 2 * (i - n);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");

            }
            int star1 = i < n ? i : 2 * n - i;
            for (int j = 1; j <= star1; j++) {
                System.out.print("*");

            }

            System.out.println();
        }
    }

}
