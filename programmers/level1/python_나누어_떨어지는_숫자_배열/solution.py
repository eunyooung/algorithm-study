def solution(arr, divisor):
    
    answer = []
    
    for x in arr :
        if x % divisor == 0 :
            answer.append(x)
    
    if not answer :
        answer.append(-1)
    
    answer.sort()
    return answer
