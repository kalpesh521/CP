a=5
b=2
try:
    print("Resource Open")
    print(a/b)
    k=int(input("Enter your input"))
except ZeroDivisionError as e:
    print("Hey,you cannot divide as zero")
except ValueError as e:
    print("Invalid Input")
except Exception as e:
    print("Something Wrong")
finally :
    print("Resource Closed")
