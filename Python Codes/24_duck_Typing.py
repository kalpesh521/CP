class pycharm:
    def execute(self):
        print("Compiling")
class MyEditor:
    def execute(self):
        print("running")
class Laptop:
    def code(self,ide):
        ide.execute()
ide=pycharm()
ide=MyEditor()
l1=Laptop()
l1.code(ide)