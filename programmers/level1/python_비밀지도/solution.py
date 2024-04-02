def solution(n, arr1, arr2):
    
    answer = [0 for i in range(n)]
    
    for i in range(n) :
        binary = bin(arr1[i] | arr2[i])[2:].zfill(n)
        binary = binary.replace("1", "#")
        binary = binary.replace("0", " ")
        answer[i] = binary
        
    return answer
