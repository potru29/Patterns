public class TwentyEight {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int s = i < n ? n - i : i - n;
            for (int j = 1; j <= s; j++) {
                System.out.print(" ");
            }
            int star = i < n ? i : 2 * n - i;
            for (int j = 1; j <= star; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }

}
