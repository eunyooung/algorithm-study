package level0.java_배열_비교하기;

import java.util.Arrays;

class Solution {
    
    public int solution(int[] arr1, int[] arr2) {
        
        if (arr1.length < arr2.length) {
            
            return -1;
            
        } else if (arr1.length > arr2.length) {
            
            return 1;
            
        } else {
            
            int sum1 = 0;
                
            for (int num : arr1) {
                sum1 += num;
            }

            int sum2 = 0;

            for (int num : arr2) {
                sum2 += num;
            }

            return sum1 == sum2 ? 0 : (sum1 < sum2 ? -1 : 1);
        }
    }
}