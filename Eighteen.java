public class Eighteen {
    public static void main(String[] args) {
        pattern(5);

    }

    static void pattern(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            int star = i > n ? i - n : n - i + 1;
            for (int j = 1; j <= star; j++) {
                System.out.print("*");

            }
            if (i < n) {
                for (int j = n + i; j <= 2 * n; j++) {
                    System.out.print("*");
                }

            }

            System.out.println();
        }
    }

}

/*
 **********
 **** ****
 *** ***
 ** **
 * *
 * *
 ** **
 *** ***
 **** ****
 **********
 */
