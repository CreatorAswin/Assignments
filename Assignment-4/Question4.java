public class Question4 {
    public static void main(String[] args) {
        String input = "Hello! How are you?";
        countCharacters(input);
    }

    public static void countCharacters(String str) {
        int vowels = 0, consonants = 0, specials = 0;
        str = str.toLowerCase();
        
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else {
                specials++;
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Special: " + specials);
    }
}