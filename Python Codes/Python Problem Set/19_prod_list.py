#Method 1 Loop
lst =[2,4,5,-3]
prod=1
for i in lst:
    prod*=i
    
print(prod)

# Method 2 Using Numpy
import numpy as np
prod1=np.prod(lst)
print(prod1)

# Method 3 Using Reduce

from functools import reduce
print(reduce(lambda a,b:a*b ,lst))
print(reduce(lambda a,b:a+b ,lst))

print(reduce(lambda a,b:a if a>b else b,lst))

