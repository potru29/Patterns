public class ThirtyFour {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (char ch = (char) ('E' - i + 1); ch >= 'A'; ch--) {
                System.out.print(ch + " ");

            }
            System.out.println();

        }

    }

}
