package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement{
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int majorityElement(final int[] A) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<A.length;i++){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
        }
        int threshold = A.length / 2;
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > threshold) {
                return entry.getKey();
            }
        }
        // return a default value or throw an exception if no majority element is found
        return -1; // or throw an exception
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        MajorityElement solution = new MajorityElement();
        int majorityElement = solution.majorityElement(A);
        if (majorityElement == -1) {
            System.out.println("No majority element found");
        } else {
            System.out.println("The majority element is: " + majorityElement);
        }
    }
}
