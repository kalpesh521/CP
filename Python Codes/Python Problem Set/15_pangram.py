#Pangram-> Sentence should contain all the alphabets 

def pan(str1):
    if len(set(str1.lower().strip()))>=26:
        return True
    else:
        return False
str1="A quick brown fox jumps over the lazy dog"
print(pan(str1))