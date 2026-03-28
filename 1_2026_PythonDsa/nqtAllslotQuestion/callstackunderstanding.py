def f(n):
    print("Enter", n)

    if n == 0:
        print("Return from", n)
        return

    f(n - 1)

    print("Back to", n)


def print1ton(i):
    if(i>=10):
        return
    print("increment 1")
    print(i)
    print1ton(i+1)

    print("Increment 2")
    print(i)
    print1ton(i+2)
print1ton(0)




'''
f(2)-> happens
f(2) -> pauses
f(1) -> happens
f(1) -> pauses
f(0) -> happens
f(0) -> returns
f(1) -> continues
f(2) -> continues
'''

