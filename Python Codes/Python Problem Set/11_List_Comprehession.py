'''
Input:
1  x
1  y
1  z
2  n

Output: 
[0,0,0],[0,0,1],[1,0,0],[0,1,0],[1,1,1]
'''


if __name__ == '__main__':
    x = int(input())
    y = int(input())
    z = int(input())
    n = int(input())
    l=list()
    for i in range(x+1):
        for j in range(y+1):
            for k in range(z+1):
                if (i+j+k != n):
                    l.append([i,j,k])
    print(l)
    
#Dictionary Looping

calories={'apple':52,'Banana':100,'mango':75}
for k,v in calories.items():
    print(k) if v>80 else None

#List Comprehension
 
l =[("Hi "+x)for x in ['kp','Sp','pp']]
print(l)

l2=[x+y for x in range(3) for y in range(3) if x==y]
print(l2)


l3=[]
for x in l :
    if l[1] in x:
        l3.append(x)
print(l3)

l3= [x for x in l if 'p'in x] #By using list comprehension
print(l3)

l4=[x if x!= "Hi kp" else "kalpesh" for x in l3 ]
print(l4)

l4[1:3]=["Suraj","Durgesh"]#List Modified
print(l4)


#Set comprehension 
square ={x**2 for x in [1,2,3,4] if x<3}
print(square)