lst=[4,3,21,2]
print(sorted(lst,key=lambda x:0 if x==21 else x))


from math import pi 
r=int(input("Enter radius \n"))
print("The area of circle having radius " +str(r)+ " is " + str(pi*r**2))

lst1=[3,5,6,2,7,8]
lst2=[4,5,16,2,17,8]
def Intersect(lst1,lst2):
    res,lst2_copy=[],lst2[:]
    for el in lst1:
        if el in lst2:
            res.append(el)
            lst2_copy.remove(el)
    return res
print(Intersect(lst1,lst2))

    