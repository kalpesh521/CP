#To check string ,returns matching string where even position in uppercase while odd position in lowercase


def string_convert(str1):
    string1=""
    for i in range(0,len(str1)):
        if i%2!=0:
            string1+=str1[i].upper()
        else :
            string1+=str1[i].lower()
    if str1==string1.strip():
        return True
    else:
        return False
print(string_convert('kAlPeSh'))
print(string_convert('MaN'))