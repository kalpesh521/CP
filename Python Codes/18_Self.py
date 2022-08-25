class Computer:
    def __init__(self) :
        self.name="Virat"
        self.age="28"
    def  compare(self,other):
        if self.age==other.age:
            return True
        else:
            return False
        

c1=Computer()
c2=Computer()
c1.age=30
if c1.compare(c2):
    print("They  are same")
else:
    print('They are different')