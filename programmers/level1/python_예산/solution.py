def solution(d, budget):
    
    d.sort()
    answer = 0
    total = 0
    
    for i in d :
        total += i
        
        if total > budget :
            break
        
        answer += 1
            
    return answer
