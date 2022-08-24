import turtle
s=turtle.getscreen()
t=turtle.Turtle()
turtle.bgcolor("black")
t.speed(0)
temp=1
clrlist=["red","green","blue"]
for i in range(400):
    t.color(clrlist[i&3])
    t.forward(temp)
    t.left(120)
    t.left(1)
    temp=temp+1
turtle.mainloop()#C:\Users\Admin\AppData\Local\Programs\Python\Python310\Lib