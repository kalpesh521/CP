#import array as arr
from array import *
val =array('i',[2,5,4,7,1])
#val.reverse()
print(val.buffer_info()) #print address and Size of an array
print(val)
for i in range(5):
    print(val[i])
    
print("Another Method")
for i in val:
    print(i)
    
print("Method to create new array")

newarr = array(val.typecode,(a for a in val))

for i in newarr:
    print(i)
print("Square of elements of array")
newarr2 = array(val.typecode,(a*a for a in val))

for i in newarr2:
    print(i)
    
i =0
while(i<len(newarr2)):
    print(newarr2[i])
    i+=1
#%%   
from array import *
print("User Input")
n=int(input("Enter length of an array"))
arr=array('i',[])
for i in range(n):
    x=int(input("Enter the value"))
    arr.append(x)
    
print(arr)

val=int(input("Enter  the value to search"))

k=0
for e in arr:
    if e==val:
        print(k)
    k+=1