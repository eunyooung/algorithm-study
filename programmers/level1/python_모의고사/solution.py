def solution(answers):
    
    first = [1, 2, 3, 4, 5]
    second = [2, 1, 2, 3, 2, 4, 2, 5]
    third = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    
    countFirst = 0
    countSecond = 0
    countThird = 0
    
    for i in range(len(answers)) :
        if answers[i] == first[i % len(first)] :
            countFirst += 1
            
        if answers[i] == second[i % len(second)] :
            countSecond += 1
            
        if answers[i] == third[i % len(third)] :
            countThird += 1
    
    maxNum = max(max(countFirst, countSecond), countThird)
    answer = []
    
    if (countFirst == maxNum) :
        answer.append(1)
    if (countSecond == maxNum) :
        answer.append(2)
    if (countThird == maxNum) :
        answer.append(3)
    
    return answer
