#Factorial of number
from functools import reduce
n=5
print(reduce(lambda a,b:a*b,range(1,n+1)))

#List Comprehension
def square(a):      
    return [a*a for x in range (1,11)]
print(square(5))

#Fibonacci Series
def fib(a):
    return [lambda a:a if a<=1 else fib(a-1)+fib(a-2)]
print(fib(5))

#Take space separated input
l=list(map(int,input().split()))
