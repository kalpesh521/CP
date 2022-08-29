
class A:
    def feature1(self):
        print("Feature 1")
    def feature2(self):
        print("Feature 2")
class B(A):#Single Inheritence
    def feature3(self):
        print("Feature 3")
    def feature4(self):
        print("Feature 4")
class C(B):#Multilevel Inheritence
    def feature5(self):
        print("Feature 5")
class D: 
    def feature6(self):
        print("Feature 6")
class E(A,D):#Multiple Inheritence
    def feature7(self):
        print("Feature 7")
a1=A()
b1=B()
c1=C()
d1=D()
e1=E()
a1.feature1()
a1.feature2()
