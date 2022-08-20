i =1
while (i<=5):
    print("Kalpesh",end=" ")
    i=i+1
    j=1
    while (j<=4):
        print("India",end=" ")
        j=j+1
    print()
#%%
for i in range(20,10,-1):
    if i%5!=0:
        print(i)
 
 #%%

av= 10
x=int(input("Enter Number of Candies : "))
i=1
while i<=x:
    if (x>av):
        print("Out of Stock")
        break
    print("Candies")
    i+=1
print("Bye")
    
#%%
for i in range (1,11):
    if i%3==0:
        continue
    print(i)
print("Bye")

for i in range(1,21):
    if i%2!=0:
        pass
    else :
        print(i)