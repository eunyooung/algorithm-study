def solution(s, n):

    answer = ''
    
    for i in s:
        num = ord(i)
        if i == " ":
            answer += " "
            continue
            
        if num >= 65 and num <= 90 :
            if (ord(i) + n > 90) :
                answer += chr(ord(i) + n - ord('Z') + ord('A') - 1)
            else :
                answer += chr(ord(i) + n)
        elif num >= 97 and num <= 122:
            if (ord(i) + n > 122) :
                answer += chr(ord(i) + n - ord('z') + ord('a') - 1)
            else :
                answer += chr(ord(i) + n)
                
    return answer
