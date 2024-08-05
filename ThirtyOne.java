import java.math.*;

public class ThirtyOne {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n) {
        int original = n + 1;
        for (int i = 1; i < 2 * n; i++) {
            for (int j = 1; j < 2 * n; j++) {
                int num = original - Math.min(Math.min(i, j), Math.min(2 * n - i, 2 * n - j));
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
