#Largest Element in the array
  import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
      int largest = arr[0];
      for(int i=0; i<n; i++){
          if(arr[i]>largest){
              largest=arr[i];
          }
      }
     return largest;
    }
}
