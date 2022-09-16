def animal(str):
    word1,word2=str.split()
    return True if word1[0]==word2[0] else False

print(animal("Kp ls"))