 # %%
from re import L


age= 21
name = "virat"
print("My name is {one} , age is {two} and roll number is {two}".format(one=name,two=age))

# %%
#indexing
x="India is my country"
x

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
