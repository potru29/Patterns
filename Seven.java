public class Seven {
    public static void main(String[] args) {
        pattern(5);

    }

    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int s = 1; s <= row - 1; s++) {
                System.out.print(" ");
            }
            for (int j = row; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

/*
  
 *****
  ****
   ***
    **
     *
 */