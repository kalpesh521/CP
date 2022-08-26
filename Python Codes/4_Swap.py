a=5
b=6

# temp =a
# a=b
# b=temp

#a,b=b,a

# a=a+b  #11  It utilies one more bit
# b=a-b  #5
# a=a-b  #6

a=a^b   #XOR 3 bits output
b=a^b  
a=a^b  

print(a)
print(b)