lst=[4,3,21,2]
print(sorted(lst,key=lambda x:0 if x==21 else x))
from math import pi 
r=int(input("Enter radius \n"))
print("The area of circle having radius " +str(r)+ " is " + str(pi*r**2))
