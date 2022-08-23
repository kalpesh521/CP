from unittest import result


def add_sub(x,y):
    c=x+y
    d=x-y
    return c,d
result1,result2 =add_sub(5,2)
print(result1,result2)
print(add_sub(4,2))

#Keyword Argument
def stud (name,age):
    print(age)
    print(name)
stud(age=21,name="kp")

#Default Argument
def stud (name,age=18):
    print(age)
    print(name)
stud("kalpesh")
#Variable Length Argument
def sum (a,*b):
    print(a)
    print(b)
    c=a
    for i in b:
        c+=i
    print(c)

sum(2,3,6,8)

#keyword Variable Length Argument

def key(name,**data):
    print(name)
    print(data)
    for i,j in data.items():
        print(i,j)
        
key('Ram',age=23,Loc="Pune",Mob=3232324121)

#Global and Local Variable function

a =5
def glob():
    global a
    a =3
    print(a)
    globals() ['a']=12

glob()
print(a)