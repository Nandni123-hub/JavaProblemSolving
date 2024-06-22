package ArraysAndStrings;

public class product {
    public static void main(String[] args) {
        int[] array = {12, 34, 56, 78, 90}; // replace with your array
        int M = 3; // replace with your multiplier

        for (int num : array) {
            int product = num * M;
            String productStr = String.valueOf(product);
            if (productStr.length() > 2) {
                productStr = productStr.substring(productStr.length() - 2);
            }
            System.out.println(productStr);
        }
    }
}