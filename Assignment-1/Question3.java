public class Question3 {
    public static void main(String[] args) {
        int n = 14;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n || 
                    (i <= 5 && (j >= 10 - i && j <= 10 + i))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
