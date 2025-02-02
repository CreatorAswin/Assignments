public class Question6 {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println("Pangram: " + isPangram(sentence));
    }

    public static boolean isPangram(String str) {
        boolean[] marks = new boolean[26];
        str = str.toLowerCase();
        
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                marks[c - 'a'] = true;
            }
        }
        
        for (boolean mark : marks) {
            if (!mark) return false;
        }
        return true;
    }
}