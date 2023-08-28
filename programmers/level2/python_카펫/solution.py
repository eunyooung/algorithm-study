def solution(brown, yellow):
    
    both = brown + yellow
    arr = [i for i in range (1, both) if both % i == 0] # 약수
    
    for num in arr:
        opp = both/num
        if (num - 2) * (opp - 2) == yellow :
            return [max(num,opp), min(num,opp)]
            
    return [0,0]
