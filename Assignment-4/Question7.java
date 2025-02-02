public class Question7 {
    public static void main(String[] args) {
        String input = "abcdefg";
        System.out.println("All unique: " + hasAllUnique(input));
    }

    public static boolean hasAllUnique(String str) {
        boolean[] seen = new boolean[256];
        for (char c : str.toCharArray()) {
            if (seen[c]) return false;
            seen[c] = true;
        }
        return true;
    }
}