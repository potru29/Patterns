public class TwentyFive {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= 2; j++) {
                if (i == 2 || i == 3) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("*");

            System.out.println();

        }
    }

}
