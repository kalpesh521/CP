#%%
for i in range (4):
    for j in range(4):
            print("*",end=" ")  
    print()
    
#%%
for i in range(4):
    for j in range(i+1):
        print("*",end=" ")
    print()
#%%
for i in range(4):
    for j in range(4-i):
        print("*",end=" ")
    print()
    
#%%
 
#python3 code to implement above approach
height = 5
for row in range(1, height+ 1):
	print(" " * (height - row) +"*" * row)
#this code is contributed by Shivesh kumar dwivedi

#%%
n=5
for i in range (n+1):
    print(" "*i+(n-i)*"* ")
    
#%%
n=5
for i in range (n+1):
    print("* "*i+(n-i)*" ")
#%%
def triangle(n):
    k=n-1
    for i in range (0,n):
        
        for j in range(0,k):
            print(end=" ")
        k-=1
        for j in range (0,i+1):
            print("*",end=" ")
        print("")
print(triangle(5))  