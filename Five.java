public class Five {
    public static void main(String[] args) {
        pattern(4);

    }

    static void pattern(int n) {
        for (int i = 0; i <= 2 * n; i++) {
            int col = i > n ? 2 * n - i - 1 : i;
            for (int j = 0; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}

/*
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
 */