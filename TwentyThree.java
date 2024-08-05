public class TwentyThree {
    public static void main(String[] args) {
        pattern(3);
    }

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            int s = (i - 1) * 2 - 1;
            for (int j = 1; j <= s; j++) {
                System.out.print(" ");
            }
            if (i > 1) {
                System.out.print("*");
            }
            int space = (n - i) * 2 - 1;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            if (i < 3) {
                System.out.print("*");
            }
            int s1 = (i - 1) * 2 - 1;
            for (int j = 1; j <= s1; j++) {
                System.out.print(" ");
            }
            if (i > 1) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
