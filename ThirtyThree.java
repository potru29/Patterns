public class ThirtyThree {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        char ch = 'a';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(ch + " ");

                if (Character.isLowerCase(ch)) {
                    ch = Character.toUpperCase(ch);
                } else {
                    ch = Character.toLowerCase(ch);
                }

                ch++;
            }

            System.out.println();
        }
    }
}
