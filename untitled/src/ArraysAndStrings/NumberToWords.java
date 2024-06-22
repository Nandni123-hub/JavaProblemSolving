package ArraysAndStrings;

import java.util.Scanner;
public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number<0){
            System.out.println("Invalid Value");
        }
        String s="";
        int n=reverse(number);
        int originalDigitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(n);
        while(n!=0){
            int d=n%10;
            switch(d){
                case 0:
                    s=s +"zero ";
                    break;
                case 1:
                    s=s +"One ";
                    break;
                case 2:
                    s=s +"Two ";
                    break;
                case 3:
                    s=s +"Three ";
                    break;
                case 4:
                    s=s +"Four ";
                    break;
                case 5:
                    s=s+"Five ";
                    break;
                case 6:
                    s=s+"Six ";
                    break;
                case 7:
                    s=s+"Seven ";
                    break;
                case 8:
                    s=s+"Eight ";
                    break;
                case 9:
                    s=s+"Nine ";
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;
            }
            n=n/10;
        }
        for (int i = 0; i < originalDigitCount - reversedDigitCount; i++) {
            s = s + "Zero ";
        }
        System.out.print(s);
    }
    public static int reverse(int num){
        int rev=0;int dig;
        while(num!=0){
            dig=num%10;
            rev=rev*10+dig;
            num=num/10;
        }
        return rev;

    }
    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;
        for (int i = 1; i <= number; i *= 10) {
            count++;
        }
        return count;
    }
}