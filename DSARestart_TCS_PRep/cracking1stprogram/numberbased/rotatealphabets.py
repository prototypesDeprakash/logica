a = '''<!-- ABGR: Wnpx - grzcbenel olcnff: hfr urnqre "K-Qri-Npprff: lrf" -->'''
res=""
for c in a:
        if 'a' <= c <= 'z':
            res+=(chr((ord(c) - ord('a') + 13) % 26 + ord('a')))
        elif 'A' <= c <= 'Z':
            res+=(chr((ord(c) - ord('A') + 13) % 26 + ord('A')))
        else:
            res+=(c)
print(res)
