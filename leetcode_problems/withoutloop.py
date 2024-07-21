
x = 0

def loop(x,n):

    print(x)
    if(x!=n):
        loop(x+1,n)
    else:
        exit()


loop(1,5)