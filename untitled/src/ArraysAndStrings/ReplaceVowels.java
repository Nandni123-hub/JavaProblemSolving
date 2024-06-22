package ArraysAndStrings;

public class ReplaceVowels {
    public static void main(String[] args) {
        String input = "Name";
        String output = replaceVowelsWithX(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    public static String replaceVowelsWithX(String input) {
        // Create a StringBuilder to build the output string
        StringBuilder result = new StringBuilder();

        // Define a string containing all vowels
        String vowels = "aeiouAEIOU";

        // Iterate over each character in the input string
        for (char c : input.toCharArray()) {
            // Check if the character is a vowel
            if (vowels.indexOf(c) != -1) {
                // Replace vowel with 'x'
                result.append('x');
            } else {
                // Append the character as is
                result.append(c);
            }
        }

        // Convert StringBuilder to String and return the result
        return result.toString();
    }
}
