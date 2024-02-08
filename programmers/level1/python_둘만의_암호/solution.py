def solution(s, skip, index):
    
    alphabet = "abcdefghijklmnopqrstuvwxyz"
    answer = ''
    
    for ss in skip :
        alphabet = alphabet.replace(ss, "")
        
    for i in s :
        new_index = alphabet.index(i) + index
        answer += alphabet[new_index % len(alphabet)]
        
    return answer
