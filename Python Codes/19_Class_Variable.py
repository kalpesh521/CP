class Car:
    
    wheel=4
    def __init__(self):
        self.mil=10
        self.name="Audi"
c1=Car()
c2=Car()
Car.wheel=2
c1.mil=8
print(c1.mil,c1.name,c1.wheel)
print(c2.mil,c2.name,c2.wheel)