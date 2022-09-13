 # %%
age= 21
name = "virat"
print("My name is {one} , age is {two} and roll number is {two}".format(one=name,two=age))
print(id(age))
print(type(age))
# %%
#indexing
x="India is my country"
x
y='this is india\'s flag' #\ strings are immutable in python
print(y)
print(y[-1])

#complex
i=3
j=4
print(complex(i,j))
k=6+7j
print(type(k))

#range
print(list(range(2,11,2)))
# %%
x[0:]

# %%
x[:5]

# %%
x[12:20]

# %%
#List
my_list=["a","b","c","d"]
my_list

# %%
my_list.append('f')
my_list

# %%
my_list[3]="k"
my_list

# %%
print(my_list[3])

# %%
nest=[2,3,[5,6,["India"]]]
print(nest[2][2][0])

#%%
#Dictionary
d={"key1":'kp','list':[1,2,3,4]}
print(d['list'][2])
d1={'k1':{'k2':[1,2,45,3]}}
print(d1['k1']['k2'][2])

#%%
#tuple  .. Immutable

t =(1,2,3,4)
print(t)

#%%
#Set
s={2,8,5,4,5,7}
print(s)
s.add(9)
print(s)

#%%
#Control statement
if (1==2) and (1<2):
    print("True")
elif (4==4):
    print("Right")
else :
    print("False")
    
#%%
seq=[1,2,3,4,5]
for i in seq:
    #print(i)
    print('kp')
    
#%%
list(range(10))
print(list)
#%%
for i in range(0,10):
    print(i)
#%%
i=2
while(i<=10):
    print("i is {}".format(i))
    i+=2
    
#%%
s=[1,2,3,4,5]
out=[]
for num in s:
    out.append(num**2)
    
print(out)

#METHOD 2 
out = [num**2 for num in s]
print(out)
#%%
#Function
def square(num):
    return num*num

print(square(3))

def id(name):
    print("Welcome "+name)
    
id('kalpesh')


#%%
#Map
seq=[1,2,3,4,5]
n=['India','US','SA','WI']
print(list(map(square,seq)))
print(list(map(id,n)))
#%%
#Lambda Function
print(list(map(lambda num:num**3,seq)))
#Filter
print(list(filter(lambda n:n%2 ==0,seq)))
#%%

#Methods
test="India is my country #India"
print(test.split())
print(test.split('#'))
print(test.split('#')[1])
print(test.lower())
print(test.upper())

print('x' in ['x','y','z'])

tup=((1,2),(4,5),(7,8))
for (a,b) in tup:
    print("a : ",end=" ")
    print(a)
    print("b : ",end=" ")
    print(b)
 
#%%
print(7**4)

#%%
def countdog(s):
    count=0
    for word in s.lower().split():
        if word =='dog':
            count+=1
    return count
        
print(countdog("This dog runs faster than other dog"))

print("===============")
#Find the words from the list which start with s
st=['solid','sachin','cricket','hello','sehwag']
print(list(filter(lambda word:word[0]=='s',st)))

def caught_speeding(speed,is_birthday):
    if (is_birthday):
        speeding=speed-5
    else:
        speeding=speed
    if speeding >80:
        return "Big ticket"
    elif speeding >60:
        return "Small tiket"
    else:
        return "No ticket"
    
print(caught_speeding(81,True))
print(caught_speeding(81,False))