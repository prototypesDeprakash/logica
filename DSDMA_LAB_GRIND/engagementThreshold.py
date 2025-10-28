import pandas as pd

data ={
    "Customer":["A","B","C","D"],
    "Subscription":["1 month pack","3 month pack","2.5 month pack","4 month pack"],
    "Engagement":[20,34,65,76]
}

df = pd.DataFrame(data)
df['childs']=[1,2,5,3] # add column , simple as that
print(df)
higher_engagement = df.query("Engagement > 50")
print(higher_engagement)

print(df[df['Engagement']>70])