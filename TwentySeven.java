public class TwentySeven {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n) {
        int left = 1;
        int rightStart = n * (n + 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // Print numbers on the left side
            for (int j = 0; j < n - i; j++) {
                System.out.print(left + " ");
                left++;
            }
            if (i != n - 1) {
                System.out.print("  ");
            }
            int currentrightstart = rightStart - (n - i) + 1;
            rightStart -= n - i;
            for (int j = n - i - 1; j >= 0; j--) {
                System.out.print(currentrightstart++ + " ");
            }
            System.out.println();

        }

    }
}
