def solution(arr):
    
    x = min(arr)
    arr.remove(x)
    
    if not arr :
        arr.append(-1)
        
    return arr
