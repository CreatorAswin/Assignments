public class Question5 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println("Anagram: " + areAnagrams(s1, s2));
    }

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        
        int[] counts = new int[26];
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        
        for (int i = 0; i < s1.length(); i++) {
            counts[s1.charAt(i) - 'a']++;
            counts[s2.charAt(i) - 'a']--;
        }
        
        for (int count : counts) {
            if (count != 0) return false;
        }
        return true;
    }
}