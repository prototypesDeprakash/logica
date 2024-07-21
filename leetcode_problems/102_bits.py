n = 14
k = 13
bin_n = bin(n)[2:]
bin_k = bin(k)[2:]
        
     
max_len = max(len(bin_n), len(bin_k))
bin_n = bin_n.zfill(max_len)
bin_k = bin_k.zfill(max_len)
c=0
for i in range(max_len):
    if(bin_n[i]=='1' and bin_k[i]=='0'):
        c+=1
    elif (bin_k[i] == '1' and bin_n[i] == '0'):
        return -1

return c



c=0
diff=0

