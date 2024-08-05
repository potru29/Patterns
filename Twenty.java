public class Twenty {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - 1; j++) {
                if (i == 1 || i == n || j == 1 || j == n - 1) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }

}

/*
 ****
 * *
 * *
 * *
 ****
 */
