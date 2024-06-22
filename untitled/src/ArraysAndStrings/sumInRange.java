package ArraysAndStrings;

public class sumInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,7,3,4,5,7,9,8};
        sumInRange sumProblem = new sumInRange();
        sumProblem.sum(arr,3,7);
    }
    public void sum(int[] arr, int i,int j) {
        int sum = 0;
        boolean inRange = false;

        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == i) {
                inRange = true;
            }
            if (!inRange) {
                sum += arr[k];
            }
            if (arr[k] == j && inRange) {
                inRange = false;
                sum+=arr[k];
            }
        }

        System.out.println(sum);
    }
}