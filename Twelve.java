public class Twelve {
    public static void main(String[] args) {
        pattern(5);

    }

    static void pattern(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            int space = i > n ? 2 * n - i : i - 1;
            for (int s = 1; s <= space; s++) {
                System.out.print(" ");
            }
            int col = i > n ? i - n : n - i + 1;
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

/*
 * * * * *
 * * * *
 * * *
 * *
 *
 *
 * *
 * * *
 * * * *
 * * * * *
 */