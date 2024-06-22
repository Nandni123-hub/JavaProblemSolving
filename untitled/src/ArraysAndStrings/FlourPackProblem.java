package ArraysAndStrings;

import java.util.Scanner;
public class FlourPackProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of big flour bags:");
        int bigCount = scanner.nextInt();
        System.out.println("Enter the number of small flour bags:");
        int smallCount = scanner.nextInt();
        System.out.println("Enter the goal amount of flour:");
        int goal = scanner.nextInt();
        System.out.println(canPack(bigCount, smallCount, goal));
    }
    public static boolean canPack(int bigCount,int smallCount,int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int left=goal;int i=1;int max=5;
        while(left!=0 && left>=5 && bigCount!=0){
            left=left-max;
            bigCount--;
        }
        if(left<=smallCount || left==0){
            return true;
        }
        return false;

    }
}
