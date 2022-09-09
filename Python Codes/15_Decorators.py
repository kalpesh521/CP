#decorators : Modify the behavior of function possible only in python language
#because python is functional language

def div(a,b):
    return a/b

def smart_div(func):
    def inner(a,b):
        a,b =b,a #swap a and b
        return func(a,b)
    return inner
div=smart_div(div)
print(div(2,4))

def my_decorators(fn):
    def inner():
        fn()
        print("How are you ?")
    return inner

@my_decorators
def id():
    print("Kalpesh,",end =" ")
id()