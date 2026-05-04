numar = int(input())
duar = int(input())
no_of_attacks=0
while(numar>0 and duar>0):
    if(numar>=duar):
        numar-=duar
        no_of_attacks+=1
    else:
        duar-=numar
        no_of_attacks+=1
print(no_of_attacks)
    
