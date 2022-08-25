class computer:
    def __init__(self,cpu,ram): #init automatically print without calling
        self.cpu=cpu
        self.ram =ram
    def config(self):
        print("Config is",self.cpu,self.ram)
com1=computer("I5",8) #Object Creation
com2=computer("I7",16)

com1.config()
com2.config()