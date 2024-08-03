#Second Largest Element in the array 
public class Solution {

    int secLargest(int[] a, int n) {
        int Largest = a[0];
        int Seclargest = -1;
        for (int i = 1; i < n; i++) {
            if (a[i] > Largest) {
                Seclargest = Largest;
                Largest = a[i];
            } else if (a[i] < Largest && a[i] > Seclargest) {
                Seclargest = a[i];
            }
        }
        return Seclargest;
    }
    int secSmallest(int[] a, int n) {
        int Smallest = a[0];
        int SecSmallest = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (a[i] < Smallest) {
                SecSmallest = Smallest;
                Smallest = a[i];
            } else if (a[i] != Smallest && a[i] < SecSmallest) {
                SecSmallest = a[i];
            }
        }
        return SecSmallest;
    }

    public static int[] getSecondOrderElements(int n, int[] a) {
        Solution solution = new Solution();
        int SLargest = solution.secLargest(a, n);
        int SSmallest = solution.secSmallest(a, n);
        return new int[]{SLargest, SSmallest};
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 12};
        int n = arr.length;
        int[] result = getSecondOrderElements(n, arr);
        System.out.println("Second Largest: " + result[0]);
        System.out.println("Second Smallest: " + result[1]);
    }
}
