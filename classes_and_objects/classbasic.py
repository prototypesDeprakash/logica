
class pen:
    def __init__(self,color):
        self.color =color
    def get_color(self):
        return self.color
pen1 = pen("red")
pen2 = pen("blue")

print(pen1.get_color())
print(pen2.get_color())