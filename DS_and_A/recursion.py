def pri(x):
    if(x!=10):
        print(x)
        x+=1
        pri(x)
    if(x==9):
        pri(x=10)
    else:
        exit

pri(1)