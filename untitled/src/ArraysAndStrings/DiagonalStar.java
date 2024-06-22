package ArraysAndStrings;

import java.util.Scanner;
public class DiagonalStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printSquareStar(n);
    }
    public static void printSquareStar(int n){
        if(n<2){
            System.out.println("InvalidValue");
        }
        for(int row=1;row<=n;row++){
            for(int column =1;column<=n;column++){
                if(column==1 || row==column || row==1 || column==n || row==n || column==n-row+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
