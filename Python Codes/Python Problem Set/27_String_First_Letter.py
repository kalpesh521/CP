 
#method 1
str="Salad is healthy snack"
def word(str):
    for i in str.split():
        if i[0]=='s' or i[0]=='S':
            print(i)
word(str)

# Method 2
print('\n'.join(list(filter(lambda x :x.lower().startswith("s"),str.split()))))

# method 3
import re
p="s[^ ]+|S[^ ]+"
res=re.findall(p,str)
print('\n'.join(res))