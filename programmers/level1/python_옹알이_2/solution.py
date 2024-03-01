def solution(babbling):
    
    answer = 0
    arr = ['aya', 'ye', 'woo', 'ma']

    for word in babbling :
        for a in arr:
            if a * 2 not in word :
                word = word.replace(a, ' ')
        
        if word.isspace() :
            answer += 1;
        
    return answer
