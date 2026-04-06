n=100

def sumulateHappysad(n):
    happy=float(n)
    sad=float(0)
    for i in range(0,4):
        newhappy=0.3*happy+0.5*sad
        newsad=0.7*happy+0.5*sad
        happy=newhappy
        sad=newsad
    print(happy)
    print(sad)
sumulateHappysad(n)
