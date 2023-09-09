package level1.java_모의고사;

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
                
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        
        int countFirst = 0;
        int countSecond = 0;
        int countThird = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % first.length]) {
                countFirst++;
            }
            if (answers[i] == second[i % second.length]) {
                countSecond++;
            }
            if (answers[i] == third[i % third.length]) {
                countThird++;
            }
        }
        
        int max = countFirst;
        if (max < countSecond) max = countSecond;
        if (max < countThird) max = countThird;
        
        List<Integer> list = new ArrayList<Integer>();
        if (max == countFirst) list.add(1);
        if (max == countSecond) list.add(2);
        if (max == countThird) list.add(3);
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
