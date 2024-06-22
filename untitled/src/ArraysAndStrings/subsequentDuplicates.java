package ArraysAndStrings;

public class subsequentDuplicates {
    public static void main(String[] args) {
        String str = "aaabbbcccddeee"; // replace with your string
        System.out.println(removeSubsequentDuplicates(str));
    }

    public static String removeSubsequentDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        char lastChar = '\0'; // null character

        for (char c : str.toCharArray()) {
            if (c != lastChar) {
                sb.append(c);
                lastChar = c;
            }
        }
        return sb.toString();
    }
}

