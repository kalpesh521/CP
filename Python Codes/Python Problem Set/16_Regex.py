import re #Regex Regular Expression 
import calendar
def spy_game(l):
    l=[str(i) for i in l]
    return True if '007' in ("".join(l)) else False
l=[1,2,0,0,7,4]
print(spy_game(l))

#Method 2  Using regex
def spy_game(l): #\d = digit
    return bool(re.search(r'\d*0\d*0\d*7\d*',"".join(map(str,l))))
print(spy_game(l))

m,y=8,2022
cal =calendar.month(y,m)
print(cal)

# To find digits in string

str2=("My Roll no is 138")
regex='\d+'
match=re.findall(regex,str2)
print(match)