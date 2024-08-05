public class Sixteen {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s < n - i + 1; s++) {
                System.out.print(" ");
            }
            int number = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j);
            }
            System.out.println();
        }
    }

}

/*
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 */