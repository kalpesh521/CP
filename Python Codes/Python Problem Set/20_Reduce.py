lst=[2,3,4,5,6]
from functools import reduce  # Return last summation result
from itertools import accumulate # Returns iterator containing intermediate result 
import operator 

print(reduce(lambda a,b:a*b ,lst))
print(reduce(operator.mul ,lst))
print(list(accumulate(lst,lambda a,b:a*b)))

print(reduce(lambda a,b:a+b ,lst))
print(reduce(operator.add,lst))
print(list(accumulate(lst,lambda a,b:a+b)))

print(reduce(lambda a,b:a if a>b else b,lst))

#Reduce three parameter 
# reduce(function,iterable,initializer)
print(reduce(lambda a,b:a+b ,lst,6))
# initializer first add default value then add interable