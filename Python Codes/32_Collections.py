from collections import Counter, deque
from collections import OrderedDict
from heapq import heapify
from typing import Collection, DefaultDict

print(Counter(['a','b','c','a','b','c','c']))

print(Counter(a=3,b=4,c=2))
coun=Counter()
coun.update([2,3,4,2,3,1,3,2])#Create or update
print(coun)
coun.update([1,1,1])
print(coun)
c2=([1,2,3,4,2,1,1,2])
coun.subtract(c2) #Subtract
print(coun)

#====================================================================
#Order Dictionary
#Maintain order of insertion
od=OrderedDict()
print("=========================")

od['a']=1
od['b']=2
od['c']=3
od['d']=4
for key,value in od.items():
    print(key,value)
    
od.pop('a')
od['a']=1
print()

for key,value in od.items():
    print(key,value)
#====================================================================  
from collections import ChainMap
#Create list by combining number of dictionaries
#Method to add two dictionaries
print("=========================")

d1={'a':2,'b':3}
d2={'c':2,'k':3}
d3={'c':1,'p':3}
c=ChainMap(d1,d2,d3)
print(c)
print(c['a'])
print(c.values()) 
print(c.keys())
print("Map : ",c.maps) #Returns keys and values


ch=ChainMap(d1,d2)
print(ch)
new_ch=ch.new_child(d3)
print("Value before reversing : ",new_ch['c'])

new_ch.maps=reversed(new_ch.maps)
print("Value after reversing : ",new_ch['c'])

#Method to add two dictionaries
x={**d1,**d2}
print(x)
#====================================================================

from collections import namedtuple
print("=========================")

student=namedtuple('student',['name','age','id'])
st=student('Kalpesh',23,2)
li=['Virat',33,18]
print("The name of student is : " ,end="")
print(st[0])
print("age of student is ", end="")
print(st.name)

print("The namedtuple dictionary instance using iterable ")
print(student._make(li))
print("The orderdict instance using namedtuple")
print(student._asdict(st))
print(st._replace(name="Rohit"))
#===============================================================
from collections import defaultdict
print("=========================")
d=DefaultDict(lambda:"Not Present")
d['a']=1
d['b']=2
print(d['a'])
print(d['c'])
#===============================================================

dq=deque([1,2,3,4])
print("=========================")

print(dq)
dq.append(5)
dq.appendleft(6)
print(dq)
dq.pop()
dq.popleft()
print(dq)

#====================================================================

from collections  import UserString
print("=========================")

class mystring(UserString):
    def append (self ,s):
        self.data +=s
    def remove(self,s):
        self.data+= self.data.replace(s,"")
s1=mystring("Trees")
print(s1.data)
print("Append :",end=" ")
s1.append('s')
print(s1.data)
print("remove :",end=" ")
s1.remove('e')
print(s1.data)
#====================================================================

#Heapify
import heapq
lst=[3,4,5,1,9,2]
hp=heapq.heapify(lst)
print(lst)

print("First three largest number",heapq.nlargest(3,lst))
print("First three smallest number",heapq.nsmallest(3,lst))