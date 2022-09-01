
def find_duplicates(elements):
    duplicates,seen=set() ,set()
    for el in elements:
        if el in seen:
            duplicates.add(el)
        seen.add(el)
    #return list(seen)   #contain number of list in list 
    return list(duplicates) #contain  duplicates
print(find_duplicates([3,5,5,3,4,1]))

lst= [3,5,5,3,4,1]
def find_duplicate1(lst):
    if len(lst)== len(set(lst)):
        return False
    else:
        return True
print(find_duplicate1(lst))

def find_duplicate2(lst):
    for el in lst:
        if  lst.count(el)>1:
            return True
        return True
print(find_duplicate2(lst))