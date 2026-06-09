import requests

'''  
r = requests.get('https://imgs.xkcd.com/comics/python.png')

with open('comic.png','wb')as f:
    f.write(r.content)   
'''

payload={'page':2,'count':25}
r=requests.get('https://httpbin.org/get',params=payload)
print(r.text)