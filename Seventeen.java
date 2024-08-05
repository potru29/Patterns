public class Seventeen {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n) {
        for (int i = 1; i < 2 * n; i++) {
            int s = i <= n ? n - i : i - n;
            for (int j = 1; j <= s; j++) {
                System.out.print(" ");

            }
            int limit = i <= n ? i : 2 * n - i;
            for (int j = limit; j > 0; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= limit; j++) {
                System.out.print(j);
            }
            System.out.println();

        }

    }

}

/*
 * 1
 * 212
 * 32123
 * 4321234
 * 32123
 * 212
 * 1
 */