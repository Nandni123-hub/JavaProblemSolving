package ArraysAndStrings;

import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check if it is a perfect number:");
        int number = scanner.nextInt();
        System.out.println(PerfectNum(number));
    }
    public static boolean PerfectNum(int number){
        if(number<1){
            return false;
        }
        int sum=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum+=+i;
            }
        }
        return sum==number;
    }
}

