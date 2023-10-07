package Java_Problem_Set.Array.Array;

public class MaxProduct {

    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // Initialize variables to keep track of the maximum and minimum products
        long maxProduct = arr[0];
        long minProduct = arr[0];
        long result = arr[0];

        // Traverse the array from the second element to the end
        for (int i = 1; i < n; i++) {
            // If the current element is negative, swap maxProduct and minProduct
            if (arr[i] < 0) {
                long temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // Update maxProduct and minProduct for the current element
            maxProduct = Math.max(arr[i], maxProduct * arr[i]);
            minProduct = Math.min(arr[i], minProduct * arr[i]);

            // Update the result with the maximum product found so far
            result = Math.max(result, maxProduct);
        }

        return result;
    }
}


