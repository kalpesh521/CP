def div(a,b):
    return a/b

def smart_div(func):
    def inner(a,b):
        a,b =b,a
        return func(a,b)
    return inner
div=smart_div(div)
print(div(2,4))