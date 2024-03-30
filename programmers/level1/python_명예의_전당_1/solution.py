def solution(k, score):
    
    answer = [0 for i in range(len(score))]
    rank = []
    
    for i in range(len(score)) :
        
        num = score[i]
        if (i < k) :
            rank.append(num)
        else :
            if rank[0] < num :
                rank.pop(0)
                rank.append(num)
                
        rank.sort()
        answer[i] = rank[0]
        
    return answer
