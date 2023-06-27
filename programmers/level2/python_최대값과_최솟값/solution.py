def solution(s):
    arr_int = list(map(int, s.split(" ")))
    answer = str(min(arr_int)) + " " + str(max(arr_int))
    return answer