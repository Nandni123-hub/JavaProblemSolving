package ArraysAndStrings;

import java.util.Arrays;
public class AddArray {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1};
        System.out.println(Arrays.toString(addArray(arr,2)));
    }
    public static int[] addArray(int[] arr, int num) {
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        int sum = number + num;
        String sumStr = Integer.toString(sum);
        int[] digits = new int[sumStr.length()];
        for (int i = 0; i < sumStr.length(); i++) {
            digits[i] = sumStr.charAt(i) - '0';
        }
        return digits;
    }
}