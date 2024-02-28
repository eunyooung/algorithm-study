def solution(n, m):
    
    gcd = 0 # 최대공약수
    lcm = 0 # 최소공배수
    
    for i in range (min(n,m), 0, -1) :
        if n % i == 0 and m % i == 0:
            gcd = i
            break
            
    lcm = int((n * m) / gcd)
    
    return [gcd, lcm]
