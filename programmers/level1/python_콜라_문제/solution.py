def solution(a, b, n):
    
    answer = 0
    
    while(n >= a):
        
        remain = n % a
        swapped = (int)(n / a) * b
        
        n = remain + swapped
        answer += swapped
        
    return answer
    