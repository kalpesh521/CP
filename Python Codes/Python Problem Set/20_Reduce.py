
from functools import reduce
print(reduce(lambda a,b:a*b ,lst))
print(reduce(lambda a,b:a+b ,lst))

print(reduce(lambda a,b:a if a>b else b,lst))