class A:
    def __init__(self) :
         print("init in A")
    def feature1(self):
        print("Feature 1")
    def feature2(self):
        print("Feature 2")
# class B(A): 
class B: 
    def __init__(self) :
        super().__init__()  #super method access super class  in case of inheritence
        print("init in B")
    def feature3(self):
        print("Feature 3")
    def feature4(self):
        print("Feature 4")
class C(A,B): 
    def feature5(self):
        print("Feature 5")
a1=C()