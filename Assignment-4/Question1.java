public class Question1 {
    public static void main(String[] args) {
        String input = "hello world";
        System.out.println("Original: " + input);
        System.out.println("Without duplicates: " + removeDuplicates(input));
    }

    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256];
        
        for (char c : str.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                sb.append(c);
            }
        }
        return sb.toString();
    }
}