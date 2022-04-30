package level1.신고결과받기;

import java.util.*;

public class Solution {

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, Integer> index = new HashMap<>();
        Map<String, List<Integer>> list = new HashMap<>(); // 신고 전적
        
        for (int i = 0; i < id_list.length; i ++) {
            index.put(id_list[i], i);
        }
        
        for (int i = 0; i < report.length; i++) {
            String[] id = report[i].split(" ");
            String from = id[0];
            String to = id[1];
            if (!list.containsKey(to))
                list.put(to, new ArrayList<>());
            List<Integer> temp = list.get(to);
            if (!temp.contains(index.get(from))) // 중복 신고 안됨
                temp.add(index.get(from));
        }
        
        for (int i = 0; i < id_list.length; i++) {
            String id = id_list[i];
            if (list.containsKey(id) && list.get(id).size() >= k) {
                for (int idx : list.get(id))
                    answer[idx]++;
            }
        }
        return answer;
    }
}