package level0.java_n_번째_원소까지;

class Solution {
    
    public int[] solution(int[] num_list, int n) {
        
        int[] answer = new int[n];
        
        for (int i = 0; i < n; i ++) {
        
            answer[i] = num_list[i];
        }
        
        return answer;
    }
}
