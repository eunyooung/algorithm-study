def solution(n):
    
    ans = ""
    while(n > 0) :
        n, m = divmod(n, 3)
        ans += str(m)
    
    return int(ans, 3)