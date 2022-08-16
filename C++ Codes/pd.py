import pandas as pd
dict1={
    "Name":['Virat','  Kalpesh','Rohit','Pant'],
    "marks":[80,90,82,88],
    "city":['Bangalore','Jalgaon','Mumbai','Delhi']
}

df=pd.DataFrame(dict1)
print(df)
print(df.tail(2))


