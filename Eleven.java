public class Eleven {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= i - 1; s++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
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
 */