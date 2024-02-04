def solution(lottos, win_nums):
        
    unknown = lottos.count(0)
    unmatched = 0
    
    for i in range(len(lottos)) :
        
        if lottos[i] == 0 :
            continue
            
        if lottos[i] not in win_nums :
            unmatched += 1
    
    min = 6 if unmatched + 1 > 6 else unmatched + 1
    max = 6 if unmatched + unknown + 1 > 6 else unmatched + unknown + 1
    
    return [min, max]
