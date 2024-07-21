i=0
def printer(N):
    if(N>0):
        printer(N-1)
        print(N)
printer(10)
