
list1=[]
n=int(input())
list1=list(map(int,input().split()))
#list2=int(list1)
def large(list1):
    length =len(list1)
    list2=set(list1)
    sorted(list2)
    print(list2[length-2])
    
 
large(list1)