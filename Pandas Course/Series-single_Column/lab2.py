import pandas as pd
import matplotlib.pyplot as plt

data ={"Month":["Jan","feb","mar","arp","May"],
       "Madhan Gowri Subs":[1022,1345,2445,2345,5646],
       "Madhan Gowri Views ":[4934,4356,6765,7455,7565],
       "Tech Busters Subs":[6788,8668,9909,7567,9775],
       "Tech Busters Views":[5467,4643,3477,4352,2526]
       }

df= pd.DataFrame(data)
print(df)
plt.figure(figsize=(8, 5))
plt.plot(df["Month"], df["Madhan Gowri Subs"], marker='o', label="Madhan Gowri Subs")
plt.plot(df["Month"], df["Tech Busters Subs"], marker='o', label="Tech Busters Subs")

plt.title("YouTube Subscriber Trends Over Time")
plt.xlabel("Month")
plt.ylabel("Subscribers")
plt.legend()
plt.grid(True)
plt.show()