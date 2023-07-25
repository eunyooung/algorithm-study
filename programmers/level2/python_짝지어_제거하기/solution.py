def solution(s):
    
    answer = -1
    
    stack = []
    
    for i in range(len(s)):
        if (len(stack) == 0):
            stack.append(s[i])
            continue
        top = stack.pop()
        if (top != s[i]):
            stack.append(top)
            stack.append(s[i])
    
    return 1 if len(stack) == 0 else 0
