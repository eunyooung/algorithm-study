def solution(s):
    
    dic = {} 
    answer = []
    
    for i, c in enumerate(s) :
        if c not in dic :
            answer.append(-1)
        else:
            answer.append(i - dic[c])
        
        dic[c] = i
    
    return answer
