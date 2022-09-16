#Pangram-> Sentence should contain all the alphabets 

def pan(str1):
    str1=str1.replace(" ","")
    if len(set(str1.lower()))>=26:
        return True
    else:
        return False
str1="A quick brown fox jumps over the lazy dog"
print(pan(str1))