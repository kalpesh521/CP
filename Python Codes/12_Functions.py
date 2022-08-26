
# def add_sub(x,y):
#     c=x+y
#     d=x-y
#     return c,d
# result1,result2 =add_sub(5,2)
# print(result1,result2)
# print(add_sub(4,2))

# #Keyword Argument
# def stud (name,age):
#     print(age)
#     print(name)
# stud(age=21,name="kp")

# #Default Argument
# def stud (name,age=18):
#     print(age)
#     print(name)
# stud("kalpesh")
# #Variable Length Argument
# def sum (a,*b):
#     print(a)
#     print(b)
#     c=a
#     for i in b:
#         c+=i
#     print(c)

# sum(2,3,6,8)

# #keyword Variable Length Argument

# def key(name,**data):
#     print(name)
#     print(data)
#     for i,j in data.items():
#         print(i,j)
        
# key('Ram',age=23,Loc="Pune",Mob=3232324121)

# #Global and Local Variable function

# a =5  
# def glob():
#     global a
#     a =3
#     print(a)
#     globals() ['a']=12

# glob()
# print(a)

# #%%
# #Count even /odd number in list 
# lst =[3,4,12,67,32,5,6,2,4,11]
# def count(lst):
#     even =0
#     odd =0
#     for i in lst:
#         if i%2==0:
#             even+=1
#         else:
#             odd+=1
#     return even,odd
# even,odd =count(lst)
# print("Even : {} and Odd : {}".format(even,odd))

# #%%

# n =int(input("Enter number : "))
# def fib(n):
    
    
#      a=0
#      b=1
#      if n==1:
#          print(a)
#      else:
#          print(a)
#          print(b)
#      for i in range(2,n):
#          c=a+b
#          a=b
#          b=c
#          print(c)
# fib(n)
# #%% 
# #Factorial 
# def fact(n):
#     a=1
#     for i in range(1,n+1):
#         a =a*i
#     return a
# x=5
# result=fact(x)
# print(result)
#%%
#Pallindrome or not
def pallindrome(st):
    return st==st[::-1]
print(pallindrome("anna"))