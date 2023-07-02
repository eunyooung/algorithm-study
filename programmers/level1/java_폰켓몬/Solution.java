package level1.java_폰켓몬;

import java.util.*;

class Solution {
    
    public int solution(int[] nums) {
        
        int answer = nums.length / 2;
        
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }
        
        return list.size() < answer ? list.size() : answer;
    }
}