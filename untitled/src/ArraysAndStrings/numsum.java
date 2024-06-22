package ArraysAndStrings;

import java.util.Scanner;

public class numsum  {
    public static void main(String[] args) {
        System.out.println(digitSumUntilSingleDigit(123456));
    }

    public static int digitSumUntilSingleDigit(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}