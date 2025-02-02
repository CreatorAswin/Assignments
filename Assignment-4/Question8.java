public class Question8 {
    public static void main(String[] args) {
        String input = "abracadabra";
        System.out.println("Max occurring character: " + findMaxOccurringChar(input));
    }

    public static char findMaxOccurringChar(String str) {
        int[] counts = new int[256];
        int max = -1;
        char result = ' ';
        
        for (char c : str.toCharArray()) {
            counts[c]++;
            if (counts[c] > max) {
                max = counts[c];
                result = c;
            }
        }
        return result;
    }
}