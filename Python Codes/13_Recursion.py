# import sys 
# sys.setrecursionlimit(4000)
# print(sys.setrecursionlimit)#1000 limit default

# i=0
# def greet():
#     global i
#     i+=1
#     print("Hello",i)
    
#     greet()
# greet()

#%%
def fact(n):
    if n==0:
        return 1
    else:
        return n*fact(n-1)
print(fact(5))