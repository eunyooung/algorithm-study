def solution(array, commands):
    
    answer = []
    
    for command in commands :
        i = command[0] - 1
        j = command[1]
        k = command[2] - 1
        
        arr = []
        
        for num in range (i, j) :
            arr.append(array[num])
        
        arr.sort()
        answer.append(arr[k])
        
    return answer
