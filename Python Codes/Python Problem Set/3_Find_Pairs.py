
l=[1,2,3,5,7,11]
def find_pairs(l,x):
    pairs=[]
    for (i,el1) in enumerate(l): #enumerate adds a counter to an iterable 
                                 #return in the form of enumerating object
        for (j,el2) in enumerate(l[i+1:]):
            if el1+el2 ==x:
                pairs.append((el1,el2))
    return pairs 
print(find_pairs(l,5))     