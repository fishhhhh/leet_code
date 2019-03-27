package solution.q0004;

public class Solution {

    public double findMedianSortedArrays(int[] arrA, int[] arrB) {
        int m = arrA.length;
        int n = arrB.length;
        if (m > n) {
            int temp = m;
            m = n;
            n = temp;
            int[] tempArr = arrA;
            arrA = arrB;
            arrB = tempArr;
        }
        int min = 0, max = m, halfLength = (n + m + 1) / 2;
        while (min <= max) {
            int i = (min + max) / 2;
            int j = halfLength - i;
            if (j > 0 && i < m && arrB[j - 1] > arrA[i]) {
                min = i + 1;
                //      } else if (i > 0 && j < n && arrA[i - 1] > arrB[j]) {
            } else if (i > min && arrA[i - 1] > arrB[j]) {
                max = i - 1;
            } else {
                int maxLeft = 0;
                if (i == 0) {
                    maxLeft = arrB[j - 1];
                } else if (j == 0) {
                    maxLeft = arrA[i - 1];
                } else {
                    maxLeft = Math.max(arrA[i - 1], arrB[j - 1]);
                }

                if ((m + n) % 2 == 1) {
                    return maxLeft;
                }

                int minRight = 0;
                if (i == m) {
                    minRight = arrB[j];
                } else if (j == n) {
                    minRight = arrA[i];
                } else {
                    minRight = Math.min(arrA[i], arrB[j]);
                }
                return (maxLeft + minRight) / 2d;
            }
        }
        return 0d;
    }
}
