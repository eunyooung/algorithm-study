package level1.java_달리기_경주;

import java.util.*;

class Solution {
    
    public String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> mapByName = new HashMap<>();
        Map<Integer, String> mapByRank = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            mapByName.put(players[i], i + 1);
            mapByRank.put(i + 1, players[i]);
        }
        
        for (int i = 0; i < callings.length; i++) {
            
            String calledPlayer = callings[i];
            int calledPlayerRank = mapByName.get(calledPlayer);
            
            int frontPlayerRank = calledPlayerRank - 1;
            String frontPlayer = mapByRank.get(calledPlayerRank - 1);
            
            mapByName.put(calledPlayer, frontPlayerRank);
            mapByName.put(frontPlayer, calledPlayerRank);
            mapByRank.put(frontPlayerRank, calledPlayer);
            mapByRank.put(calledPlayerRank, frontPlayer);
        }
        
        String[] answer = new String[players.length];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = mapByRank.get(i + 1);
        }
        
        return answer;
    }
}
