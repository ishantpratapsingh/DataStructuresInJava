/* Write a program to rotate an array of length n by d elements to left.
Implement the same using Reversal Algorithm.

Reversal Algorithm Explanation:
Let the array be arr[] = [1, 2, 3, 4, 5, 6, 7], d =2 and n = 7 
A = [1, 2] and B = [3, 4, 5, 6, 7] 
 

Reverse A, we get ArB = [2, 1, 3, 4, 5, 6, 7]
Reverse B, we get ArBr = [2, 1, 7, 6, 5, 4, 3]
Reverse all, we get (ArBr)r = [3, 4, 5, 6, 7, 1, 2]
-------------------------------------------------------------------------------------------------
*/



class ReversalAlgorithmForRotation {

    static void reversingarray(int arr[], int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void rotation(int arr[], int d) {
        reversingarray(arr, 0, d - 1);
        reversingarray(arr, d, arr.length - 1);
        reversingarray(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        ReversalAlgorithmForRotation d1 = new ReversalAlgorithmForRotation();
        int arr[] = {
            1,
            2,
            3,
            4,
            5,
            6,
            7
        };
        int d = 3;
        d1.rotation(arr, d);
    }
}