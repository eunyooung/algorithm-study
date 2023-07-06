def solution(sizes):
    
    # sizes 각 행에서 큰 값
    maxArr = [max(i) for i in sizes]
    # sizes 각 행에서 작은 값 
    minArr = [min(i) for i in sizes]    
    
    return max(maxArr) * max(minArr)
