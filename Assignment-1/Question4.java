public class Question4 {
    public static void main(String[] args) {
        int n = 14;
        int left = 1, right = n;

        for (int i = 1; i <= 8; i++) {
            int extra = 0;

            for (int j = 1; j <= n; j++) {
                if (j <= left || i == 8) {
                    System.out.print("*");
                } else if (j == right) {
                    System.out.print("*");
                    extra = 1;
                } else if (j == right + extra) {
                    System.out.print("*");
                    extra++;
                } else {
                    System.out.print(" ");
                }
            }
            left++;
            right--;
            System.out.println();
        }
    }
}
