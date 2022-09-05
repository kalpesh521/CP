#Method 1
list1=[]
n=int(input())
list1=list(map(int,input().split()))#string to int input 
def large(list1):
    length =len(list1)
    list1.sort()
    print(list1[length-2])
large(list1)

#Method 2
n = int(input())
arr =list(map(int, input().split()))
a=max(arr)
c=arr.count(a)
for i in range(c):
    arr.remove(a)
print(max(arr))
