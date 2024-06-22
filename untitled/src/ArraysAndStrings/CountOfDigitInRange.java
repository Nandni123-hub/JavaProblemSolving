package ArraysAndStrings;

public class CountOfDigitInRange {
    public static void main(String[] args) {
        int input = 3;
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            String number = String.valueOf(i);
            for (char digit : number.toCharArray()) {
                if (Character.getNumericValue(digit) == input) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
