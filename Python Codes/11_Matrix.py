from numpy import *
arr1= array([
    [2,4,5,6,8,1],
    [5,3,2,6,9,7]
])
arr2=arr1.flatten()
arr3=arr1.reshape(3,4)
print(arr2)
print(arr3)
#%%
from numpy import *
m = matrix ( '2 7 5 ; 3 2 1 ; 34 5 7')
m1 = matrix ( '3 7 5 ; 3 8 1 ; 3 5 7')
print(m)
print(diagonal(m))
print(m+m1)
print(m*m1)

# %%
