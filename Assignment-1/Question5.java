public class Question5 {
    public static void main(String[] args) {
        int n = 14;
        int k = n;

        for (int i = 1; i <= n; i++) {
            for (int j = k; j >= 1; j--) {
                System.out.print("*");
            }
            
            if (i == 1) {
                k = k / 2 - 1;
            } else if (i == n - 1) {
                k = k * 2;
            } else if (i < n / 2) {
                k--;
            } else {
                k++;
            }
            
            System.out.println();
        }
    }
}
