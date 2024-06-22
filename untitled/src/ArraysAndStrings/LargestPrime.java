package ArraysAndStrings;

import java.util.Scanner;
public class LargestPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find the largest prime factor:");
        int number = scanner.nextInt();
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number) {
    if (number <= 1) {
        return -1;
    }
    for (int i = number; i > 1; i--) {
        if (number % i == 0) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                return i;
            }
        }
    }
    return -1;
}
}