public class TwentyFour {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }
            if (i > 1) {
                int con = i <= n ? i - 2 : 2 * n - i - 1;
                for (int j = 1; j <= con; j++) {
                    System.out.print(" ");
                }
            }
            if (i > 1 && i < 2 * n) {
                System.out.print("*");

            }
            int con1 = i < n ? 2 * (n - i) : 2 * (i - n) - 2;
            for (int j = 1; j <= con1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 1) {
                int con = i <= n ? i - 2 : 2 * n - i - 1;
                for (int j = 1; j <= con; j++) {
                    System.out.print(" ");
                }
            }
            if (i > 1 && i < 2 * n) {
                System.out.print("*");

            }

            System.out.println();
        }
    }

}

/*
 * *
 ** **
 * * * *
 * * * *
 * ** *
 * ** *
 * * * *
 * * * *
 ** **
 * *
 */