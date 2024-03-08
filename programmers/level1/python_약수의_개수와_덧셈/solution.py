def solution(left, right):
    
    answer = 0 
    
    for i in range (left, right + 1) :
        
        count = 0
        
        for n in range (1, int(i**(1/2)) + 1) :
            if (i % n == 0) :
                count += 1
                if ((n**2) != i) :
                    count += 1
        
        if (count % 2 == 0) :
            answer += i
        else:
            answer -= i
    
    return answer
