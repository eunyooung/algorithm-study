def solution(nums):
    
    # 중복 제거한 폰켓몬 종류
    kind = len(set(nums))
    # 가져갈 수 있는 폰켓몬 수
    available = len(nums) // 2
    
    return min(kind, available)
