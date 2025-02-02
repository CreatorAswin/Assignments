public class Question2 {
    public static void main(String[] args) {
        String input = "programming";
        System.out.println("Duplicates in '" + input + "':");
        printDuplicates(input);
    }

    public static void printDuplicates(String str) {
        int[] counts = new int[256];
        for (char c : str.toCharArray()) {
            counts[c]++;
        }
        
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 1) {
                System.out.println((char) i + " - " + counts[i] + " times");
            }
        }
    }
}