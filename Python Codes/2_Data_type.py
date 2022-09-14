#List ,tuple ,set and Dictionary

#%%
nums=[12,4,5,67,8,3]
nums.append(1)
nums.insert(3,35)
nums.remove(8)
nums.pop(4)
nums.pop()
del nums[2:]
nums.extend([4,6,8,9])
print(max(nums))
print(min(nums))
print(sum(nums))
nums.sort()
nums.reverse()
print(nums)

#Dictionary


#Merge List to Dictionary
keys=[1,2,3,4]
values=['one','two','three','four']
data=dict(zip(keys,values))
print(data)
print(data[3])
data[5]='Five'
del data[2]
print(data)