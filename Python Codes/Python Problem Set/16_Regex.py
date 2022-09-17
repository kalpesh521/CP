import re #Regex Regular Expression 
from re import IGNORECASE, split
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

#Compile => Case Sensetive
mystr="India won the match by 25 runs. and ranked_2 in ICC."
p=re.compile('[a-e]')
q=re.compile('\d')  # return 0-9 individual value
r=re.compile('\d+') # return value in one or group
s=re.compile('\w')  # return 0-9 a-z A-Z individual value
t=re.compile('\w+') # return alphabet and digit 
a=re.compile('\W+') # return except alphabet and digit
print(p.findall(mystr))
print(q.findall(mystr))
print(r.findall(mystr))
print(s.findall(mystr))
print(t.findall(mystr))
print(a.findall(mystr))

#split()
print(split('\D+', 'On 12th Jan 2016, at 11:02 AM'))

#sub()
str2="Suraj buys subji"
print(re.sub('su','*/',str2))
print(re.subn('su','*/',str2))

#subn()
print(re.sub('su','*/',str2,count=1,flags=IGNORECASE))
tn=(re.subn('su','*/',str2,flags=re.IGNORECASE))
print(tn)
print(len(tn))
print(tn[0])


regex= r"([a-zA-Z]+)(\d+))"
match1=re.search(regex,"My Birthdate is Feb 5")
if match1 !=None:
    print("The Birthdate is %s"%(match1.start(),match1.end()))
    print("Thre birthdate is %s" %(match1.group(0)))
    print("The month is %s"%(match1.group(1)))
    print("The date is %s"%(match1.group(2)))
 
else:
    print ("The regex pattern does not match.")
