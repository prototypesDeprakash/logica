import pandas as pd
import matplotlib.pyplot as plt

data ={
    "campain":["prakash","cowshik","jais"],
    "Impression":[99,32,53]
}
df = pd.DataFrame(data)
plt.bar(df['campain'],df['Impression'],color="blue")
plt.show()
print(df)