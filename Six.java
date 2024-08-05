public class Six {
    public static void main(String[] args) {
        pattern(5);

    }

    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int s = 1; s <= n - row; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/* 
         *
        **
       ***
      ****
     *****

*/