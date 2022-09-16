def count_alpha(str):
    lowerC,upperC=0,0
    for i in str:
        if i.isalpha():
            if  i.islower():
                lowerC+=1
            else:
                upperC+=1
    return lowerC,upperC
str=('Hello,How are you')
lower,upper=count_alpha(str)
print(f'Upperacse {upper}',f'Lowercase {lower}',sep="\n")

# Method 2
def lcount(str):
    cap=[]
    small=[]
    for i in str:
        if i.isupper():
            cap.append(i)
        elif i.islower():
            small.append(i)
        else:
            continue
    print("Uppercase Count",len(cap))
    print("Lowercase Count",len(small))
          
lcount(str)