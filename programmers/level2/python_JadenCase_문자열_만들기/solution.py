def solution(s):
    arr = s.split(" ")
    
    for index, value in enumerate(arr):
        if len(value) > 0:
            arr[index] = value[0].upper() + value[1:].lower()
    
    return " ".join(arr)
