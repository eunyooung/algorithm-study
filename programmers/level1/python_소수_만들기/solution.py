def solution(nums):
    answer = 0
    lists = []
    
    for i in range(len(nums)) :
        for j in range(i + 1, len(nums)) :
            for k in range(j + 1, len(nums)) :
                num = nums[i] + nums[j] + nums[k]
                lists.append(num)
    
    for i in lists :
        if all(i % j != 0 for j in range(2, i)) :
            answer += 1
        
    return answer
