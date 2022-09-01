def anagram(s1,s2):
    return set(s1)==set(s2)
print(anagram('lives','elivs')) #true

#Print  all the duplicates

lst= list(range(5))+ list(range(7))
lst1=list(set(lst))
print(lst1)