def solution(name, yearning, photo):

    answer = []
    dic = dict(zip(name, yearning))
    
    for arr in photo :
        lists = list(set(name) & set(arr))
        sum = 0
        for item in lists :
            if item in dic :
                sum += dic[item]
        answer.append(sum)
    
    return answer
