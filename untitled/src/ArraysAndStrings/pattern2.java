package ArraysAndStrings;

public class pattern2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        pattern(arr);
    }

    public static void pattern(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            StringBuilder productExpression = new StringBuilder();
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    productExpression.append(arr[j]).append('*');
                }
            }
            productExpression.setLength(productExpression.length() - 1); // remove the last '*'
            System.out.print(productExpression + (i < arr.length - 1 ? ", " : ""));
        }
    }
}