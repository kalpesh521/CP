class Student:
    school='DYPCOE'
    
    def __init__(self,m1,m2,m3) :
        self.m1=m1
        self.m2=m2
        self.m3=m3
        
    def avg(self):#Instance Method
        return(self.m1+self.m2+self.m3)/3
    
    '''getMethod =accessor
       setmethod =Mutator
    '''
    @classmethod
    def sch(cls): #class Method
        return cls.school
    
    @staticmethod
    def info():#Static method 
        print("this is Static Method")
s1=Student(78,56,89)
s2=Student(79,96,79)

print(s1.avg())
print(Student.sch())
Student.info()