public class Question3 {
    public static void main(String[] args) {
        String num = "2552";
        System.out.println(num + " is palindrome: " + isPalindrome(num));
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}