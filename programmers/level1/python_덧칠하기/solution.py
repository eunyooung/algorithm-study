def solution(n, m, section):
    
    answer = 1
    field = section[0]
    
    for wall in section :
        if wall >= (field + m) :
            field = wall
            answer += 1
    
    return answer
