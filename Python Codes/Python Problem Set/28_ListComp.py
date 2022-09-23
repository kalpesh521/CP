div=[i for i in range(1,50) if i%3==0]
print(div)

#dictionary comprehension
dict1={i:f"items {i}"  for i in range(1,100) if i%10==0}

dict2={value:key for key,value in dict1.items()}
print(dict2)

#Set Comprehension
dresses= {dress  for dress in ("dress1","dress2","dress2","dress1")}
print(type(dresses))