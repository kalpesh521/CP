


class Student:
    def __init__(self,name,runs):
        self.name=name
        self.runs=runs
        self.lap=self.laptop()
        
    def show(self):
        print(self.name,self.runs)
        self.lap.show()
    
    class laptop:
        def __init__(self) :
            self.cpu=8;
            self.brand='HP'
            self.disk='ssd'
        def show(self):
            print(self.brand,self.cpu,self.disk)
            
s1=Student('kp',34)
s2=Student('sp',14)
s1.show()