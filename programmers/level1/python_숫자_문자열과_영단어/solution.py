def solution(s):
    
    arr = ['zero', 'one', 'two','three', 'four', 'five', 'six', 'seven', 'eight', 'nine' ]
    for index, value in enumerate(arr):
        s = s.replace(value, str(index))
        
    return int(s)
