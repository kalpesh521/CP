import functools

f = lambda a:a**2
print(f(5))

k =lambda a,b:a+b
print(k(3,6))

#Filter

L =[2,4,6,5,11,33,7,5,14]
even=list(filter(lambda a:a%2==0,L))
print(even)

#Map
cube =list(map(lambda a:a**2,even))
print(cube)

#Reduce 
def add_all(a,b):
    return a+b

from functools import reduce 

sum =reduce(add_all,cube)
print(sum)

sum_lambda =reduce(lambda a,b:a+b,cube)
print(sum_lambda)