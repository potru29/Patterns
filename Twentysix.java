public class Twentysix {
    public static void main(String[] args) {
        pattern(6);
    }

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }

}

/*
 * 1 1 1 1 1 1
 * 2 2 2 2 2
 * 3 3 3 3
 * 4 4 4
 * 5 5
 * 6
 * 
 */